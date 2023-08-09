package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoG mimarco=new MarcoG();
		
		

	}

}

class MarcoG extends JFrame{
	
	public MarcoG() {
		setTitle("Este es mi marco");
		
		setSize(400,300);
		
		setLocation(600,300);
		
		LaminaG milamina=new LaminaG();
		
		add(milamina);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}

class LaminaG extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 300, 200);
		//g.drawLine(120, 80, 190, 200);
		//g.drawArc(50, 50, 200, 120, 90,90);
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double centroX=rectangulo.getCenterX();
		double centroY=rectangulo.getCenterY();
		
		double radio=125;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(centroX,centroY,centroX+radio,centroY+radio);
		
		g2.draw(circulo);
		
				
		
		
		
		
		
		
	}
	
}
