package Ejercicio3;
import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Iedificio> instalaciones = new ArrayList<>();
		
		// 3 polideportivos
		Polideportivo poli1 = new Polideportivo(100 , "Polideportivo Uno");
		Polideportivo poli2 = new Polideportivo(200 , "Polideportivo Dos");
		Polideportivo poli3 = new Polideportivo(300 , "Polideportivo Tres");
		
		// 2 edificios 
		EdificioOficinas edi1 = new EdificioOficinas(1000, 10, 10);
		EdificioOficinas edi2 = new EdificioOficinas(3000, 15, 5);
		
		//agregamos a la lista
		
		instalaciones.add(poli1);
		instalaciones.add(poli2);
		instalaciones.add(poli3);
		instalaciones.add(edi1);
		instalaciones.add(edi2);
		
		//iterator
		
		ListIterator<Iedificio> it = instalaciones.listIterator();
		while (it.hasNext()) {
			Iedificio edificio = it.next()	;
			System.out.println(edificio.toString());
		}
		
	}
}
