package proveedores;

public class ProveedorInternacional extends Proveedor {

	// Atributos
	String pais;
	float impuestoAduana;

	// Constructor
	public ProveedorInternacional(String nombre, String correo, String categoria, double precioPorPedido, String pais, float impuestoAduana) {
		super(nombre, correo, categoria, precioPorPedido);
		this.pais = pais;
		this.impuestoAduana = impuestoAduana;
	}

	// Getters y setters
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public float getImpuestoAduana() {
		return impuestoAduana;
	}

	public void setImpuestoAduana(float impuestoAduana) {
		this.impuestoAduana = impuestoAduana;
	}

	// Metodos
	@Override
	public double calcularCostoPedido() {
		return getPrecioPorPedido() * (1 + (getImpuestoAduana()/100)); // precioPorPedido + impuestoAduana
	}

	@Override
	public String verDatos() {
		return "-- Proveedor internacional --"
			+ "\nID: " + id
			+ "\nNombre: " + nombre
			+ "\nCorreo: " + correo
			+ "\nCategoria: " + categoria
			+ "\nPrecio por pedido: " + calcularCostoPedido() // != precioPorPedido
			+ "\nPais: " + pais
			+ "\nImpuesto aduana: " + impuestoAduana
			+ "\n---------------------------------------"
			+ "\n";
	}

}
