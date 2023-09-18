/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionClientes.gui.tablaModels;

import GestionClientes.dto.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author eduar
 */
public class ClientesTablaModel extends AbstractTableModel{
    private List<Cliente> listaClientes;
    private String[] cabeceras={"Nombre","Apelliodos","Fecha","Provincia"};
    public ClientesTablaModel(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
      return cabeceras.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      switch (columnIndex){
          case 0: return listaClientes.get(rowIndex).getNombre();
          case 1: return listaClientes.get(rowIndex).getApellidos();
          case 2: return listaClientes.get(rowIndex).getFecha();
          case 3: return listaClientes.get(rowIndex).getProvincia();

        }
      
      return null;
    }  

    @Override
    public String getColumnName(int i) {
        return cabeceras[i];
    }

   public void deleteRow(int row) {
      if (!(listaClientes.size()==0)) {
         listaClientes.remove(row);         //borra la fila
         fireTableRowsDeleted(row, row);    //Notifica a todos los listeners que las filas dentro del rango [firstRow, lastRow], inclusive, han sido eliminadas
      }
   }    
   
    public void refrescar() {
      fireTableDataChanged();  //Notifica a todos los listeners que el valor de todas las celdas en la tabla, pueden haber cambiado
   }    
}
