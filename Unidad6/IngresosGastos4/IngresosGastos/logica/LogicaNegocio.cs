using IngresosGastos.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IngresosGastos.logica
{
    public class LogicaNegocio
    {
        public ObservableCollection<IngresoGasto> ListaIngresosGastos { get; set; }

        public LogicaNegocio()
        {
            ListaIngresosGastos = new ObservableCollection<IngresoGasto>();
        }

        public void aniadirIngresoGasto(IngresoGasto ingresoGasto)
        {
            ListaIngresosGastos.Add(ingresoGasto);
        }

        public void modificarIngresoGasto(IngresoGasto ingresoGasto, int posicion)
        {
            ListaIngresosGastos.ElementAt(posicion).Fecha = ingresoGasto.Fecha;
            ListaIngresosGastos.ElementAt(posicion).Concepto = ingresoGasto.Concepto;
            ListaIngresosGastos.ElementAt(posicion).Importe = ingresoGasto.Importe;
        }

        public void borrarIngresoGasto(IngresoGasto ingresoGasto, int posicion)
        {
            ListaIngresosGastos.RemoveAt(posicion);
        }
    }
}
