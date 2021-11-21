package Presentacion;

import Clases.Cliente;
import Clases.Pedido;
import Logica.LogCliente;
import Logica.LogPedido;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 16/11/2021
 * @author djaramillo
 * @clase administración del Paquete
 **/
public class ADMPedido {
    LogPedido objLogPedido = new LogPedido();
    LogCliente objLogCliente = new LogCliente();
    public void RegistrarPedido() throws IOException, FileNotFoundException, ClassNotFoundException {        
        Cliente objCliente = new Cliente();
        String cedula = "110116";
        objCliente = objLogCliente.BuscarCliente(cedula);
        if (objCliente.getCedula() == null)
            System.out.println("Cliente no existe");
        else{
            Pedido objPedido = new Pedido("001","Televisor",objCliente);  
            objLogPedido.CrearPedido(objPedido);
        }
    }
    
}
