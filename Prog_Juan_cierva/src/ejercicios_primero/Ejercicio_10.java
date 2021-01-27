/**
 * 
 */
package ejercicios_primero;

import java.util.Scanner;

/**
 * @author mateorussi
 *
 */
public class Ejercicio_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_azar = (int)(Math.random()*100+1);
		int num_intro;
		
		do {
			
			System.out.println("Ingresa un número");
			Scanner sc=new Scanner(System.in);
			num_intro=sc.nextInt();
			
			
			if (num_intro > num_azar){
				System.out.println("El número es menor");
			} 
			
			if (num_intro < num_azar) {
				System.out.println("El número es mayor");
			}
			
		}while(num_intro!=num_azar);
		
		System.out.println("CORRECTO! has adivinado mi número, mi número era "+num_azar);
	}

}
