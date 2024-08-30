package Ejercicio3;

public class EdificioOficinas implements Iedificio {
	
	private double superficie;
	private double superficie2;
    private int numeroDeOficinas;
    
    
    
    
	public EdificioOficinas() {
		super();
		this.superficie = 0;
		this.superficie2 = 0;
		this.numeroDeOficinas = 0;
	
	}


	public EdificioOficinas(double superficie, double superficie2, int numeroDeOficinas) {
		super();
		this.superficie = superficie;
		this.superficie2 = superficie2;
		this.numeroDeOficinas = numeroDeOficinas;
	}


	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}


	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}


	@Override
	public double getSuperficieEdificio() {
	
		return superficie * superficie2;
	}


	@Override
	public String toString() {
		return "EdificioOficinas [superficie=" + superficie * superficie2 + "m2, numero de oficinas="
				+ numeroDeOficinas + "]";
	}



	
}
