package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***************Primera forma***********************/
		// ActionListener listener=new accion();
		
		// Timer miTemporizador=new Timer(5000,listener);
		
		/***************************************************/
		
		/***************Segunda forma***********************/
		Timer miTemporizador=new Timer(5000,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date fecha=new Date();
				System.out.println("La fecha actual es:" + fecha);
				Toolkit.getDefaultToolkit().beep();
			}
		});
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Se esta ejecutando el temporizador");
		
		miTemporizador.stop();
		
		

	}

}

class accion implements ActionListener{
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date fecha=new Date();
		// TODO Auto-generated method stub
		System.out.println("La fecha actual es:" + fecha);
		
	}
	
}
