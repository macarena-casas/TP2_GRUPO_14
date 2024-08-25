package Ejercicio2;

public class ProductoCongelado extends Producto {
	
	private int Temperatura;
	
	public ProductoCongelado() {
		super();
	this.Temperatura=00;
	}
	
	public ProductoCongelado(int temperatura,String fechaVencimiento, int nroLote) {
		super(fechaVencimiento, nroLote);
		this.Temperatura=temperatura;
		
		
		// TODO Auto-generated constructor stub
	}

	public int getTempreratura() {
		return Temperatura;
	}

	public void setTempreratura(int tempreratura) {
		this.Temperatura = tempreratura;
	}

	@Override
	public String toString() {
		return " Temperatura: " + Temperatura + ", Fecha de vencimiento: " + getFechaVencimiento() + " Numero Lote: " + getNroLote();
	}


	
	

}

