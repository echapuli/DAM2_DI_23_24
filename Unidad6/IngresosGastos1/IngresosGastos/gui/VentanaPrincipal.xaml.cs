﻿using IngresosGastos.dto;
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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace IngresosGastos
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class VentanaPrincipal : Window
    {
        private LogicaNegocio logicaNegocio;
        public VentanaPrincipal()
        {
            InitializeComponent();
            logicaNegocio = new LogicaNegocio();
            this.DataContext = logicaNegocio;
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
                LBError.Content = "";
                //en caso de que el botón sea de modificación o de Inserción
                if ((String)(BInsertar.Content) == "Insertar")
                {
                    logicaNegocio.aniadirIngresoGasto(new IngresoGasto(DPFecha.SelectedDate.Value, TBConcepto.Text, Convert.ToDouble(TBImporte.Text)));
                }
                else
                {
                    logicaNegocio.modificarIngresoGasto(new IngresoGasto(DPFecha.SelectedDate.Value, TBConcepto.Text, Convert.ToDouble(TBImporte.Text)), DataGridIngresosoGastos.SelectedIndex);
                }
                borrarCampos();
            }
            else LBError.Content = mensaje; //no se validaron los campos correctamente
        }

        private void borrarCampos()
        {
            //Despues de una modificación, inserción o cancelación se borran los campos y, en caso de ser una modificación o al camcelar una
            //modificación se oculta el botón cancelar (el botón cancelar es para cancelar las modificaciones)
            //
            DPFecha.SelectedDate = null;
            TBConcepto.Text = "";
            TBImporte.Text = "";
            BCancelar.Visibility = Visibility.Hidden;
            BInsertar.Content = "Insertar";
            BCancelar.Visibility = Visibility.Hidden;
        }

        private void BCancelar_Click(object sender, RoutedEventArgs e)
        {
            //se cancela la modificación borrándose los campos y ocultando el botón cancelar y modificando el botón de Modificar a Insertar
            borrarCampos();
        }

        private void DataGridIngresosoGastos_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {
            //se entraria en modo modificación, al hacer doble click sobre una fila del DataGrid, en caso de que no se seleccione ninguna fila (caso de que este vacia) no hace nada
            if (DataGridIngresosoGastos.SelectedItem != null)
            {
                DPFecha.SelectedDate = ((IngresoGasto)DataGridIngresosoGastos.SelectedItem).Fecha;
                TBConcepto.Text = ((IngresoGasto)DataGridIngresosoGastos.SelectedItem).Concepto;

                if (((IngresoGasto)DataGridIngresosoGastos.SelectedItem).Ingreso != 0)
                    TBImporte.Text = Convert.ToString(((IngresoGasto)DataGridIngresosoGastos.SelectedItem).Ingreso);
                else
                    TBImporte.Text = Convert.ToString(((IngresoGasto)DataGridIngresosoGastos.SelectedItem).Gasto);

                BCancelar.Visibility = Visibility.Visible;
                BInsertar.Content = "Modificar";
            }

        }
    }
}
