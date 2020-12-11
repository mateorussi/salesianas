/**
 * 
 */
package ejercicio_17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author mateorussi
 * @version 26/nov/2020
 */
public class Coche_print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de plaza:");
		int numPlaza= sc.nextInt();
		PlazaAparcamiento p1= new PlazaAparcamiento(numPlaza);
		Coche[] coches= new Coche[999];
		int i=0;
		boolean repetir = true;
		while(repetir) {
			System.out.println("1.-Aparcar coche");
			System.out.println("2.-Sacar coche");
			System.out.println("3.-Ver coche aparcado");
			System.out.println("4.-Salir");
			
			
			try {
				switch (sc.nextInt()) {
				case 1 : p1.aparcar();
				if(p1.isPlazaLibre()) {
					p1.añadirCoche();
					i=i+1;
					p1.cambiarFalse();
					System.out.println("Introduzca la matrícula:");
					String matricula=sc.next();
					System.out.println("Introduzca la marca:");
					String marca=sc.next();
					System.out.println("Introduzca el modelo:");
					String modelo=sc.next();
					coches[i]=new Coche(matricula,marca,modelo);
					System.out.println("Coche aparcado");
				}else {
					System.err.println("Porfavor saque el coche de la plaza si quiere aparcar uno nuevo");
				}
				break;
				
				case 2 : 
					if(p1.isPlazaLibre()) {
						System.err.println("No hay ningún coche estacionado");
					}else {
						System.out.println("Coche sacado de la plaza");
						p1.cambiarTrue();
					}
				break;
				case 3 :
					if(p1.isPlazaLibre()) {
						System.out.println("Ningún coche estacionado");
					}else {
					coches[i].imprimir();
					}
				break;
				case 4:
					if(p1.isPlazaLibre()) {
						System.out.println("La plaza "+p1.getNumPlaza()+" actualmente esta libre y se han aparcado en ella un total de "+p1.getCochesTotales()+"coches");
					}else {
						System.out.println("La plaza "+p1.getNumPlaza()+" actualmente esta ocupada por el coche:");
						coches[i].imprimir();
						System.out.println("y se han aparcado en ella un total de "+p1.getCochesTotales()+"coches");
					}
				break;
				
				}
				
			}catch (InputMismatchException e) {
				System.err.println("Error: valor no valido");
			}
			
		}

	}

}
