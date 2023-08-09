package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Eventos_Raton_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton2 mimarco= new MarcoRaton2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoRaton2 extends JFrame{
	
	public MarcoRaton2() {
		setTitle("Trabajando con eventos de raton");
		setSize(500,250);
		setLocationRelativeTo(null);
		
		eventoRaton2 listener=new eventoRaton2();
		
		addMouseListener(listener);
		
		
	}
	
}

class eventoRaton2 extends MouseAdapter{

	
	/*public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Coordenada en e X: "+e.getX()+" Coordenada en Y: "+ e.getY());
		System.out.println("Número de clicks: "+e.getClickCount());
		
	}*/
	
	// Este método nos ayuda determinar que lado del raton ha sido presionado
	
	public void mousePressed(MouseEvent e) {
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Ud ha presionado el click izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Ud ha presioando la rueda del ratón");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Ud ha presionado el click derecho");
		}
	}
	

	
}