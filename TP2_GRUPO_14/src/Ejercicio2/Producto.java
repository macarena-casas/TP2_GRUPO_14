package Ejercicio2;

public class Producto {
	
	private String fechaVencimiento;
	private int nroLote;
	
	
	public Producto(String fechaVencimiento, int nroLote) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.nroLote = nroLote;
	}


	public String getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	public int getNroLote() {
		return nroLote;
	}


	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}
	
	@Override
	public String toString() {
		return " con fecha vencimiento= " + fechaVencimiento + "\nnro. lote= " + nroLote;
	}
	
	
	

}
