/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentetemporizador;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author eduardo
 */
public class JpanelTemporalizadorPropertyEditorSupport extends PropertyEditorSupport{
    private JpanelTemporalizadorPanel panel=new JpanelTemporalizadorPanel();
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return panel;
    }

    @Override
    public String getJavaInitializationString() {
        return "new componentetemporizador.JpanelTemporalizadorPropiedades("+Double.toString(panel.devolverValores().getNumSegundos())+",\""+panel.devolverValores().getTextoFin()+"\",new Color("+panel.devolverValores().getColorFin().getRGB()+"),"+panel.devolverValores().isMostrarDecimales()+",\""+panel.devolverValores().getImagen().getAbsolutePath().replace("\\", "\\\\")+"\")";
    }


    @Override
    public Object getValue() {
        return panel.devolverValores();
    }
    
}
