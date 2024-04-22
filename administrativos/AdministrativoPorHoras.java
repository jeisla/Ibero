package administrativos;

public class AdministrativoPorHoras extends Administrativo {

	// Atributos
	private double salarioPorHora;
	private int horasTrabajadas;

	// Constructor
	public AdministrativoPorHoras(String nombre, String correo, String ciudad, String facultad, double SalarioPorHora, int horasTrabajadas) {
		super(nombre, correo, ciudad, facultad);
		this.salarioPorHora = SalarioPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	// Getters y setters
	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double SalarioPorHora) {
		this.salarioPorHora = SalarioPorHora;
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
		return this.getHorasTrabajadas() * this.getSalarioPorHora();
	}

	@Override
	public String verDatos() {
		return "-- Administrativo por horas --"
			+ "\nID: " + id 
			+ "\nNombre: " + nombre
			+ "\nCorreo: " + correo
			+ "\nCiudad: " + ciudad
			+ "\nFacultad: " + facultad
			+ "\nSalario por hora: " + salarioPorHora
			+ "\nHoras trabajadas: " + horasTrabajadas
			+ "\n----------------------------------------"
			+ "\n";
	}

}
