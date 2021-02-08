/**
 * Una compañía de transporte internacional tiene servicio en algunos países de América del
Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte
se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la
tabla:

Zona Ubicación Costo/gramo
1 América del Norte 24.00 euros
2 América Central 20.00 euros
3 América del Sur 21.00 euros
4 Europa 10.00 euros
5 Asia 18.00 euros

Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados,
esto por cuestiones de logística y de seguridad.
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el
rechazo de la entrega.
 */
package practica_3_3;

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		float peso;
		int zona;
		double serv_paq;
			  /*
			   * algoritmo del cobro de la entrega o el rechazo	
			   */
		System.out.println("Ingrese el peso en gramos de su paquete"
				+ "\nRercuerde:"
				+ "\n1 kg -> 1000 gramos");
		peso=sc.nextFloat();
		
		System.out.println("Ingrese la zona a la que va dirigido el paquete"
				+ "\n1. América del Norte: 24.00"
				+ "\n2. América Central: 20.00"
				+ "\n3. América del Sur: 21.00"
				+ "\n4. Europa: 10.00"
				+ "\n5. Asia: 18.00");
		zona=sc.nextInt();
		
		switch (zona) {
			case 1: 
				serv_paq=
		}
	if (peso<=5000) {
		serv_paq=peso*
	}else {
		System.out.println("No puede ser transportado, indique un peso inferior a 5000 gramos (5 kg)");
	}
	}

}
