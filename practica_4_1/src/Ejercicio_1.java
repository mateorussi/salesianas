import javax.swing.JOptionPane;
import javax.swing.*;

/**
 * Realizar programa Java que permita cargar un vector numerico de 10 elementos
 * desde teclado y, posteriormente visualice el valor del elemento mayor y
 * cuantas veces se repite en el vector este valor maximo. Utiliza JOptionPane.
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

		int[] vector = new int[10];
		
		for (int i=0;i<vector.length;i++) {
			int peticion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			vector[i]=Integer.toString(peticion);
		}
		
		
		
		int [] sc=new sc[10];
		
		int i;
		
		for (i=0,i<10,i++) {
			
			System.out.println(sc);
		}
		
	
	}

}
