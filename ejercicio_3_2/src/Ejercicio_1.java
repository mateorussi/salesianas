/**
 * Muestra en pantalla 15 numeros obtenidos de forma aleatoria.
 * Entre un n�mero y otro haz que el ordenador espere dos segundos
 * como si estuviera pensando en obtener el nuevo n�mero.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 1;
		int max = 100;
		for(int i = min; i <=15; i++) {
			int getRandomValue = (int) (Math.random()*(max-min)) + min;
			System.out.println(getRandomValue);
	}

	}

}
