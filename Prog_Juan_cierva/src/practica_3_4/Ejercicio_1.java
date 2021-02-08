/**
 * Practica con switch.
 * Vamos a realizar las operaciones básicas de una calculadora.
 * Se capturarán por teclado un operador aritmético y dos valores numéricos.
 * Para pedir el operador mostraremos el siguiente menú, y pediremos que
 * se introduzca el número que corresponda a la operación que queremos
 * realizar.
 * 1. + 3. * 5. (MOD) Resto división entera
 * 2. – 4. / 6. División entera
 * Debemos mostrar un mensaje con la operación realizada y su resultado. 
 */
package practica_3_4;

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese los dos operandos para el cálculo ");
		double opr1=sc.nextInt();
		double opr2=sc.nextInt();
		System.out.println("Ingrese el operador para el cálculo:"
				+ "\n1. +"
				+ "\n2. -"
				+ "\n3. *"
				+ "\n4. /"
				+ "\n5. (MOD)"
				+ "\n6. División entera ");
		String opr3;
		switch (opr3){
			case 1: 
				double resultado1=(opr1+opr2);
				System.out.println("La operación realizada es la suma y el resultado es "+resultado1);
				break;
			case 2: 
				double resultado2=(int) (opr1-opr2);
				System.out.println("La operación realizada es la resta y el resultado es "+resultado2);
				break;
			case 3: 
				double resultado3=opr1*opr2;
				System.out.println("La operación realizada es la multiplicación y el resultado es "+resultado3);
				break;
			case 4: 
				double resultado4=opr1/opr2;
				System.out.println("La operación realizada es la división y el resultado es "+resultado4);
				break;
			case 5: 
				double resultado5=opr1%opr2;
				System.out.println("La operación realizada es el cálculo del resto de una división y el resultado es "+resultado5);
				break;
			case 6: 
				int resultado6=(int) (opr1+opr2); //Fuerza a redondear resultado a un entero positivo
				System.out.println("La operación realizada es la división entera y el resultado es "+resultado6);
				break;
		}
	}

}
