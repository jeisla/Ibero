package docentes;

public class DocenteHoraCatedra extends Docente {

	// Atributos
	private double salarioPorHora;
	private int horasTrabajadas;

	// Constructor
	public DocenteHoraCatedra(String nombre, String correo, String profesion, double salarioPorHora, int horasTrabajadas) {
		super(nombre, correo, profesion);
		this.salarioPorHora = salarioPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	// Getters y setters
	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	// Metodos
	@Override
	public double calcularDineroACobrar() {
		return getHorasTrabajadas() * getSalarioPorHora();
	}

	@Override
	public String verDatos() {
		return "-- Docente hora catedra --"
			+ "\nID: " + id 
			+ "\nNombre: " + nombre 
			+ "\nCorreo: " + correo
			+ "\nProfesion: " + profesion
			+ "\nSalario por hora: " + salarioPorHora
			+ "\nHoras trabajadas: " + horasTrabajadas
			+ "\nDinero a cobrar: " + calcularDineroACobrar()
			+ "\n------------------------------------"
			+ "\n";
	}

}
