package Ejercicio1;

import java.util.ArrayList;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> listaProfes = new ArrayList<Profesor>(5);
		listaProfes.add(new Profesor());
		listaProfes.add(new Profesor("Pablo","Director",50,10));
		listaProfes.add(new Profesor("Vanesa","Profesora",25,3));
		listaProfes.add(new Profesor("Germandio","Buen tipo",30,5));
		listaProfes.add(new Profesor("Litonia","Directora",40,7));
		
		for(int i=0; i<listaProfes.size(); i++) {
			System.out.println(listaProfes.get(i).toString());
		}
	}

}
