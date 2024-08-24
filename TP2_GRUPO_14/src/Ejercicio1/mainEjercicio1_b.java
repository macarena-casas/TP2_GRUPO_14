package Ejercicio1;
import java.util.Iterator;
import java.util.TreeSet;
public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> arbolProfes = new TreeSet<Profesor>();
		Profesor p1 = new Profesor();
		Profesor p2 = new Profesor("Pablo","Director",50,10);
		Profesor p3 = new Profesor("Vanesa","Profesora",25,3);
		Profesor p4 = new Profesor("Germandio","Buen tipo",30,5);
		Profesor p5 = new Profesor("Litonia","Directora",40,7);
		
		arbolProfes.add(p1);
		arbolProfes.add(p2);
		arbolProfes.add(p3);
		arbolProfes.add(p4);
		arbolProfes.add(p5);
		
		Iterator<Profesor> it = arbolProfes.iterator();
		while(it.hasNext()) {
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}

		

		

	}

}
