package proyectoFinal;

//Se crea clase con sus atributos

public class Instalacion extends ClubNautico {
	private int idInstalacion;
	private String administrador, ciudad, direccion, telefono;
	
	//Se crea constructor con parámetros

	public Instalacion (int _idInstalacion, String _administrador, String _ciudad, String _direccion, String _telefono) {
		this.idInstalacion = _idInstalacion;
		this.administrador = _administrador;
		this.ciudad = _ciudad;
		this.direccion = _direccion;
		this.telefono = _telefono; 
	}
	
	//Se generan los getters y setters
	
	public int getIdInstalacion() {
		return idInstalacion;
	}

	public void setIdInstalacion(int idInstalacion) {
		this.idInstalacion = idInstalacion;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	//Se realiza uso del método de la superclase

	@Override
	public void imprimirDatos() {
		System.out.println("El ID es: " + idInstalacion + " el administrador es : " + administrador +
				" se encuentra en la ciudad " + ciudad + "\nsu dirección es: " + direccion +  " y su número es: " + telefono);
	}

}