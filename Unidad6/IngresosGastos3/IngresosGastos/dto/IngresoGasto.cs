using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IngresosGastos.dto
{
    public class IngresoGasto : ICloneable
    {
        public IngresoGasto(DateTime fecha, String concepto, double importe)
        {
            Fecha = fecha;
            Concepto = concepto;
            if (importe < 0)
            {
                Gasto = importe;
            }
            else
            {
                Ingreso = importe;
            }
        }

        public IngresoGasto()
        {
            Fecha = DateTime.Now;
        }

        public DateTime Fecha { get; set; }

        public string Concepto { get; set; }

        public double Ingreso { get; set; }

        public double Gasto { get; set; }

        public object Clone()
        {
            return this.MemberwiseClone();
        }
    }
}
