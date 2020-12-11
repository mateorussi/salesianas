/**
 * 
 */
package ejercicio_11;

/**
 * Clase que define al polígono Triangulo y permite
 * retornar sus características principales
 *
 * @author mateorussi
 * @version 26/nov/2020
 */
public class Triangulo {
	
	/*
	 * Atributos
	 */
	
	double long_lado1;
	double long_lado2;
	double long_lado3;
	
	/*
	 * Constructores
	 */
	
	//Constructor sobrecargado que inicializa los atributos. 
	
	public Triangulo (double l1, double l2, double l3) {
		this.long_lado1=l1;
		this.long_lado2=l2;
		this.long_lado3=l3;
	}

	/*
	 * Métodos
	 */
	
	// Método que que permite determinar si dos triangulos son o no iguales. 
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
	
	}
	
	//Método que permite determinar si un conjunto de Triangulos son iguales.
	public boolean compareTo_VTriangulos(Triangulo v[ ]) {
		
	}
	

	
	
}
