package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Evetos_ventana_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoVentana_2 mimarco1=new marcoVentana_2();
		marcoVentana_2 mimarco2=new marcoVentana_2();
		
		mimarco1.setTitle("Ventana 1");
		mimarco1.setBounds(300,300,400,200);
		mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco1.setVisible(true);
		
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(900,300,400,200);
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco2.setVisible(true);

	}

}

class marcoVentana_2 extends JFrame{
	
	public marcoVentana_2() {
		//setTitle("trabajando con ventanas");
		//setBounds(300, 300, 400, 200);
		
		addWindowListener(new WindowAdapter() {
			public void windowIconified(WindowEvent e){
				System.out.println("Se ha minimizado la ventana");
			}
			public void windowDeiconified(WindowEvent e){
				System.out.println("Se ha restaurado la ventana");
			}
			public void windowClosing(WindowEvent e) {
				System.out.println("Se esta cerrando la ventana");
			}
		});
		
		
		
	}
	
}