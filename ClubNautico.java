package proyectoFinal;


//Se crea clase con sus atributos

public class ClubNautico {
	private int IDClub;
	private String nombre;
	
	
	
	// se crea método que será usado desde las otras clases
	public void imprimirDatos() {
		
	}
	
	//Se generan los getters y setters
	
	public int getIDClub() {
		return IDClub;
	}

	public void setIDClub(int iDClub) {
		IDClub = iDClub;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

	
	//Se genera método main con sus instancias y objetos
	
	public static void main(String[] args) {
		Socio socio = new Socio("Juan", "Melipilla", "16587698-0", "24-03-2020", "99003456");
		socio.imprimirDatos();
		
		Amarre amarre = new Amarre("20", "202212", "78992", "Si", "23-04-2022");
		amarre.imprimirDatos();
		
		Embarcacion embarcacion = new Embarcacion("XS-76-18", "La perla", "Bote", 20, 30, 15);
		embarcacion.imprimirDatos();
		
		Empleado empleado = new Empleado(5, "Julio", "Diaz", "Los Olmos 234", "98662109", "14.987.276-3");
		empleado.imprimirDatos();
		
		Instalacion instalacion = new Instalacion(23, "Felipe Barros", "Santiago", "Los Guindos 344", "98735462");
		instalacion.imprimirDatos();
		
		
		
	}
}
