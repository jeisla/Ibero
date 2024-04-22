package docentes;

public class DocenteTiempoCompleto extends DocenteSueldoFijo {

	// Constructor
	public DocenteTiempoCompleto(String nombre, String correo, String profesion, double Sueldo) {
		super(nombre, correo, profesion, Sueldo);
	}

	// Metodos
	@Override
	public double calcularDineroACobrar() {
		return super.getSueldo();
	}

	@Override
	public String verDatos() {
		return "-- Docente tiempo completo --"
			+ "\nID: " + id 
			+ "\nNombre: " + nombre 
			+ "\nCorreo: " + correo 
			+ "\nProfesion: " + profesion
			+ "\nSueldo: " + sueldo 
			+ "\nDinero a cobrar: " + calcularDineroACobrar()
			+ "\n---------------------------------------"
			+ "\n";
	}
}
