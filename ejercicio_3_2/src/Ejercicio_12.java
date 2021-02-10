/**
 * Escribe un programa que pida el limite inferior y superior de un intervalo.
 * Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
 * A continuación se van introduciendo números hasta que introduzcamos el 0.
 * Cuando termine el programa dará las siguientes informaciones:
 * La suma de los números que están dentro del intervalo (intervalo abierto).
 * Cuantos números están fuera del intervalo.
 * He informa si hemos introducido algún número igual a los límites del intervalo.
 */
actica_3_2;

import java.util.Scanner;

/**
 * @author mateorussi
 *
 */
public class Ejercicio_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lim_sup, lim_inf, num_ing;
		
		int cont_fuera=0;
		int cont_igual=0;
		int sum_dentro=0;
		
		do {
			System.out.println("Escribe el limite superior del intervalo");
			Scanner sc=new Scanner(System.in);
			lim_sup=sc.nextInt();
			
			System.out.println("Escribe el limite inferior del intervalo");
			Scanner sc1=new Scanner(System.in);
			lim_inf=sc1.nextInt();
			
		}while(lim_sup<lim_inf);
		
		do {
			System.out.println("Ingrese un nÃºmero");
			Scanner sc2=new Scanner(System.in);
			num_ing=sc2.nextInt();
			
			//Suma de los nÃºmeros que estÃ¡n dentro del intervalo
			if (num_ing > lim_inf && num_ing < lim_sup){
				sum_dentro=num_ing+sum_dentro;
				
			}
			//Contador de nÃºmeros que estÃ¡n fuera del intervalo
			else (num_ing < lim_inf && num_ing != 0 || num_ing > lim_sup){
				cont_fuera++;
			}
			//Contador de nÃºmeros iguales a los lÃ­mites del intervalo
			else (num_ing == lim_inf || num_ing == lim_sup){
				cont_igual++;
			}
		
		}while (num_ing!=0);
		
		
		
		System.out.println("La suma de los nÃºmeros que estan dentro del intervalo es: "+sum_dentro);
		System.out.println("La cantidad de nÃºmeros que estan fuera del intervalo es de : "+cont_fuera);
		System.out.println("La cantidad de nÃºmeros que son iguales a los lÃ­mites del intervalo es de : "+cont_igual);
		
		
	}

}
