package Logica;

import AdmArchivos.ArchPedido;
import Clases.Pedido;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 16/11/2021
 * @author djaramillo
 * @clase para loa logica del PAQUETE
 **/
public class LogPedido {
    ArchPedido objArchPedido = new ArchPedido();
    public void CrearPaquete(Pedido objPedido) throws IOException {
        ArrayList<Pedido> ArrayPedidos = new ArrayList<Pedido>();
        ArrayPedidos.add(objPedido);
        objArchPedido.GrabarPedido(ArrayPedidos);
    }

    public void CrearPedido(Pedido objPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
