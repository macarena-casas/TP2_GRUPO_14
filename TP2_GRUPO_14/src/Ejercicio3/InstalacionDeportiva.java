package Ejercicio3;

public class InstalacionDeportiva {
	private int TipoDeInstalacion;

	
	
	public InstalacionDeportiva() {
		super();
		TipoDeInstalacion = 0;
	}
	public InstalacionDeportiva(int tipoDeInstalacion) {
		super();
		TipoDeInstalacion = tipoDeInstalacion;
	}

	public int getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		TipoDeInstalacion = tipoDeInstalacion;
	}
	

}
