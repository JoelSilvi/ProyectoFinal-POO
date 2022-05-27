package proyectoFinal;


//Se crea clase con sus atributos

public class Amarre extends ClubNautico {
	private String numeroAmarre, lecturaContadorAgua, lecturaContadorLuz, servicioDeMantenimiento, fechaAmarre;
	
	//Se crea constructor por defecto
	public Amarre() {
		
	}
	
	//Se generan los getters y setters
	
	public String getFechaAmarre() {
		return fechaAmarre;
	}

	public void setFechaAmarre(String fechaAmarre) {
		this.fechaAmarre = fechaAmarre;
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
	
	//Se crea constructor con parámetros

	public Amarre(String _numeroAmarre, String _lecturaContadorAgua, String _lecturaContadorLuz, String _servicioDeMantenimiento, String _fechaAmarre) {
		this.numeroAmarre = _numeroAmarre;
		this.lecturaContadorAgua = _lecturaContadorAgua;
		this.lecturaContadorLuz = _lecturaContadorLuz;
		this.servicioDeMantenimiento = _servicioDeMantenimiento;
		this.fechaAmarre = _fechaAmarre;
		
	}
	
	
	//Se realiza uso del método de la superclase	

	@Override
	public void imprimirDatos() {
		System.out.println("Este número de amarre es: " + numeroAmarre + " la lectura de agua corresponde a: " 
						+ lecturaContadorAgua + "\nla lectura de luz corresponde a: " + lecturaContadorLuz + 
						", cuenta con servicio de mantenimiento: " + servicioDeMantenimiento + "\nfecha de amarre : " + fechaAmarre);
	}
}
