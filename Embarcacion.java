package proyectoFinal;

//Se crea clase con sus atributos

public class Embarcacion extends Socio {
	private String matricula, nombre, tipo;
	private int alto, ancho, largo, dimension;

	//Se crea constructor por defecto
	public Embarcacion() {

	}
	
	//Se crea constructor con parámetros

	public Embarcacion(String _matricula, String _nombre, String _tipo, int _alto, int _ancho,
			int _largo) {
		this.matricula = _matricula;
		this.nombre = _nombre;
		this.tipo = _tipo;
		this.alto = _alto;
		this.ancho = _ancho;
		this.largo = _largo;

	}
	
	// Se generan los getters y setters

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
	
	//Se realiza uso del método de la superclase

	@Override
	public void imprimirDatos() {
		this.dimension = alto * ancho * largo;
		System.out.println("El número de matrícula es: " + matricula + " el nombre es: " + nombre
				+ " el tipo de embarcacion es: " + tipo + "\nel alto es: " + alto
				+ " el ancho es: " + ancho + " el largo es: " + largo + " la dimensión total es de: " + dimension);

	}

}
