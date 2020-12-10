/**
 * 
 */
package ejercicio_17;

/**
 * @author mateorussi
 *
 */
public class Coche {
	
	/*
	 * Atributos
	 */
	
	private String matricula;
	private String marca;
	private String modelo;
	
	/*/
	 * Constructores
	 */
	
	public Coche(String m, String mrc, String mdl) {
		this.matricula=m;
		this.marca=mrc;
		this.modelo=mdl;
	}

	/*
	 * Métodos
	 */
	
	//Getters y Setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
