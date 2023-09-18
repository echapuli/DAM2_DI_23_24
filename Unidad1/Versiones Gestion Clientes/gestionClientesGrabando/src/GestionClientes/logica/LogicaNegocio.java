/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionClientes.logica;

import GestionClientes.dto.Cliente;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class LogicaNegocio {
    private static List<Cliente> listaClientes = new ArrayList<>();
    public static void anadirCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }    
    
    public static boolean cargarTabla(File archivo){
        try {
            // Se abre el fichero original para lectura
            FileInputStream fileInput = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fileInput);
            // Se lee el primer objeto
            Cliente cliente = (Cliente) ois.readObject();

            // Mientras haya objetos
            while (cliente!=null)
            {
                if (cliente instanceof Cliente)
                    anadirCliente(cliente);  // Se añade el objeto cliente
                cliente = (Cliente) ois.readObject();
            }
            ois.close();		

	} catch (Exception e){
            return false;
	} finally {
            return true;
        }
    }
    
    public static boolean salvarTabla(File archivo){
        try {
            // Se abre el fichero original para lectura
            FileOutputStream fileOutput = new FileOutputStream(archivo);
            ObjectOutputStream ous = new ObjectOutputStream(fileOutput);
            for (Cliente cliente:listaClientes){
                ous.writeObject(cliente);
            }
            ous.close();		
	} catch (Exception e){
            return false;
	} finally {
            return true;
        }
    }    
}
