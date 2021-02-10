/**
 * El director de una escuela est? organizando un viaje de estudios, y requiere determinar cu?nto
debe cobrar a cada alumno y cu?nto debe pagar a la compa??a de viajes por el servicio.
La forma de cobrar es la siguiente:
? si son 100 alumnos o m?s, el costo del viaje por cada alumno es de 65 euros;
? de 50 a 99 alumnos, el costo es de 70 euros,
? de 30 a 49, de 95 euros,
? y si son menos de 30 no hay viaje.
? Adem?s, el costo de un autob?s es de 4000 euros, sin importar el n?mero de alumnos.
LA capacidad de un autob?s es de 60 plazas.
Realice un algoritmo que permita determinar el pago a la agencia de viajes y lo que debe
pagar cada alumno por el viaje.
 */
e.
 */
package practica_3_3;

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alumno = 0;
		int costo_alum = 0;
		int alummo = 0;
		int costofinal;
		
		System.out.println("Ingrese el número de alumnos que realizaran el viaje");
		Scanner sc=new Scanner(System.in);
		alumno=sc.nextInt();
		
		if (alumno>=100) {
			costo_alum = 65;
			costofinal=costo_alum*alumno+4000;
		}else if (alumno>=50 && alumno<=99) {
			costo_alum = 70;
			costofinal=costo_alum*alumno+4000;
		}else if (alumno>=30 && alumno<=49) {
			costo_alum = 95;
			costofinal=costo_alum*alumno+4000;
		}else if (alumno<30) {
			System.out.println("La cantidad de viajeros es más baja del minimo, no puede hacer el viaje");
		}
		
		//Aqui hay un bucle for//
	}

}
