package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Coche micoche=new Coche();
		 * 
		 * micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		 * 
		 * System.out.println(micoche.dime_datos_generales());
		 * System.out.println(micoche.dime_color());
		 * micoche.configura_asientos_cuero(JOptionPane.
		 * showInputDialog("¿Con asiento de cuero? si/no"));
		 * 
		 * System.out.println(micoche.dime_asientos_cuero());
		 * 
		 * micoche.configura_climatizador(JOptionPane.
		 * showInputDialog("¿Con climatizador? si/no"));
		 * System.out.println(micoche.dime_climatizador());
		 * 
		 * System.out.println(micoche.peso_coche());
		 * 
		 * System.out.println("El precio total del coche es: "+micoche.precio_coche());
		 */
		
		Coche micoche1= new Coche();
		micoche1.establece_color("Verde");
		
		Furgoneta mifurgoneta1=new Furgoneta(580,7);
		mifurgoneta1.establece_color("Negro");
		mifurgoneta1.configura_asientos_cuero("si");
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales()+" " + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales()+" "+mifurgoneta1.dimeDatosFurgoneta());
		
		


	}

}
