/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario.gui.tablemodel;

import horario.dto.Hora;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eduar
 */
public class TableModelHoras extends AbstractTableModel {

    private List<Hora> listaHoras;
    private String[] cabeceras = {"Dia", "Hora", "Módulo", "Fecha Alta", "Hora Alta"};

    public TableModelHoras(List<Hora> listaHoras) {
        this.listaHoras = listaHoras;
    }

    @Override
    //método que devuelve el número de elementos de la lista
    public int getRowCount() {
        return listaHoras.size();
    }

    @Override
    //método que devuelve el número de columnas de la tabla
    public int getColumnCount() {
        return cabeceras.length;
    }

    @Override
    //metodo que devuelve el nombre de la columna
    public String getColumnName(int i) {
        return cabeceras[i];
    }
    
    @Override
    //método que devuelve el elemento en la posición (fila,columna)
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaHoras.get(rowIndex).diaNombre();
            case 1:
                return listaHoras.get(rowIndex).horaNombre();
            case 2:
                return listaHoras.get(rowIndex).getModulo();
            case 3:
                return listaHoras.get(rowIndex).getDiaAlta();
            case 4:
                return listaHoras.get(rowIndex).getHoraAlta();
        }
        return null;
    }

    //creamos este método que borra una entrada en la tabla
    public void deleteRow(int row) {
        if (!(listaHoras.size() == 0)) {
            listaHoras.remove(row);         //borra la fila
            //fireTableRowsDeleted(row, row);    //Notifica a todos los listeners que las filas dentro del rango [firstRow, lastRow], inclusive, han sido eliminadas
            fireTableDataChanged();  //Notifica a todos los listeners que el valor de la tabla ha cambiado (con esto saltan las acciones necesarias como repintar la tabla
        }
    }

    public void refrescar() {
        fireTableDataChanged();  //Notifica a todos los listeners que el valor de la tabla ha cambiado (con esto saltan las acciones necesarias como repintar la tabla
    }

}
