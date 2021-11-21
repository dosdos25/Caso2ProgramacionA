/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Clases.Cliente;
import Logica.LogCliente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 16/11/2021
 * @author djaramillo
 * @clase de administración del CLIENTE
 **/
public class ADMCliente {
    LogCliente objLogCliente = new LogCliente();
    public  void RegistrarCliente() throws IOException {
        //variables entrada
        String cedula = "1750406702";
        String nombres = "Cristian";
        String mail = "cvallauca@gmail.com";
        // instanciar el cliente
        Cliente objCliente = new Cliente(cedula,nombres,mail);
        // validación en el nivel logica
        if (objLogCliente.CrearCliente(objCliente))
            System.out.println("cliente creado");
        else
            System.out.println("error en la cedula");
        
    }

    void AgregarCliente() {
        String cedula = "2154785369";
        String nombres = "Juan";
        String mail = "jllanez@hotmail.com";
        // instanciar el cliente
        Cliente objCliente = new Cliente(cedula,nombres,mail);
        // validación en el nivel logica
        if (objLogCliente.AgregarCliente(objCliente))
            System.out.println("cliente agregadado");
        else
            System.out.println("error en la cedula");
    }

    void ListarCliente() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        objLogCliente.ConsultarClientes(ArrayClientes);
        for (Cliente objCli : ArrayClientes)
            System.out.println(objCli.toString());
    }
}
