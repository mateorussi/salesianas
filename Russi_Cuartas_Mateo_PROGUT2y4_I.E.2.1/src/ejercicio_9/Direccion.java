/**
 * 
 */
package ejercicio_9;

/** 
 * Clase direccion el cual tendra como atributos
 * la calle, ciudad, numero y piso del empleado.
 * 
 * @author mateorussi
 * @version 26/nov/2020
 */
public class Direccion {
	
	/*
	  * Objeto Direccion 
	  * @param calle
	  * @param ciudad
	  * @param numero
	  * @param piso
	 */
	
    private String calle;
    private String ciudad;
    private int numero;
    private int piso;

    /*
     * Constructores
     */

    public Direccion() {
        this.calle = "";
        this.ciudad = "";
        this.numero = 0;
        this.piso = 0;
    }

    /*
     * Métodos
     */
    
    //Getters y Setters
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    //String que devulve toda la dirección del 
    public String toString() {
        return " Calle: "+calle+", Ciudad: "+ciudad+", Numero: "+numero+", Piso: "+piso;
    }
}

}
