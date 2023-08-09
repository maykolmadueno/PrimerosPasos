package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFuente mimarco=new MarcoFuente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoFuente extends JFrame{
	
	public MarcoFuente() {
		setTitle("Trabajando con fuentes");
		setSize(600,300);
		setLocationRelativeTo(null);
		
		LaminaFuente milamina=new LaminaFuente();
		
		//milamina.setForeground(Color.CYAN); // establece un color a todo lo que se agrege a la lamina
		
		add(milamina);
		
	}
}

class LaminaFuente extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		Font mifuente=new Font("Courier",Font.BOLD,24);// creamos la fuente
		
		g2.setFont(mifuente); //establecemos la fuente
		
		g2.setColor(Color.blue); //establecer color
		
		g2.drawString("Estamos trabajando con fuentes", 20, 100); // escribimos el texto
		
		// otra forma
		
		g2.setFont(new Font("Arial",Font.ITALIC,26)); //crear y establecer la fuente a la vez
		
		g2.setColor(Color.pink);
		
		g2.drawString("Otro tipo de letra", 20, 200);
		
	}
	
}