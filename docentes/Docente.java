package docentes;

import persona.Persona;

public abstract class Docente extends Persona {

	// Atributos
	protected String profesion;

	// Constructor
	public Docente(String nombre, String correo, String profesion) {
		super(nombre, correo);
		this.profesion = profesion;
	}

	// Getters y setters
	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	// Metodos
	public abstract double calcularDineroACobrar();

	@Override
	public abstract String verDatos();

}
