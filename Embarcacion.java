package proyectoFinal;

public class Embarcacion extends Socio {
	private String matricula, nombre, tipo, fechaAmarre;
	private int alto, ancho, largo, dimension;
	
	public Embarcacion(String _matricula, String _nombre, String _tipo, String _fechaAmarre, int _alto, int _ancho, int _largo) {
		this.matricula = _matricula;
		this.nombre = _nombre;
		this.tipo = _tipo;
		this.fechaAmarre = _fechaAmarre;
		this.alto = _alto;
		this.ancho = _ancho;
		this.largo = _largo;
		
	}
	
	@Override
	
	public void imprimirDatos() {
		this.dimension = alto * ancho * largo;
		System.out.println("El número de matrícula es: " + matricula + " el nombre es: " + nombre + " el tipo de embarcacion es: " 
				+ tipo + "\nfecha de amarre : " + fechaAmarre + " el alto es: " + alto + " el ancho es: " + ancho +
				" el largo es: " + largo + " la dimensión total es de: " + dimension);
		
	}
		
	
	
}


