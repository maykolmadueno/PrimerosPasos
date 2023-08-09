package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Reloj mireloj=new Reloj(3000,true);
	
	mireloj.iniciarReloj();
	
	JOptionPane.showMessageDialog(null, "El reloj se esta ejecutando");
	
	System.exit(0);
		
		

	}
	

}

class Reloj{
	
	private int numSeg;
	private boolean sonido;
	
	
	
	
	public Reloj(int numSeg ,boolean sonido ) {
		
		this.numSeg=numSeg;
		this.sonido=sonido;
		
	}
	

	
	
	public void iniciarReloj() {
		
		ActionListener listener= new Accion();
		
		Timer fechaactual=new Timer(numSeg,listener);
		
		
		fechaactual.start();
	}
	
	
	private class Accion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Date fecha= new Date();
			// TODO Auto-generated method stub
			System.out.println("La fecha actual es:"+fecha);
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
	}
	
	// nos quedamos en el video 54
	
	
}
