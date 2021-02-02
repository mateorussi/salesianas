/**
 * Introducir un número por teclado y mostrar si el número
 * es primo o no. (*) Un número es primo si es divisible
 * sólo por 1 y por si mismo.
 */
package practica_3_2;

import java.util.Scanner;

/**
 * @author mateorussi
 *
 */
public class Ejercicio_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un número a evaluar");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		if (num%1==0) {
			if (num%num==0){
				System.out.println("Su número es primo");
			}
		}else {
			System.out.println("Su número no es primo");
		}
	}

}
