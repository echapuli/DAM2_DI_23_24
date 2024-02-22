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
        public IngresoGasto ingresoGasto;
        private int posicion;

        //variable contador de errores en panatalla
        private int contErrores = 0;
        //variables que validad que vienen los campos obligatorios
        private Boolean hayFecha = true;
        private Boolean hayConcepto = true;
        private Boolean hayImporte = true;

        public VentanaDialogo(LogicaNegocio logicaNegocio)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            ingresoGasto = new IngresoGasto();
            this.DataContext = ingresoGasto;
            BInsertar.Content = "Insertar";

        }

        public VentanaDialogo(LogicaNegocio logicaNegocio, int posicion)
        {
            InitializeComponent();
            this.logicaNegocio = logicaNegocio;
            this.ingresoGasto = (IngresoGasto)((IngresoGasto)logicaNegocio.ListaIngresosGastos.ElementAt(posicion)).Clone();
            this.DataContext = ingresoGasto;
            this.posicion = posicion;
            BInsertar.Content = "Modificar";

        }
        private void BInsertar_Click(object sender, RoutedEventArgs e)
        {

            //en caso de que el botón sea de modificación o de Inserción

            if ((String)(BInsertar.Content) == "Insertar")
            {
                logicaNegocio.aniadirIngresoGasto(ingresoGasto);
            }
            else
            {
                logicaNegocio.modificarIngresoGasto(ingresoGasto, posicion);
            }
            this.Close();

        }

        private void BCancelar_Click(object sender, RoutedEventArgs e)
        {
            //se cancela - Cierra la ventana
            this.Close();
        }

        private void ValidarError(object sender, ValidationErrorEventArgs e)
        {
            FrameworkElement feSource = e.Source as FrameworkElement;
            if (e.Action == ValidationErrorEventAction.Added)
            {  //si se añadio un error
                contErrores++;

                switch (feSource.Name)
                {
                    case "DPFecha":
                        hayFecha = false;
                        break;
                    case "TBConcepto":
                        hayConcepto = false;
                        break;
                    case "TBImporte":
                        hayImporte = false;
                        break;
                }
            }
            else
            {//en caso contrario resto el error
                contErrores--;
                switch (feSource.Name)
                {
                    case "DPFecha":
                        hayFecha = true;
                        break;
                    case "TBConcepto":
                        hayConcepto = true;
                        break;
                    case "TBImporte":
                        hayImporte = true;
                        break;
                }
            }

            String mensaje = "Los siguientes campos son obligatorios:";
            if (!hayFecha)
            {
                mensaje = mensaje + " Fecha";
            }
            if (!hayConcepto)
            {
                if (mensaje != "Los siguientes campos son obligatorios:")
                    mensaje = mensaje + ", Concepto";
                else
                    mensaje = mensaje + " Concepto";
            }
            if (!hayImporte)
            {
                if (mensaje != "Los siguientes campos son obligatorios:")
                    mensaje = mensaje + ", Importe";
                else
                    mensaje = mensaje + " Importe";
            }
            //comprobamos validación
            if (mensaje != "Los siguientes campos son obligatorios:") //no se validaron los campos correctamente
                LBError.Content = mensaje; //no se validaron los campos correctamente
            else
                LBError.Content = ""; //se validaron los campos correctamente

            //si hay errores deshabilita el boton de insertar o modificar y en caso contrario lo habilita
            if (contErrores == 0) BInsertar.IsEnabled = true;
            else BInsertar.IsEnabled = false;
        }
    }
}
