import java.util.Scanner;

/**
 * Realizar un programa Java que pida un n�mero entero positivo de 10 cifras,
 * y que compruebe si el n�mero es capicua
 */

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

		Scanner sc=new Scanner(System.in);
		
		int num10;
		do {
			System.out.println("Ingrese un numero entero positivo de 10 cifras");
			num10=sc.nextInt();
		}while(num10<1000000000);
		
		
	}

}
