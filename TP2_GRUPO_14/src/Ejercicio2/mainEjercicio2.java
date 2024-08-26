package Ejercicio2;


public class mainEjercicio2 extends Producto { 
	
	public static void main(String[] args) {
		
	ProductoFresco PF = new ProductoFresco( "2024-09-01", "Argentina","2024-12-01",1010);
	ProductoFresco PF2 = new ProductoFresco( );
	ProductoCongelado PC = new ProductoCongelado(5,"2024-12-01",1010);
	ProductoCongelado PC2 = new ProductoCongelado();
	ProductoRefrigerado PR = new ProductoRefrigerado( "2024", "2024-09-01",1515);
	ProductoRefrigerado PR2 = new ProductoRefrigerado();
	
	
	System.out.println(PF.toString());
	System.out.println(PF2.toString());
	System.out.println(PC.toString());
	System.out.println(PC2.toString());
	System.out.println(PR.toString());
	System.out.println(PR2.toString());
	}

	
}
