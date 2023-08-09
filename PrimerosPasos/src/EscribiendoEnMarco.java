import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco=new MarcoConTexto();
		

	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400,200);
		
		setTitle("Primer texto");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel milamina = new Lamina();
		
		add(milamina);
		
		
		
		
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Este es un titulo", 200, 100);
		
	}
	
	
}