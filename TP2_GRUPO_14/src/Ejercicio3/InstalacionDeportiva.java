package Ejercicio3;

public class InstalacionDeportiva {
	private String TipoDeInstalacion;

	
	
	public InstalacionDeportiva() {
		super();
		TipoDeInstalacion = "sin información";
	}
	public InstalacionDeportiva(String tipoDeInstalacion) {
		super();
		TipoDeInstalacion = tipoDeInstalacion;
	}

	public String getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}

	public void setTipoDeInstalacion(String tipoDeInstalacion) {
		TipoDeInstalacion = tipoDeInstalacion;
	}
	

}
