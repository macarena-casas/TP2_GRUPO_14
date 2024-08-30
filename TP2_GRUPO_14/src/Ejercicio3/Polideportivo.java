package Ejercicio3;

public class Polideportivo implements Iedificio , IinstalacionDeportiva{

	private double superficie;
	private String nombre;
	
	public Polideportivo(double superficie, String nombre) {
		this.superficie = superficie;
		this.nombre = nombre;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return superficie;
	}

	@Override
	public String toString() {
		return "Polideportivo [superficie=" + superficie + ", nombre=" + nombre + ", getTipoDeInstalacion()="
				+ getTipoDeInstalacion() + "]";
	}
	
	
	
}
