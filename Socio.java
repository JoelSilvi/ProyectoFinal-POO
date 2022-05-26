package proyectoFinal;

public class Socio extends ClubNautico {
	private String nombre, direccion, RUT, fechaIngresoClub, telefono;
	
	public Socio() {
		
	}
	
	public Socio(String _nombre, String _direccion, String _RUT, String _fechaIngresoClub, String _telefono) {
		this.nombre = _nombre;
		this.direccion = _direccion;
		this.RUT = _RUT;
		this.fechaIngresoClub = _fechaIngresoClub;
		this.telefono = _telefono;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRUT() {
		return RUT;
	}

	public void setRUT(String rUT) {
		RUT = rUT;
	}

	public String getFechaIngresoClub() {
		return fechaIngresoClub;
	}

	public void setFechaIngresoClub(String fechaIngresoClub) {
		this.fechaIngresoClub = fechaIngresoClub;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public void imprimirDatos() {
		System.out.println("El señor: " + nombre + " tiene dirección en: " + direccion + " Su RUT es: " + RUT + " \ningresó el: " +
							fechaIngresoClub + " y su teléfono es: " + telefono);
	}
	
	
}
