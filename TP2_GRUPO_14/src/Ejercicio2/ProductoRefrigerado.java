package Ejercicio2;


public class ProductoRefrigerado extends Producto{
	
	private String codSupervision;
	
	
	public ProductoRefrigerado() {
		super();
		this.codSupervision="sin codigo";
	}

	public ProductoRefrigerado(String codsupervision, String fechaVencimiento,String nombre) {
		super();
		this.codSupervision=codsupervision;
		this.setFechaVencimiento(fechaVencimiento);
		this.setNombre(nombre);
		
				
		// TODO Auto-generated constructor stub
	}

	
	
	public String getCodSupervision() {
		return codSupervision;
	}

	public void setCodSupervision(String codSupervision) {
		this.codSupervision = codSupervision;
	}
	
	@Override
	public String toString() {
		return "Codigo de supervisión: "+ getCodSupervision() +", Fecha de vencimiento: " + getFechaVencimiento() + ", Numero de lote: " + getNroLote() + ", Nombre del producto: " + getNombre() ;
	}

	
}