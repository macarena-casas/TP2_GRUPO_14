package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;



public class mainEjercicio3 {

	public static void main(String[] args) {
		ArrayList<Polideportivo> listaPolideportivo = new ArrayList<Polideportivo>(5);
		listaPolideportivo.add(new Polideportivo(1000,"Los Troncos"));
		listaPolideportivo.add(new Polideportivo(1500,"El Zorzal"));
		listaPolideportivo.add(new Polideportivo(1600,"General Pacheco"));
	
Iterator<Polideportivo> it = listaPolideportivo.iterator();
		
		while(it.hasNext())
		{
			Polideportivo p = (Polideportivo) it.next();
			System.out.println(p.toString());
		}
		
	
			ArrayList<EdificioOficinas> listaEdificioOficina = new ArrayList<EdificioOficinas>(5);
			listaEdificioOficina.add(new EdificioOficinas(30,50,6));
			listaEdificioOficina.add(new EdificioOficinas(50,20,15));
		
	Iterator<EdificioOficinas> Eo = listaEdificioOficina.iterator();
			
			while(Eo.hasNext())
			{
				EdificioOficinas E = (EdificioOficinas) Eo.next();
				System.out.println(E.toString());
			}
			
		
		
	}

}
