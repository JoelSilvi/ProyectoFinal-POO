package proyectoFinal;

public class Empleado extends ClubNautico {
	private int IDEmpleado;
	private String nombre, apellido, direccion, numCelular, RUT;

	public Empleado(int _IDEmpleado, String _nombre, String _apellido, String _direccion, String _numCelular,
			String _RUT) {
		this.IDEmpleado = _IDEmpleado;
		this.nombre = _nombre;
		this.apellido = _apellido;
		this.direccion = _direccion;
		this.numCelular = _numCelular;
		this.RUT = _RUT;
	}

	public void imprimirDatos() {
		System.out.println(
				"El ID del empleado es: " + IDEmpleado + " el nombre es: " + nombre + " el apellido es : " + apellido
						+ "\nla direccion es : " + direccion + " tiene el número " + numCelular + " con el Rut " + RUT);

	}
}
