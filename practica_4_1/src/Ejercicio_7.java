import java.util.Arrays;

/**
 * Realizar un programa Java que permita cargar por teclado un vector numerico TB_NUM[100],
 * posteriormente, introducir un valor desde teclado e intercalarlo en su posicion correcta
 * dentro del vector numerico supuestamente ordenado, y visualice finalmente el vector
 * con el dato intercalado. El valor antiguo que estaba en la posicion en la que se inserta se pierde.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] TB_NUM=new int[100];
		
		for (int i=0;i<TB_NUM.length;i++) {
			TB_NUM[i]=(int) (Math.random()*100+1);
		}
		
		//double aux=0;
		
		Arrays.sort(TB_NUM);
		
		//imprime vector ordenado
		for (int i=0;i<TB_NUM.length;i++) {
			System.out.print(TB_NUM[i]+"    ");;
		}
		
		System.out.println("Introduzca un valor");
		
		
		for (int j=0;j<TB_NUM.length;j++) {
			
			for (int i=0;i<TB_NUM.length;i++) {
				
				if (j)
			}
		}
		/*
		
		
		
		System.out.println("Introduzca un valor");
		
	
		
		System.out.println("Introduzca un valor");
	}

*/

	
	}
}
