import java.util.Iterator;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número "));
		int factorial=1;
		
		for(int i=num;i>0;i--) {
			
			factorial=factorial*i;
			
		}
		System.out.println("el factorial de "+ num+" es: " + factorial);

	}
	
	//Nos quedamos en el video numero 23

}
