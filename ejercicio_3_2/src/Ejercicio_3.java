/**
 * Captura por teclado un n�mero y queremos que
 * nos pregunte la tabla de multiplicar de dicho n�mero.
 * Nosotros responderemos y el programa indicara si es
 * correcto o no, lo que hemos escrito.
 */

import java.util.Scanner;

/**
 * @author mateorussi
 *
 */
public class Ejercicio_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un número");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("¿Cuál es la tabla de multiplicar de "+num);
		
		switch (num) {
			case 1: System.out.println("1 x "+num+"="
					+ "\n2 x "+num+"="
							+ "\n3 x "+num+"="
									+ "");
		}
		
	}

}
