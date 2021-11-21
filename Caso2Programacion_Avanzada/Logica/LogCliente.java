/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import AdmArchivos.ArchClienteBin;
import Clases.Cliente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 16/11/2021
 * @author djaramillo
 * @clase para la logica del CLIENTE
 **/
public class LogCliente {
    ArchClienteBin objArchCliente = new ArchClienteBin();
    public boolean CrearCliente(Cliente objCliente) throws IOException {
        //si no existe archivo lo crea o lo encera
        if (objCliente.getCedula().length() < 10){
            //System.out.println("cedula incorrecta");
                    // no es posible hacer en esta capa
            return false;
        }
        objArchCliente.GrabarUnClienteBin(objCliente);
        return true;
    }

    public boolean AgregarCliente(Cliente objCliente) {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
                
        //agregar en el archivo lo
        if (objCliente.getCedula().length() < 10)
                    // no es posible hacer en esta capa
                    //System.out.println("");
            return false;
        ArrayClientes.add(objCliente);
        objArchCliente.AddClienteBin(ArrayClientes);
        return true;
    }

    public void ConsultarClientes(ArrayList<Cliente> ArrayClientes) 
            throws IOException, FileNotFoundException, ClassNotFoundException {
        objArchCliente.ImportarClienteBin(ArrayClientes);
    }

    public Cliente BuscarCliente(String cedula) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        objArchCliente.ImportarClienteBin(ArrayClientes);
        Cliente objaux = new Cliente();
        for (Cliente objCli : ArrayClientes)
            if (objCli.getCedula().equals(cedula))
                return objCli;
        return objaux;
        
    }
    
}
