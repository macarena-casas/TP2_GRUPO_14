package Ejercicio2;

public class Producto {
	
	private String fechaVencimiento;
	private String nombre;
	private int nroLote;
	private static int cont=999;
	
	public Producto() {
		super();
		this.fechaVencimiento = "Sin Fecha de Vencimiento";
		this.nombre = "Sin nombre";
		cont++;
		this.nroLote = cont;
	}
	public Producto(String fechaVencimiento, String nombre) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.nombre = nombre;
		cont++;
		this.nroLote = cont;
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

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return " con fecha vencimiento= " + fechaVencimiento + "\nnro. lote= " + nroLote + ", Nombre del producto: " + nombre ;
	}
	
	
	

}
