package proyectoFinal;

public class Amarre extends ClubNautico {
	private String numeroAmarre, lecturaContadorAgua, lecturaContadorLuz, servicioDeMantenimiento;
	
	public Amarre() {
		
	}
	
	public String getNumeroAmarre() {
		return numeroAmarre;
	}

	public void setNumeroAmarre(String numeroAmarre) {
		this.numeroAmarre = numeroAmarre;
	}

	public String getLecturaContadorAgua() {
		return lecturaContadorAgua;
	}

	public void setLecturaContadorAgua(String lecturaContadorAgua) {
		this.lecturaContadorAgua = lecturaContadorAgua;
	}

	public String getLecturaContadorLuz() {
		return lecturaContadorLuz;
	}

	public void setLecturaContadorLuz(String lecturaContadorLuz) {
		this.lecturaContadorLuz = lecturaContadorLuz;
	}

	public String getServicioDeMantenimiento() {
		return servicioDeMantenimiento;
	}

	public void setServicioDeMantenimiento(String servicioDeMantenimiento) {
		this.servicioDeMantenimiento = servicioDeMantenimiento;
	}

	public Amarre(String _numeroAmarre, String _lecturaContadorAgua, String _lecturaContadorLuz, String _servicioDeMantenimiento) {
		this.numeroAmarre = _numeroAmarre;
		this.lecturaContadorAgua = _lecturaContadorAgua;
		this.lecturaContadorLuz = _lecturaContadorLuz;
		this.servicioDeMantenimiento = _servicioDeMantenimiento;
		
	}
	
	@Override
	public void imprimirDatos() {
		System.out.println("Este número de amarre es: " + numeroAmarre + " la lectura de agua corresponde a: " 
						+ lecturaContadorAgua + "\nla lectura de luz corresponde a: " + lecturaContadorLuz + 
						", cuenta con servicio de mantenimiento: " + servicioDeMantenimiento);
	}
}
