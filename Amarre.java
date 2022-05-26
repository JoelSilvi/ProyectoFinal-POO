package proyectoFinal;

public class Amarre extends ClubNautico {
	private String numeroAmarre, lecturaContadorAgua, lecturaContadorLuz, servicioDeMantenimiento;
	
	public Amarre() {
		
	}
	
	public Amarre(String _numeroAmarre, String _lecturaContadorAgua, String _lecturaContadorLuz, String _servicioDeMantenimiento) {
		this.numeroAmarre = _numeroAmarre;
		this.lecturaContadorAgua = _lecturaContadorAgua;
		this.lecturaContadorLuz = _lecturaContadorLuz;
		this.servicioDeMantenimiento = _servicioDeMantenimiento;
		
	}
	
	@Override
	public void imprimirDatos() {
		System.out.println("Este número de amarre es: " + numeroAmarre + " la lectura de agua corresponde a: " 
						+ lecturaContadorAgua + "\nla lectura de luz corresponde a: " + lecturaContadorLuz + 
						", cuenta con servicio de mantenimiento: " + servicioDeMantenimiento);
	}
}
