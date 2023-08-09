package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco1 mimarco= new Marco1();
		
		
		

	}

}

class Marco1 extends JFrame{
	
	public Marco1() {
		Toolkit obj=Toolkit.getDefaultToolkit();
		
		Dimension screensize=obj.getScreenSize();
		
		int screenWidth =screensize.width;
		int screenHeight =screensize.height;
		
		setSize(screenWidth/2,screenHeight/2);
		
		setLocation(screenWidth/4,screenHeight/4);
		
		setTitle("Este programa esta demasiado bien");
		
		Image miimagen=obj.getImage("src/graficos/icono.png");
		
		setIconImage(miimagen);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}
	
}