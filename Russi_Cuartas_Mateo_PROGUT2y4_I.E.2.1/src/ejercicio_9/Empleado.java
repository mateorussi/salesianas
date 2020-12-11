/**
 * 
 */
package ejercicio_9;

/**
 * Clase Empleado el cual se vincula con el objeto direccion
 * Esta clase Empleado solo tendra como atributos nombre, salario 
 * y direccion
 * 
 * @author mateorussi
 * @version 26/nov/2020
 */
public class Empleado {
	/*
	 * @param nombre
	 * @param salario
	 * @param direccion
	 */
	
	private String nombre;
    private int salario;
    private Direccion direccion;
    
    /*
     * Constructores
     */

    public Empleado() {

    }

    /*
     * Métodos
     */
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    /*
     * @return nombre y salario del empleado 
     * y llama al objeto direccion el cual muestra 
     * la calle, piso , numero y ciudad
     */
    
    public String toString() {
        return "Nombre: "+nombre+", Salario: "+salario+"$\nDirección:"+direccion;
    }

}
