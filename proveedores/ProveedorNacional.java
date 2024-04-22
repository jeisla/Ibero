package proveedores;

public class ProveedorNacional extends Proveedor {

	// Atributos
	private String ciudad;

	// Constructor
	public ProveedorNacional(String nombre, String correo, String categoria, double precioPorPedido, String ciudad) {
		super(nombre, correo, categoria, precioPorPedido);
		this.ciudad = ciudad;
	}

	// Getters y setters
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	// Metodos
	@Override
	public double calcularCostoPedido() {
		return super.getPrecioPorPedido();
	}

	@Override
	public String verDatos() {
		return "-- Proveedor nacional --"
			+ "\nID: " + id
			+ "\nNombre: " + nombre
			+ "\nCorreo: " + correo
			+ "\nCategoria: " + categoria
			+ "\nPrecio por pedido: " + precioPorPedido
			+ "\nCiudad: " + ciudad
			+ "\n----------------------------------"
			+ "\n";
	}

}
