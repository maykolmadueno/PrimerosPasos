package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;



public class ValidarFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente=false;
		
		String[] nombreDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String s:nombreDeFuentes) {
			//System.out.println(s);
			if(fuente.equalsIgnoreCase(s)) {
				estalafuente=true;
			}
			
		}
		
		if(estalafuente) {
			System.out.println("La fuente se encuentra instalada");
		}else {
			System.out.println("La fuente no se encuentra instalada");
		}
		
		
	}

}
