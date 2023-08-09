package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado1=new Empleados("Rosmery toledo");
		Empleados empleado2=new Empleados("Jackeline mendoza");
		Empleados empleado3=new Empleados("Rocio chancan");
		Empleados empleado4=new Empleados("Victor ormeño");
		
		
		empleado1.cambiaSeccion("Recursos humanos");
		empleado2.cambiaSeccion("Sala de control");
		empleado3.cambiaSeccion("Marketing");
		empleado4.cambiaSeccion("Compras y contrataciones");
		
		System.out.println(empleado1.devuelveDatos());
		System.out.println(empleado2.devuelveDatos());
		System.out.println(empleado3.devuelveDatos());
		System.out.println(empleado4.devuelveDatos());
		
		System.out.println(Empleados.devuelveIdSiguiente());

	}

}

class Empleados{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idsiguiente=1;
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="Administración";
		id=idsiguiente;
		
		idsiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) { //setter
		this.seccion=seccion;
	}
	
	public String devuelveDatos() {
		
		return "El nombre es: "+nombre + " , la sección es:"+seccion+" y el id: "+id;
		
	}
	
	public static String devuelveIdSiguiente() {
		return "el idsiguiente es:" +idsiguiente;
	}
	

	
	
}
