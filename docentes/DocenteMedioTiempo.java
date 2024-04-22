package docentes;

public class DocenteMedioTiempo extends DocenteSueldoFijo {

	// Constructor
	public DocenteMedioTiempo(String nombre, String correo, String profesion, double Sueldo) {
		super(nombre, correo, profesion, Sueldo);
	}

	// Metodos
	@Override
	public double calcularDineroACobrar() {
		return super.getSueldo();
	}

	@Override
	public String verDatos() {
		return "-- Docente medio tiempo --"
			+ "\nID: " + super.getId()
			+ "\nNombre: " + super.getNombre()
			+ "\nCorreo: " + super.getCorreo()
			+ "\nProfesion: " + super.getProfesion()
			+ "\nSueldo: " + this.getSueldo()
			+ "\nDinero a cobrar: " + this.calcularDineroACobrar()
			+ "\n------------------------------------"
			+ "\n";
	}
}
