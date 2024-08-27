package Ejercicio2;

public class ProductoCongelado extends Producto {
	
	private int Temperatura;
	
	public ProductoCongelado() {
		super();
		this.Temperatura=00;
	}
	
	public ProductoCongelado(int temperatura,String fechaVencimiento, String nombre) {
		super(fechaVencimiento,nombre);
		this.Temperatura=temperatura;
		
		
		// TODO Auto-generated constructor stub
	}

	public int getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.Temperatura = temperatura;
	}

	@Override
	public String toString() {
		return " Temperatura: " + Temperatura + ", Fecha de vencimiento: " + getFechaVencimiento() + " Numero Lote: " + getNroLote() + ", Nombre del producto: " + getNombre() ;
	}


	
	

}

