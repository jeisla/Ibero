package estudiantes;

import java.util.ArrayList;
import java.util.List;

public class EstudiantePregrado extends Estudiante {

	// Atributos
	private int semestreEnCurso;
	private List<Float> promediosSemestrales;

	// Constructor
	public EstudiantePregrado(String nombre, String correo, String programa, String ciudad, boolean becado, double valorBaseMatricula, int semestreEnCurso) {
		super(nombre, correo, programa, ciudad, becado, valorBaseMatricula);
		this.semestreEnCurso = semestreEnCurso;
		this.promediosSemestrales = new ArrayList<>();
	}

	// Getters and setters
	public int getSemestreEnCurso() {
		return this.semestreEnCurso;
	}

	public void setSemestreEnCurso(int semestreEnCurso) {
		this.semestreEnCurso = semestreEnCurso;
	}

	public String getPromediosSemestrales() {
		return this.promediosSemestrales.toString();
	}

	public void anadirPromedioSemestral(float acumulado) {
		if (this.promediosSemestrales.size() < this.semestreEnCurso) {
			this.promediosSemestrales.add(acumulado);
		}
	}

	public float calcularPromedioAcumulado() {
		int sumatoria = 0;
		for (float promedioSemestral : this.promediosSemestrales) {
			sumatoria += promedioSemestral;
		}
		return sumatoria / promediosSemestrales.size();
	}

	public boolean consultarElegibilidadDoblePrograma() {
		return this.calcularPromedioAcumulado() > 3.5 && this.getSemestreEnCurso() > 3;
	}

	@Override
	public double calcularValorAPagar() {
		return this.isBecado() ? 0.75 * getValorBaseMatricula() : getValorBaseMatricula();
	}

	@Override
	public String verDatos() {
		return "-- Estudiante pregrado --"
			+ "\nID: " + id 
			+ "\nNombre: " + nombre
			+ "\nCorreo: " + correo
			+ "\nPrograma: " + programa
			+ "\nCiudad: " + ciudad
			+ "\nBecado: " + becado
			+ "\nValor base matricula: " + getValorBaseMatricula()
			+ "\nSemestre en curso: " + getSemestreEnCurso()
			+ "\nPromedios semestrales: " + getPromediosSemestrales()
			+ "\nPromedio acumulado: " + calcularPromedioAcumulado()
			+ "\nValor semestral a pagar: " + calcularValorAPagar()
			+ (consultarElegibilidadDoblePrograma() ? "\nElegible" : "\nNo elegible") + "para doble programa"
			+ "\n----------------------------------"
			+ "\n";
	}

}
