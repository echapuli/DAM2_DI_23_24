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
            if (e.Action == ValidationErrorEventAction.Added)  //si se añadio un error
                contErrores++;
            else //en caso contrario resto el error
                contErrores--;
            //si hay errores deshabilita el boton de insertar o modificar y en caso contrario lo habilita
            if (contErrores == 0) BInsertar.IsEnabled = true;
            else BInsertar.IsEnabled = false;
        }
    }
}
