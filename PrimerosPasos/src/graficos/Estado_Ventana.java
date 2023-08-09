package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Estado_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEstado mimarco=new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		setTitle("Trabajando con estados de ventana");
		setSize(400,200);
		setLocationRelativeTo(null);
		
		estadosVentana miestado=new estadosVentana();
		
		addWindowStateListener(miestado);
		
	}
	
}

class estadosVentana implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Se ha cambiado de estado");
		
		if(e.getNewState()==Frame.ICONIFIED) { // evento cuando se minimiza la ventana
			System.out.println("La ventana se ha minimizado");			
		}else if(e.getNewState()==Frame.NORMAL) { //evento cuando se activa la ventana
			System.out.println("La ventana esta activa");
		}else if(e.getNewState()==Frame.MAXIMIZED_BOTH) {//evento cuando se maximiza la ventana
			System.out.println("La ventana se ha maximizado");
		}
		
	}
	
	
}

