/**
 * Practica el uso de constantes.
 * Queremos calcular la longitud de una circunferencia, el �rea de un c�rculo
 * y volumen de una esfera, a partir del radio que se introducir� por teclado.
 * Define PI como constante y prueba durante el programa a cambiar su
 * valor.
 * Despu�s de ejecutarse el proceso anterior, pregunta al usuario si quiere
 * continuar con otro caso (S/N). El programa terminar� cuando el usuario
 * responda N.
 * F�rmulas:
 * L = 2 . n . r A = 4. n .r2 V = - n . r 3
 */
package practica_3_4;

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double long_conf, area_circ, volumen_esf,radio;
		
		boolean rta=true;
		
		do {
			//Pedir radio
			System.out.println("Introduzca el radio de la circunferencia");
			Scanner sc=new Scanner(System.in);
			radio=sc.nextDouble();
		
			//Longitud de una circunferencia
			float long_conf
			//Area del circulo
			
			//Volumen de una esfera
			
			//
			
			System.out.println("¿Quieres continuar con otro caso (S/N)?");
			String rta_user=sc.next();
			if (rta_user=="S") {
				rta=false;
			}
		}while(rta=true);
		
		
		
		
		
	}

}
