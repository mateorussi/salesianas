/*
 * Capturamos un car�cter y debemos indicar si est� en may�scula,
 * en min�scula, es un d�gito o cualquier otro car�cter.
 */
package practica_3_3;

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
		
		System.out.println("Escribe un c�racter cualquiera");
		
		char caracter;
		caracter=scan.next().nextAt(0);
		
		if (Character.isDigit(caracter)) { //identificar si es un digito
			System.out.println("El caracter es un d�gito");
		}else if (Character.isLetter(caracter)) {
			if (Character.isUpperCase(caracter)) { //identificar si es mayuscula
				System.out.println("Es una Letra may�scula");
			}else if(Character.isLowerCase(caracter)){ //identicar si es minuscula
				System.out.println("Es una Letra min�scula");
			}
		}
		
		
		
		
				
	}

}
