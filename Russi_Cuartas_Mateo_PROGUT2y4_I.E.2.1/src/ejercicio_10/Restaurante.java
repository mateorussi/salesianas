/**
 * 
 */
package ejercicio_10;

/**
 * Clase que permite saber cuántos clientes puede atender el Restaurante Andaluz
 * con la materia prima que tienen en el almacén.
 * 
 * @author mateorussi
 * @version 26/nov/2020
 */
public class Restaurante {

	/*
	 * Atributos
	 */
	
	private int chocos;
	private int papas;
	private int totalChocos;
	private int total_papas;
	private static int clientes;
	
    /*
     * Constructores
     * @param chocos
	 * @param papas
	 * @param totalChocos
	 * @param totalPapas
	 * @param static clientes
     */
	
	public Restaurante(int chocos, int papas) {
		this.chocos=chocos;
		this.papas=papas;
		this.clientes=0;
	}
	
	/*
	 * Métodos
	 */
	
	/*
	 * Funcion: permite añadir chocos en kgs
	 * pero los pasara a gramos
	 */
	
	public void addChocos(int chocos) {
		chocos = chocos*1000;
        this.chocos = chocos;
	}
	
	/* 
	 * Funcion: permite añadir papas en kgs pero 
	 * los pasara a gramos
	 */
	
	public void addPapas(int papas) {
		papas = papas*1000;
        this.papas = papas;
	}
	
	public void getComensales() {
        if(papas<1000 || chocos<500) {
            System.out.println("No hay suficientes Papas o Chocos");
        }else {
        while(papas>=1000 && chocos>=500) {
            papas = papas - 1000;
            chocos =chocos - 500;
            clientes += 3;
            }
        }
        System.out.println("Puede atender a "+clientes+" personas");

    }
	
	//Muestra los kilos de chocosque hay en el almacen
	
    public void showChocos() {
        System.out.println("Hay un total de "+(chocos / 1000)+" kilos de chocos");
    }

    public void showPapas() {
        System.out.println("Hay un total de "+(papas / 1000)+" kilos de papas");
    }
    
    public int getComensales() {
    	int personaspapas;
        int personaschoco;
        int comensalesatendibles;
        int comensalesfinales;

        personaspapas = this.papas3;
        personaschoco = ((this.chocos/2)4)*3;

        comensalesatendibles = Math.min(personaschoco, personaspapas);

        comensalesfinales = Math.min(this.comensales, comensalesatendibles);
        return comensalesfinales;
        
    }
        
    
        
}
	
	 
