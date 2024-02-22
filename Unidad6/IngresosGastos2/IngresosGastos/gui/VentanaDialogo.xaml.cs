using IngresosGastos.dto;
using IngresosGastos.logica;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace IngresosGastos.gui
{
    /// <summary>
    /// Lógica de interacción para VentanaDialogo.xaml
    /// </summary>
    public partial class VentanaDialogo : Window
    {
        private LogicaNegocio logicaNegocio;
        private int posicion;

        public VentanaDialogo(LogicaNegocio logicaNegocio)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            BInsertar.Content = "Insertar";

        }

        public VentanaDialogo(LogicaNegocio logicaNegocio, IngresoGasto ingresoGasto, int posicion)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            DPFecha.SelectedDate = ingresoGasto.Fecha;
            this.posicion = posicion;
            TBConcepto.Text = ingresoGasto.Concepto;

            if (ingresoGasto.Ingreso != 0)
                TBImporte.Text = Convert.ToString(ingresoGasto.Ingreso);
            else
                TBImporte.Text = Convert.ToString(ingresoGasto.Gasto);
            BInsertar.Content = "Modificar";

        }
        private void BInsertar_Click(object sender, RoutedEventArgs e)
        {
            //Validamos los campos
            String mensaje = "Los siguientes campos son obligatorios:";
            if (DPFecha.SelectedDate == null)
            {
                mensaje = mensaje + " Fecha";
            }
            if (TBConcepto.Text == String.Empty)
            {
                if (mensaje != "Los siguientes campos son obligatorios:")
                    mensaje = mensaje + ", Concepto";
                else
                    mensaje = mensaje + " Concepto";
            }
            if (TBImporte.Text == String.Empty)
            {
                if (mensaje != "Los siguientes campos son obligatorios:")
                    mensaje = mensaje + ", Importe";
                else
                    mensaje = mensaje + " Importe";
            }
            //comprobamos validación
            if (mensaje == "Los siguientes campos son obligatorios:") //se validaron los campos correctamente
            {
                //en caso de que el botón sea de modificación o de Inserción
                if ((String)(BInsertar.Content) == "Insertar")
                {
                    logicaNegocio.aniadirIngresoGasto(new IngresoGasto(DPFecha.SelectedDate.Value, TBConcepto.Text, Convert.ToDouble(TBImporte.Text)));
                }
                else
                {
                    logicaNegocio.modificarIngresoGasto(new IngresoGasto(DPFecha.SelectedDate.Value, TBConcepto.Text, Convert.ToDouble(TBImporte.Text)), posicion);
                }
                this.Close();
            }
            else LBError.Content = mensaje; //no se validaron los campos correctamente
        }

        private void BCancelar_Click(object sender, RoutedEventArgs e)
        {
            //se cancela - Cierra la ventana
            this.Close();
        }


    }
}
