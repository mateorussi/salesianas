/**
 * Muestra en pantalla 15 números obtenidos de forma aleatoria.
 * Entre un número y otro haz que el ordenador espere dos segundos
 * como si estuviera pensando en obtener el nuevo número.
 */
package practica_3_2;

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

		for (int i=1;i<=15;i++) {

			int aleatorio=((int)(Math.random()*100+1));
			
			try {
				Thread.sleep(2*1000);
			}catch (Exception e) {
				System.out.println("Mensaje en caso de que falle");
			}
			
		}
	}

}
