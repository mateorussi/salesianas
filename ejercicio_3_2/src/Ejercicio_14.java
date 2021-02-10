/**
 * Realizar un ejemplo de men�, donde podemos escoger las
 * distintas opciones hasta que seleccionamos la opci�n
 * de �Salir�.
 */
a_3_2;

/**
 * @author mateorussi
 *
 */
public class Ejercicio_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		do {
			System.out.println("Escoja una de las siguientes opciones del menu");
			System.out.println("1. Primera opción" +
					"/n2. Segunda opción" +
					"/n3. Tercera opción" +
					"/n4. Cuarta opción" +
					"/n5. Elija para salir del programa ");
			int opc= Integer.parseInt(System.console().readLine());

			switch (opc){
				case 1:
					System.out.println("Esta es la primera opción");
					break;
				case 2:
					System.out.println("Esta es la segunda opción");
					break;
				case 3:
					System.out.println("Esta es la tercera opción");
					break;
				case 4:
					System.out.println("Esta es la cuarta opción");
					break;
				case 5:
					System.out.println("Has salido del programa");

			}
		}while (opc!=5);
	}

}
