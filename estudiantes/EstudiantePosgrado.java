package estudiantes;

public class EstudiantePosgrado extends Estudiante {

	// Atributos
	private String tipoDePosgrado, profesion;

	// Constructor
	public EstudiantePosgrado(String nombre, String correo, String programa, String ciudad, boolean becado, double valorBaseMatricula, String tipoDePosgrado, String profesion) {
		super(nombre, correo, programa, ciudad, becado, valorBaseMatricula);
		this.tipoDePosgrado = tipoDePosgrado;
		this.profesion = profesion;
	}

	// Getters y setters
	public String getTipoDePosgrado() {
		return tipoDePosgrado;
	}

	public void setTipoDePosgrado(String tipoDePosgrado) {
		this.tipoDePosgrado = tipoDePosgrado;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	// Metodos
	@Override
	public double calcularValorAPagar() {
		return this.isBecado() ? 0.75 * getValorBaseMatricula() : getValorBaseMatricula();
	}

	@Override
	public String verDatos() {
		return "-- Estudiante posgrado --"
			+ "\nID: " + id
			+ "\nNombre: " + nombre
			+ "\nCorreo: " + correo
			+ "\nPrograma: " + programa
			+ "\nTipo de posgrado: " + getTipoDePosgrado()
			+ "\nProfesion: " + getProfesion()
			+ "\nCiudad: " + ciudad
			+ "\nBecado: " + becado
			+ "\nValor base matricula: " + getValorBaseMatricula()
			+ "\nValor semestral a pagar: " + calcularValorAPagar()
			+ "\n----------------------------------"
			+ "\n";
	}

}
