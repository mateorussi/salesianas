/*
 * Capturamos un carácter y debemos indicar si está en mayúscula,
 * en minúscula, es un dígito o cualquier otro carácter.
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
		
		System.out.println("Escribe un cáracter cualquiera");
		
		char caracter;
		caracter=scan.next().nextAt(0);
		
		if (Character.isDigit(caracter)) { //identificar si es un digito
			System.out.println("El caracter es un dígito");
		}else if (Character.isLetter(caracter)) {
			if (Character.isUpperCase(caracter)) { //identificar si es mayuscula
				System.out.println("Es una Letra mayúscula");
			}else if(Character.isLowerCase(caracter)){ //identicar si es minuscula
				System.out.println("Es una Letra minúscula");
			}
		}
		
		
		
		
				
	}

}
