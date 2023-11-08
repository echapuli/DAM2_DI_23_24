/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentetemporizador;

import java.awt.Color;
import java.io.File;
import java.io.Serializable;

/**
 *
 * @author eduardo
 */
public class JpanelTemporalizadorPropiedades implements Serializable{
    //propiedades del componente
    private double numSegundos;  //Número de segundos para la cuenta atrás
    private String textoFin;  //Texto que mostrará al finalizar
    private Color colorFin;   //color que mostrará al finalizar
    private boolean mostrarDecimales;  //Nos indicará si mostramos o no decimales
    private File imagen;      //Imagen que mostrará al finalizar    

    public JpanelTemporalizadorPropiedades(double numSegundos, String textoFin, Color colorFin, boolean mostrarDecimales, String imagen) {
        this.numSegundos = numSegundos;
        this.textoFin = textoFin;
        this.colorFin = colorFin;
        this.mostrarDecimales = mostrarDecimales;
        this.imagen = new File(imagen);
    }

    public double getNumSegundos() {
        return numSegundos;
    }

    public void setNumSegundos(double numSegundos) {
        this.numSegundos = numSegundos;
    }

    public String getTextoFin() {
        return textoFin;
    }

    public void setTextoFin(String textoFin) {
        this.textoFin = textoFin;
    }

    public Color getColorFin() {
        return colorFin;
    }

    public void setColorFin(Color colorFin) {
        this.colorFin = colorFin;
    }

    public boolean isMostrarDecimales() {
        return mostrarDecimales;
    }

    public void setMostrarDecimales(boolean mostrarDecimales) {
        this.mostrarDecimales = mostrarDecimales;
    }

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }
    
}
