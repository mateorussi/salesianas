/**
 * 
 */
package ejercicio_5;

/**
 * @author mateorussi
 *
 */
public class Empleado {

	/*
	 * Atributos
	 */
	
	private long dni;
	private double sueldo_bruto;
	private double sueldo_neto;
	private double sueldo;
	private int horas_extras;
	private double pago_he;
	private double irpf;
	private boolean casado;
	private int hijos;
	
	/*
	 * Constructores
	 */
	
	public Empleado(double sueldo, double pago_he, int he, double irpf, boolean casado, int hijos ) {
		this.casado=casado;
		this.hijos=hijos;
		this.horas_extras=he;
		this.irpf=irpf;
		this.pago_he=pago_he;
		this.sueldo=sueldo;
		this.dni=0;
	}
	
	public Empleado(long dni, double sueldo, double pago_he, int he, double irpf, boolean casado, int hijos) {
		this.casado=casado;
		this.hijos=hijos;
		this.horas_extras=he;
		this.irpf=irpf;
		this.pago_he=pago_he;
		this.sueldo=sueldo;
		this.dni=dni;
	}
	
	/*
	 * Métodos
	 */
		
	// Getters y Setters
	
	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getHoras_extras() {
		return horas_extras;
	}

	public void setHoras_extras(int horas_extras) {
		this.horas_extras = horas_extras;
	}

	public double getPago_he() {
		return pago_he;
	}

	public void setPago_he(double pago_he) {
		this.pago_he = pago_he;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	
	// Método para calcular el pago de las horas extras
	
	
}
