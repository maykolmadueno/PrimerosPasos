package graficos;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Eventos_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ventanaMarco mimarco1= new ventanaMarco();
		ventanaMarco mimarco2= new ventanaMarco();
		
		mimarco1.setTitle("Ventana 1");
		mimarco1.setBounds(300, 200, 400, 200);
		mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mimarco1.setVisible(true);
		
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(900, 200, 400, 200);
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		mimarco2.setVisible(true);
		

	}

}

class ventanaMarco extends JFrame{
	public ventanaMarco() {
		//setTitle("Trabajando con ventanas");
		//setBounds(300, 200, 400, 200);
		
		workVentanas listener=new workVentanas();
		
		addWindowListener(listener);
		
	}
}

class workVentanas implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha abierto la ventana");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha cerrado la ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha sido cerrada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha minimizado la ventana");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha restaurado la ventana");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana se encuentra activa");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana se encuentra desactivada");
		
	}
	
}