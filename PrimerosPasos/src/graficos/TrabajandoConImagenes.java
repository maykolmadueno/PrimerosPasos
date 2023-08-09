package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen mimarco=new MarcoImagen();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Trabajando con Imagenes");
		setSize(600,400);
		setLocationRelativeTo(null);
		
		LaminaImagen milamina=new LaminaImagen();
		
		add(milamina);
		
	}
	
}

class LaminaImagen extends JPanel{
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		//Graphics2D g2=(Graphics2D)g;
		
		
		 try {
			imagen=ImageIO.read(new File("src/graficos/bolita.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("No se encontro la imagen");
		}
		 g.drawImage(imagen, 0, 0, null);
		 
		int anchoI= imagen.getWidth(this);
		int altoI= imagen.getHeight(this);
		 
		 for(int i=0;i<600;i++) {
			 
			 for(int j=0;j<400;j++) {
				 if(i+j>0) {
					 g.copyArea(0, 0, anchoI, altoI, anchoI*i,altoI*j);
				 }
				 
			 }
		 }
		 
		
		
	}
	private Image imagen;
}
