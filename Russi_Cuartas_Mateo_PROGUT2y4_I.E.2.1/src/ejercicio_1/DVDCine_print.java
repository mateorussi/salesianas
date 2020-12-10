/**
 * 
 */
package ejercicio_1;

import java.util.Scanner;

/**
 * @author mateorussi
 *
 */
public class DVDCine_print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
         /* Te muestra por pantalla la información 
          * necesaria a introducir y despues te pide 
          * que introduzcas la informacion necesaria
         */
         
        System.out.println("Nombre de la pelicula");
        String nombre = sc.nextLine();
        System.out.println("Nombre del autor");
        String autor = sc.nextLine();
        System.out.println("Resumen");
        String resumen = sc.nextLine();
        System.out.println("Genero");
        String genero = sc.nextLine();
        System.out.println("Duración");
        int duracion = sc.nextInt();
        
        /*
         * Llamada a la clase objeto para utilizar 
         * sus respectivos metodos
         */
        
        DVDCine cine = new DVDCine(nombre, autor, resumen, genero, duracion);
        System.out.println(cine.es_thriller());
        System.out.println(cine.muestra_duracion()); 
        System.out.println(cine.tiene_resumen());
        System.out.println(cine.muestraDVDCine());
	}

}
