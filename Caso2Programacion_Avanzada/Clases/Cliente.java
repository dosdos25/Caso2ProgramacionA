package Clases; 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 16/11/2021
 * @author djaramillo
 * @clase del modelo CLIENTE
 **/


public class Cliente extends Persona implements Serializable{
       public String mail;

    public Cliente() {
    }

    public Cliente( String Cedula, String Nombres, String mail) {
        super(Cedula, Nombres);
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    @Override
    public String toString() {
        return "Cliente{" + "mail=" + mail + '}';
    }


       
}
