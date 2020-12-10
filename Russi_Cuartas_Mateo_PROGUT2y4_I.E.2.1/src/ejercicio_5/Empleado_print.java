/**
 * 
 */
package ejercicio_5;

/**
 * @author mateorussi
 *
 */
public class Empleado_print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de nuevo objeto Ismael donde se utiliza el segundo constructor Empleado
			
		Empleado Ismael= new Empleado(6318591, 15000, 3000, 4, 8, true, 3);
		
		// Cálculo nominativo de Ismael
		
		Ismael.calculoHorasExtra();
		Ismael.sueldoBruto();
		Ismael.calculoIRPF();
		Ismael.println();
		Ismael.printAll();
	}
}
