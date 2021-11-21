package Clases;

import java.io.Serializable;


/**
 * 16/11/2021
 * @author djaramillo
 * @clase del modelo PAQUETE
 **/
public class Pedido implements Serializable {

	private String Codigo;
	private String Descripcion;
	public Cliente m_Cliente;

	public Pedido(){

	}

    public Pedido(String Codigo, String Descripcion, Cliente m_Cliente) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.m_Cliente = m_Cliente;
    }


}