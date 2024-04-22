package proveedores;

import persona.Persona;

public abstract class Proveedor extends Persona {

	// Atributos
	protected final String categoria;
	protected double precioPorPedido;

	// Constructor
	public Proveedor(String nombre, String correo, String categoria, double precioPorPedido) {
		super(nombre, correo);
		this.categoria = categoria;
		this.precioPorPedido = precioPorPedido;
	}

	// Getters y setters
	public double getPrecioPorPedido() {
		return precioPorPedido;
	}

	public void setPrecioPorPedido(double precioPorPedido) {
		this.precioPorPedido = precioPorPedido;
	}

	public String getCategoria() {
		return categoria;
	}

	// Metodos
	public abstract double calcularCostoPedido();

	@Override
	public abstract String verDatos();

}
