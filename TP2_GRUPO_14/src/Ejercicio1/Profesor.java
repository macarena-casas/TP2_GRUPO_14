package Ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {

	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		super();
		cargo ="sin cargo";
		antiguedadDocente = 0;
	}
	
	public Profesor(String nombre, String cargo,int edad, int antiguedadDocente) {
		super();
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
		this.setEdad(edad);
		this.setNombre(nombre);
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//P4 Sobreescribir el m�todo �toString()�
	@Override
	public String toString() {
		return " id: " + getId() + " , nombre: " + getNombre() + ", edad: " + getEdad() + ", cargo: " + cargo + ", antiguedad del Docente: " + antiguedadDocente;
	}

	@Override
	public int compareTo(Profesor o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Profesor profesor = (Profesor) obj;
	    return this.getEdad() == profesor.getEdad() &&
	           this.getAntiguedadDocente() == profesor.getAntiguedadDocente() &&
	           this.getNombre().equals(profesor.getNombre()) &&
	           this.getCargo().equals(profesor.getCargo());
	}
	

	
}
