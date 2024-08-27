package Ejercicio2;


public class ProductoFresco extends Producto{
	
	private String fechaEnvasado;
	private String paisOrigen;

	public ProductoFresco() {
		super();
		this.fechaEnvasado="sin Fecha";
		this.paisOrigen="País no especificado";
	
	}

	
	public ProductoFresco(String fechaenvasado, String paisorigen, String fechaVencimiento, String nombre) {
		super();
		this.fechaEnvasado=fechaenvasado;
		this.paisOrigen=paisorigen;
		this.setFechaVencimiento(fechaVencimiento);	
		this.setNombre(nombre);
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
	
	@Override
	public String toString() {
		return "Fecha de envasado: "+ fechaEnvasado +", Pais: " + paisOrigen + ", Nombre del producto: " + getNombre()  ;
	}
	
	
	
	
}
