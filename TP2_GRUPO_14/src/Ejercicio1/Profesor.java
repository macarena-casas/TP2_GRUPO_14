package Ejercicio1;

public class Profesor extends Empleado {

	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		super();
		cargo ="sin cargo";
		antiguedadDocente = 0;
	}
	
	public Profesor(String cargo, int antiguedadDocente) {
		super();
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
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
	
	//P4 Sobreescribir el método “toString()”
	@Override
	public String toString() {
		return " id: " + getId() + " , nombre: " + getNombre() + ", edad: " + getEdad() + ", cargo: " + cargo + ", antiguedadDocente: " + antiguedadDocente;
	}

	
}
