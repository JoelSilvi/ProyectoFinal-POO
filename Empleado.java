package proyectoFinal;

//Se crea clase con sus atributos

public class Empleado extends ClubNautico {
	private int IDEmpleado;
	private String nombre, apellido, direccion, numCelular, RUT;
	
	//Se crea constructor con parámetros

	public Empleado(int _IDEmpleado, String _nombre, String _apellido, String _direccion, String _numCelular,
			String _RUT) {
		this.IDEmpleado = _IDEmpleado;
		this.nombre = _nombre;
		this.apellido = _apellido;
		this.direccion = _direccion;
		this.numCelular = _numCelular;
		this.RUT = _RUT;
	}
	

	//Se generan los getters y setters
	
	public int getIDEmpleado() {
		return IDEmpleado;
	}


	public void setIDEmpleado(int iDEmpleado) {
		IDEmpleado = iDEmpleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNumCelular() {
		return numCelular;
	}


	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}


	public String getRUT() {
		return RUT;
	}


	public void setRUT(String rUT) {
		RUT = rUT;
	}


	//Se realiza uso del método de la superclase
	
	@Override
	public void imprimirDatos() {
		System.out.println(
				"El ID del empleado es: " + IDEmpleado + " el nombre es: " + nombre + " el apellido es : " + apellido
						+ "\nla direccion es : " + direccion + " tiene el número " + numCelular + " con el Rut " + RUT);

	}
}
