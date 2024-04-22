package persona;

public abstract class Persona {

	// Atributos
	private static int contadorPersonas = 0; // El contador asigna el ID a cada persona de forma automatica
	protected int id; // Las todas las clases derivadas tendran acceso a estos atributos, no solo las subclases directas
	protected String nombre, correo;

	// Constructor
	public Persona(String nombre, String correo) {
		contadorPersonas++;
		id = Persona.contadorPersonas;
		this.nombre = nombre;
		this.correo = correo;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getId() {
		return this.id;
	}

	// Metodos
	public abstract String verDatos();

}
