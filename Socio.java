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
	
	
	@Override
	public void imprimirDatos() {
		System.out.println("El se�or: " + nombre + " tiene direcci�n en: " + direccion + " Su RUT es: " + RUT + " \ningres� el: " +
							fechaIngresoClub + " y su tel�fono es: " + telefono);
	}
	
	
}
