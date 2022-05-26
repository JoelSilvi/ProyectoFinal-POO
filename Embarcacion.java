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
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaAmarre() {
		return fechaAmarre;
	}

	public void setFechaAmarre(String fechaAmarre) {
		this.fechaAmarre = fechaAmarre;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	@Override
	
	public void imprimirDatos() {
		this.dimension = alto * ancho * largo;
		System.out.println("El número de matrícula es: " + matricula + " el nombre es: " + nombre + " el tipo de embarcacion es: " 
				+ tipo + "\nfecha de amarre : " + fechaAmarre + " el alto es: " + alto + " el ancho es: " + ancho +
				" el largo es: " + largo + " la dimensión total es de: " + dimension);
		
	}
		
	
	
}


