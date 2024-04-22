package docentes;

public abstract class DocenteSueldoFijo extends Docente {

	// Atributos
	protected double sueldo;
	protected boolean tiempoCompleto;

	// Constructor
	public DocenteSueldoFijo( String nombre, String correo, String profesion, double Sueldo ) {
		super( nombre, correo, profesion);
		this.sueldo = Sueldo;
	}

	// Getters y setters
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setTiempoCompleto(boolean tiempoCompleto) {
		this.tiempoCompleto = tiempoCompleto;
	}

	// Metodos
	@Override
	public abstract double calcularDineroACobrar(); 

	@Override
	public abstract String verDatos() ;

}
