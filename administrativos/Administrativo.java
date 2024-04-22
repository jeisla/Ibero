package administrativos;

import persona.Persona;

public abstract class Administrativo extends Persona {

	// Atributos
	protected String ciudad, facultad;

	// Constructor
	public Administrativo(String nombre, String correo, String ciudad, String facultad) {
		super(nombre, correo);
		this.ciudad = ciudad;
		this.facultad = facultad;
	}

	// Getters y setters
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	// Metodos
	public abstract double calcularDineroACobrar();

	@Override
	public abstract String verDatos();

}
