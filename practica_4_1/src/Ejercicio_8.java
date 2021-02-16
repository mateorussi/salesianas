import javax.swing.JOptionPane;

/**
 * Realizar programa Java que permita cargar por teclado un vector num�rico
 * TB_NUM[100], posteriormente, introducir por teclado una posici�n,
 * elimine del vector num�rico el elemento que se encuentre en dicha posici�n
 * y visua1ice el vector sin ese elemento.
 * 
 * Nota: Eliminar un elemento de un vector supone desplazar una posici�n hacia la
 * izquierda el resto de elementos posteriores
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] TB_NUM = new double[6];
		
		for (int i=0;i<TB_NUM.length;i++) {
			String vector =JOptionPane.showInputDialog("Ingrese un valor numerico");
		}
		
		String introPosicion = JOptionPane.showInputDialog("Introduzca una posicion");
		
		System.out.println(introPosicion);
		
		//segun la posicion donde este eliminar esa posicion y trasladar los posteriores a la izquierda.
		
	}

}
