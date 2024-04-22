package administrativos;

public class AdministrativoPlanta extends Administrativo {

	// Atributos
	private double sueldo;

	// Constructor
	public AdministrativoPlanta(String nombre, String correo, String ciudad, String facultad, double sueldo) {
		super(nombre, correo, ciudad, facultad);
		this.sueldo = sueldo;
	}

	// Getters y setters
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// Metodos
	@Override
	public double calcularDineroACobrar() {
		return getSueldo();
	}

	@Override
	public String verDatos() {
		return "-- Administrativo de planta --"
			+ "\nID: " + id
			+ "\nNombre: " + nombre
			+ "\nCorreo: " + correo
			+ "\nCiudad: " + ciudad
			+ "\nFacultad:" + facultad
			+ "\nSueldo: " + sueldo
			+ "\n----------------------------------------"
			+ "\n";
	}

}
