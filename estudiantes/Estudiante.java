package estudiantes;

import persona.Persona;

public abstract class Estudiante extends Persona {

	// Atributos
	protected String programa, ciudad;
	protected boolean becado;
	protected double valorBaseMatricula;

	// Constructor
	public Estudiante(String nombre, String correo, String programa, String ciudad, boolean becado, double valorBaseMatricula) {
		super(nombre, correo);
		this.programa = programa;
		this.ciudad = ciudad;
		this.becado = becado;
		this.valorBaseMatricula = valorBaseMatricula;
	}

	// Getters y setters
	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}

	public double getValorBaseMatricula() {
		return valorBaseMatricula;
	}

	public void setValorBaseMatricula(double valorBaseMatricula) {
		this.valorBaseMatricula = valorBaseMatricula;
	}

	// Metodos
	public abstract double calcularValorAPagar();

	@Override
	public abstract String verDatos();

}
