import javax.swing.JOptionPane;

public class Peso_ideal_II {
	
	public static void main(String[] args) {
		
		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Intoduzca su genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura en cm"));
		
		int peso=0;
		
		if(genero.equalsIgnoreCase("M")) {
			peso=altura-120;
			genero="Femenino";
		}else if(genero.equalsIgnoreCase("H")) {
			peso=altura-110;
			genero="Masculino";
		}
		
		System.out.println("Su genero es "+genero+" y su peso ideal es "+peso+" kg");
	}

}
