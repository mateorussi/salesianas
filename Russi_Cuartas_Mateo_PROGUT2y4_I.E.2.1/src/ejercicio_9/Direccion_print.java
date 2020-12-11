/**
 * 
 */
package ejercicio_9;

/**
 * @author mateorussi
 *
 */
public class Direccion_print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *Llamamos a los objetos Empleado y Direccion 
		 * Direccion para asociarlo con Empleado
		 */
		
       Empleado e = new Empleado();
       Direccion d = new Direccion();
       e.setNombre("Andres");
       e.setSalario(15);
       e.setDireccion(d); //Empleado recoge la informacion de Direccion 
       e.getDireccion().setCalle("Hola");
       e.getDireccion().setCiudad("Sevilla");
       e.getDireccion().setNumero(89);
       e.getDireccion().setPiso(2);
       System.out.println(e.toString());
	}

}
