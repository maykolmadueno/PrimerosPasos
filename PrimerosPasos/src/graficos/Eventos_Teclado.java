package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Eventos_Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoTecla mimarco=new marcoTecla();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class marcoTecla extends JFrame{
	
	public marcoTecla() {
		
		setTitle("Trabajando con eventos de teclado");
		setSize(500,250);
		setLocationRelativeTo(null);
		
		eventoTecla listener=new eventoTecla();
		
		addKeyListener(listener);
		
		
	}
	
}

class eventoTecla implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.print("Se ha presionado un boton ");
		
		char caracter=e.getKeyChar();
		
		System.out.println(caracter);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}



