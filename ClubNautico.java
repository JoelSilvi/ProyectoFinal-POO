package proyectoFinal;

public class ClubNautico {
	private int IDClub;
	private String Nombre;
	
	
	public void imprimirDatos() {
		
	}
	
	public static void main(String[] args) {
		Socio socio = new Socio("Juan", "Melipilla", "16587698-0", "24-03-2020", "99003456");
		socio.imprimirDatos();
		
		Amarre amarre = new Amarre("20", "202212", "78992", "Si");
		amarre.imprimirDatos();
		
		Embarcacion embarcacion = new Embarcacion("XS-76-18", "La perla", "Bote", "23-04-2022", 20, 30, 15);
		embarcacion.imprimirDatos();
		
		Empleado empleado = new Empleado(5, "Julio", "Diaz", "Los Olmos 234", "98662109", "14.987.276-3");
		empleado.imprimirDatos();
		
		Instalacion instalacion = new Instalacion(23, "Felipe Barros", "Santiago", "Los Guindos 344", "98735462");
		instalacion.imprimirDatos();
		
		
		
	}
}
