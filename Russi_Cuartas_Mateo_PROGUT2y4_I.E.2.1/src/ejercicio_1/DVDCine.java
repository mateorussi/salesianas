/**
 * 
 */
package ejercicio_1;

/**
 * Esta clase representa una película en DVD de nombre DVDCine con
 * los atributos necesarios para mostrar la ficha que se recoge en el String 
 * muestraDVDCine
 * 
 * @author mateorussi
 * @version 26/nov/2020
 */
public class DVDCine {
	
	/*
	 * Atributos 
	 */
	
	private String nombre;
	private String autor;
	private String resumen;
	private String genero;
    private int duracion;
    
    /*
     * Constructores
     * 
     * @param nombre
	 * @param autor
	 * @param resumen
	 * @param genero
	 * @param duracion
     */

    public DVDCine(String nombre, String autor, String resumen, String genero, int duracion) {

        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    /*
     * @return True si escribes Thriller 
     * en el genero
     * 
     */
    
    public boolean es_thriller() {
        if(this.genero=="Thriller") {
            return true;
        }else {
        return false;
        }
    }
    
    /*
     * @return True Si escribes algo en el resumen
     */
    
    public boolean tiene_resumen() {
    	return this.resumen!=null;
    }
    
    /*
     * @return duración de la pelicula
     */
    
    public int muestra_duracion() {
    	return this.duracion;
    }

    /*
     * @return toda la infomación
     * acerca de la película
     */
    
    public String muestraDVDCine() {
    	return nombre+" donde el autor es "+autor+" ,dentro del genero "+genero+" ,trata sobre "+resumen+" y tiene una duración de "+duracion;
    }
}
