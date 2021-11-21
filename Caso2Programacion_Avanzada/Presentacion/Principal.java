/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 16/11/2021
 * @author djaramillo
 * @clase principal
 **/
public class Principal {
    static Scanner sc = new Scanner(System.in);
    static ADMPedido objAdmPedido = new ADMPedido();
    static ADMCliente objAdmCliente = new ADMCliente();
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // modulo principal
        int op1=0;
        //ciclo repetitivo
        do {
            System.out.println("Mesero     <1>");
            System.out.println("Cajero     <2>");
            System.out.println("Cliente    <3>");
            System.out.println("Salir      <4>");
            System.out.print(" ingrese opción  ");
            op1 = sc.nextInt();
            switch (op1){
                case 1: menu_mesero(); break;
                case 3: menu_cliente(); break;
            }
        }while (op1 != 4);
    }

    private static void menu_mesero() throws IOException {
        int op=0;
        do {
            System.out.println("Registrar Pedido  <1>");
            System.out.println("Listar Pedido    <2>");
            System.out.println("Registrar Entrega  <3>");
            System.out.println("Regresar           <4>");
            System.out.print   (" ingrese opción  ");
            op = sc.nextInt();
            switch (op){
                case 1: //objAdmPaquete.RegistrarPaquete(); break;
                // otras opciones
                    
                    
            }
        }while (op != 4);
    }

    private static void menu_cliente() throws IOException, FileNotFoundException, ClassNotFoundException {
        int op2=0;
        do {
            System.out.println("Registrar Cliente  <1>");
            System.out.println("Agregar Cliente    <2>");
            System.out.println("Listar Cliente     <3>");
            System.out.println("Regresar           <4>");
            System.out.print(" ingrese opción  ");
            op2 = sc.nextInt();
            switch (op2){
                case 1: objAdmCliente.RegistrarCliente(); break;
                case 2: objAdmCliente.AgregarCliente(); break;
                case 3: objAdmCliente.ListarCliente(); break;
            }
        }while (op2 != 4);
    }
}

