/**
 * 
 */
package ejercicio_1;

/**
 * @author mateorussi
 *
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
     */

    public DVDCine(String nombre, String autor, String resumen, String genero, int duracion) {

        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    /*
     * Retorna True si escribes Thriller 
     * en el genero
     * @return
     */
    
    public boolean es_thriller() {
        if(this.genero=="Thriller") {
            return true;
        }else {
        return false;
        }
    }
    
    /*
     * Si escribes algo en el resumen te 
     * retornara true
     * @return
     */
    
    public boolean tiene_resumen() {
    	return this.resumen!=null;
    }
    
    /*
     * Mostrara la duración de la 
     * pelicula
     * @return
     * 
     */
    
    public int muestra_duracion() {
    	return this.duracion;
    }

    /*
     * Devuelve toda la infomación
     * acerca de la película
     * @return
     */
    
    public String muestraDVDCine() {
    	return nombre+" donde el autor es "+autor+" ,dentro del genero "+genero+" ,trata sobre "+resumen+" y tiene una duración de "+duracion;
    }
}
