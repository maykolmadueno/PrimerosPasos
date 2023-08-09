package graficos;


import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton3 mimarco= new MarcoRaton3();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoRaton3 extends JFrame{
	
	public MarcoRaton3() {
		setTitle("Trabajando con eventos de raton");
		setSize(500,250);
		setLocationRelativeTo(null);
		
		eventoRaton3 listener=new eventoRaton3();
		
		addMouseMotionListener(listener);
		
		
	}
	
}

class eventoRaton3 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando el ratón");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el ratón");
		
	}
	

	

	
}