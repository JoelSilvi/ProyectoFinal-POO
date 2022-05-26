package proyectoFinal;

public class Instalacion extends ClubNautico {
	private int idInstalacion;
	private String administrador, ciudad, direccion, telefono;

	public Instalacion (int _idInstalacion, String _administrador, String _ciudad, String _direccion, String _telefono) {
		this.idInstalacion = _idInstalacion;
		this.administrador = _administrador;
		this.ciudad = _ciudad;
		this.direccion = _direccion;
		this.telefono = _telefono; 
	}
	
	@Override
	public void imprimirDatos() {
		System.out.println("El ID es: " + idInstalacion + " el administrador es : " + administrador +
				" se encuentra en la ciudad " + ciudad + "\nsu dirección es: " + direccion +  " y su número es: " + telefono);
	}

}