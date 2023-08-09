package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_empleado {

	public static void main(String[] args) {
	
		Jefatura jefe_ti= new Jefatura("Maykol ferrer",15000,2024,07,01);
		jefe_ti.asignaIncentivo(1000);	
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Maykol madueño",10000,2020,12,17);
		misEmpleados[1]=new Empleado("Claudia aguirre",9000,2022,6,2);
		misEmpleados[2]=new Empleado("Leonida paredes",8000,2022,12,15);
		misEmpleados[3]=new Empleado("Victor ormeño");
		misEmpleados[4]=jefe_ti; //Polimorfismo en acción. Principio de sustitución
		misEmpleados[5]=new Jefatura("Mike dueno",11000,2025,06,01);
		
		Jefatura jefe_rrhh=(Jefatura) misEmpleados[5];
		jefe_rrhh.asignaIncentivo(7000);
		
				
		System.out.println(jefe_rrhh.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe "+jefe_rrhh.dameNombre()+" tiene un bonus de: "+
							jefe_rrhh.establece_bonus(500));
		System.out.println(misEmpleados[1].dameNombre()+" tiene un bonus de: "+ 
							misEmpleados[1].establece_bonus(100));
		
		
		for(Empleado empleado:misEmpleados) {
			empleado.aumentaSueldo(5);
		}
		
		Arrays.sort(misEmpleados); //ordenar de acuerdo a lo asignado por el usuario (id o sueldo) en la interface
		
		  for(Empleado iempleado:misEmpleados) { 
			  System.out.println(
					  "Nombre :"+ iempleado.dameNombre()+
					  " Sueldo: "+iempleado.dameSueldo()+ 
					  " Fecha de alta: "+iempleado.dameFechaContrato()); 
			  }
		 
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente;
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(anio,mes-1,dia);
		altaContrato=calendario.getTime();	
		++idSiguiente;
		id=idSiguiente;
	}
	
	public Empleado(String nom) {
		this(nom,10000,2015,05,05);
	}
	
	public String dameNombre() { //getter
		
		return nombre + " Id:"+id;
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

	//@Override
	public int compareTo(Object miObjeto) {
		// TODO Auto-generated method stub
		Empleado otroEmpleado= (Empleado) miObjeto;
		
		if(this.id<otroEmpleado.id) {
			return -1;
		}
		if(this.id>otroEmpleado.id) {
			return +1;
		}	
		
		
		return 0;
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}

	
}

class Jefatura extends Empleado implements Jefes{
	
	private double incentivo;
	
	public Jefatura(String nom, double sueldo, int anio, int mes, int dia) {
		super(nom,sueldo,anio,mes,dia);
	}
	
	public void asignaIncentivo(double b) { //setter
			
		incentivo=b;
		
	}
	
	public double dameSueldo() { //getter
		
		return super.dameSueldo()+incentivo;
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la desición de: "+decision;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	
	
	
}