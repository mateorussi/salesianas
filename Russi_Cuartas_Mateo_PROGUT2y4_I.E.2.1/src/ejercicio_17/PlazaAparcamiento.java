/**
 * 
 */
package ejercicio_17;

/**
 * 
 * @author mateorussi
 * @version 26/nov/2020
 */
public class PlazaAparcamiento {
	
	/*
	 * Atributos
	 */
	
	private int numPlaza;
	private Coche[] coches=null;
	private static boolean plazaLibre=true;
	private static int cochesTotales=0;
	
	/*
	 * Constructores
	 */
	
    public PlazaAparcamiento(int numPlaza) {
    	this.numPlaza=numPlaza;
    	this.coches=coches;
    	this.plazaLibre=true;
    	this.cochesTotales=cochesTotales;
    	
    }

    /*
     * Métodos
     */
    
    //Getters y Setters
    
	public int getNumPlaza() {
		return numPlaza;
	}

	public void setNumPlaza(int numPlaza) {
		this.numPlaza = numPlaza;
	}

	public Coche[] getCoches() {
		return coches;
	}

	public void setCoches(Coche[] coches) {
		this.coches = coches;
	}

	public boolean isPlazaLibre() {
		return plazaLibre;
	}

	public void setPlazaLibre(boolean plazaLibre) {
		this.plazaLibre = plazaLibre;
	}

	public static int getCochesTotales() {
		return cochesTotales;
	}

	public static void setCochesTotales(int cochesTotales) {
		PlazaAparcamiento.cochesTotales = cochesTotales;
	}
	
	//
    
    public void imprimir() {
    	System.out.println("Número de plaza: "+numPlaza+" Coche aparcado: "+coches+" ¿Plaza libre?: "+plazaLibre+" Coches totales que se han aparcado: ");
    } 
    
    public void aparcar() {
    	if(plazaLibre=true) {
    		
    		System.out.println("Por favor introduzca los siguientes datos:");
    	}else {
    		System.err.println("Plaza ocupada");
    	}
    	
    }
    
    public void añadirCoche() {
    	cochesTotales++;
    }
    
    
    public void cambiarFalse() {
    	plazaLibre=false;
    }
    
    public void cambiarTrue() {
    	plazaLibre=true;
    }
    

}
