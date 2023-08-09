package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] personas=new Persona[2];
		
		personas[0]= new Alumno("Josven nilton","redes");
		personas[1]= new Empleado1("Victor priale",2500,2020,12,01);
		
		for(Persona p: personas) {
			System.out.println(p.dameNombre()+" "+p.dameDescripcion());
		}

	}
	
}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom) {
		nombre=nom;
	}
	
	public String dameNombre() {
		
		return "El nombre es: "+nombre;
	}
	
	public abstract String dameDescripcion();
	
	
}

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom,String carr) {
		super(nom);
		carrera=carr;
	}
	
	public String dameDescripcion() {
		return " Alumno de la carrera de "+carrera;
	}
	
}

class Empleado1 extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente;
	
	public Empleado1(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(anio,mes-1,dia);
		altaContrato=calendario.getTime();	
		++idSiguiente;
		id=idSiguiente;
	}
	
	public String dameDescripcion() {
		return "El id del empleado es:" +id+" y tiene un sueldo de:"+sueldo;
	}
		
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void aumentaSueldo(double porcentaje) { //setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

	
}