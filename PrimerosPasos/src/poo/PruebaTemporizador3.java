package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj(3000,true);
		
		mireloj.iniciarReloj();
		
		JOptionPane.showMessageDialog(null, "El reloj esta corriendo");
		
		System.exit(0);
		
		
		class Reloj implements ActionListener{
			
			private int intervalo;
			private boolean sonido;			
			
			Timer tempo=new Timer(intervalo,this);
			
			public Reloj(int intervalo, boolean sonido) {
				this.intervalo=intervalo;
				this.sonido=sonido;
			}
			
			public void iniciaTempo() {
			
				tempo.start();
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("La hora se va a mostra cada de 3 segundos: "+tempo);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
			
		}
		

	}

}

