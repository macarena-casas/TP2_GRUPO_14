package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;



public class mainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> listaProfes = new ArrayList<Profesor>(5);
		listaProfes.add(new Profesor());
		listaProfes.add(new Profesor("Pablo","Director",50,10));
		listaProfes.add(new Profesor("Vanesa","Profesora",25,3));
		listaProfes.add(new Profesor("Germandio","Buen tipo",30,5));
		listaProfes.add(new Profesor("Litonia","Directora",40,7));
		
		Iterator<Profesor> it = listaProfes.iterator();
		
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
		
		Profesor pr1 = new Profesor("Fulano","Buen tipo",30,5);
        Profesor pr2 = new Profesor("Fulano","Buen tipo",30,5);
        
        if(pr1.equals(pr2)) {
        	System.out.println("Es el mismo profesor");
        }else {
        	 System.out.println("No es el mismo profesor");
        }
        
		
	}

}
