package Ejercicio2;


public class ProductoFresco extends Producto{
	
	private String fechaEnvasado;
	private String paisOrigen;

	public ProductoFresco() {
		super();
		this.fechaEnvasado="sin Fecha";
		this.paisOrigen="País no especificado";
	
	}

	
	public ProductoFresco(String fechaenvasado, String paisorigen, String fechaVencimiento, int nroLote) {
		super();
		this.fechaEnvasado=fechaenvasado;
		this.paisOrigen=paisorigen;
		this.setFechaVencimiento(fechaVencimiento);
		this.setNroLote(nroLote);		
		// TODO Auto-generated constructor stub
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
	
	
	
	
}
