package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoColor mimarco= new MarcoColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoColor extends JFrame{
	
	public MarcoColor() {
		
		setTitle("Trabajando con colores");
		setSize(400,300);
		setLocationRelativeTo(null);
		LaminaColor milamina=new LaminaColor();
		add(milamina);
		
		
		
	}
	
}

class LaminaColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		// Dibujo del rectangulo
		Rectangle2D rectangulo=new Rectangle2D.Double();
		
		rectangulo.setFrame(100, 50, 200, 150);
		
		g2.setPaint(Color.black); //elegir un color, por defecto es negro
		
		g2.draw(rectangulo);	// dibujar un objeto con el color elegido
		
		g2.setPaint(Color.red); // elegir un color
		
		g2.fill(rectangulo); // rellenar con el color elegido un objeto
		
		//Dibujo de la elipse
		
		Ellipse2D elipse=new Ellipse2D.Double();
				
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(109,172,59).darker());
		
		g2.fill(elipse);
		
		setBackground(SystemColor.window);
		
		
		
	}
	
}