/**
 * La pol�tica de cobro de una compa��a telef�nica es:
� cuando se realiza una llamada, el cobro es por el tiempo que �sta dura, de tal forma
que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 c�ntimos, los
siguientes dos minutos, 70 c�ntimos, y a partir del d�cimo minuto, 50 c�ntimos.
� Adem�s, se carga un impuesto de 3 % cuando es domingo, y si es otro d�a, en turno de
ma�ana, 15 %, y en turno de tarde, 10 %.
Realice un algoritmo para determinar cu�nto debe pagar por cada concepto una persona
que realiza una llamada, teniendo en cuenta la duraci�n de esta, el d�a de la semana y el
turno. (Hora de la llamada hh:mm � Ma�ana antes de las 14:00, el resto tarde)
 */
package practica_3_3;

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int min_llamada, hora, min_hora, costo, duracion, dia = 0;
		String turno;
	
		System.out.println("Ingrese la duración, hora y dia de la llamada");
		Scanner sc=new Scanner(System.in);
		duracion=sc.nextInt();
		min_hora=sc.hashCode();
		hora=sc.nextInt();
		dia=sc.nextInt();
		turno=sc.next();
		
		for (i=1;i<=tiempo;i++) {
			if (min<=5) {
				costo=1;
			}else if (min<=)
		}
		
		//Resultar 3 prints con sus impuestos en cobro= cobro*1.03
	}

}
