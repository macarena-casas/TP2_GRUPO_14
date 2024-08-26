package Ejercicio3;

public class EdificioOficinas implements Iedificio {
	
	private double superficie;
	private double superficie2;
    private int numeroDeOficinas;
    
    
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
		// TODO Auto-generated method stub
		return superficie * superficie2;
	}
    
}
