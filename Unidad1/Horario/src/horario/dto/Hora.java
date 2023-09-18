/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author eduar
 */
public class Hora {

    private String dia;
    private String hora;
    private String modulo;
    private String diaAlta;
    private String horaAlta;

    public Hora(String dia, String hora, String modulo, Date fecha) {
        SimpleDateFormat fFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fHora = new SimpleDateFormat("HH:mm");
        this.dia = dia;
        this.hora = hora;
        this.modulo = modulo;
        this.diaAlta = fFecha.format(fecha);
        this.horaAlta = fHora.format(fecha);
    }

    public Hora(String dia, String hora, String modulo, String diaAlta, String horaAlta) {
        this.dia = dia;
        this.hora = hora;
        this.modulo = modulo;
        this.diaAlta = diaAlta;
        this.horaAlta = horaAlta;
    }

    public String getDiaAlta() {
        return diaAlta;
    }

    public void setDiaAlta(String diaAlta) {
        this.diaAlta = diaAlta;
    }

    public String getHoraAlta() {
        return horaAlta;
    }

    public void setHoraAlta(String horaAlta) {
        this.horaAlta = horaAlta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String[] contactoArray() {
        String[] hora = new String[3];
        hora[0] = dia;
        hora[1] = this.hora;
        hora[2] = modulo;
        return hora;
    }

    public String horaNombre() {
        switch (hora){
            case "1": return "8:25 9:20";
            case "2": return "9:20 10:15";
            case "3": return "10:15 11:10";
            case "4": return "11:40 12:35";
            case "5": return "12:35 13:30";
            case "6": return "13:30 14:25";
        }
        return null;
    }

    public String diaNombre() {
        switch (dia){
            case "1": return "Lunes";
            case "2": return "Martes";
            case "3": return "Miércoles";
            case "4": return "Jueves";
            case "5": return "Viernes";
        }
        return null;
    }

    public String lineaFichero() {
        return dia + ';' + hora + ';' + modulo + ';' + diaAlta + ';' + horaAlta;
    }

}
