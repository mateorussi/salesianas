/**
 * Introducir un n�mero por teclado y mostrar si el n�mero
 * es primo o no. (*) Un n�mero es primo si es divisible
 * s�lo por 1 y por si mismo.
 */
3_2;

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
