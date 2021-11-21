package Clases;

import java.io.Serializable;


/**
 * 16/11/2021
 * @author djaramillo
 * @clase del modelo PERSONA
 **/
public class Persona implements Serializable {

	public String Cedula;
	public String Nombres;

	public Persona(){

	}

    public Persona(String Cedula, String Nombres) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + Cedula + ", Nombres=" + Nombres + '}';
    }


}//end Persona