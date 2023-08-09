package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventosI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEv mimarco= new MarcoEv();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoEv extends JFrame{
	
	public MarcoEv() {
		setTitle("Trabajando con eventos");
		setSize(600,400);
		setLocationRelativeTo(null);
		
		LaminaEv milamina=new LaminaEv();
		
		add(milamina);
		
		
		
		
	}
	
	
}

class LaminaEv extends JPanel{
	
	JButton colorRojo=new JButton("Rojo");
	JButton colorVerde=new JButton("Verde");
	JButton colorAmarillo=new JButton("Amarillo");
			
	
	public LaminaEv() {
		add(colorRojo);
		add(colorVerde);
		add(colorAmarillo);
		
				
		colorRojo.addActionListener(new ColorEv(Color.red));
		colorVerde.addActionListener(new ColorEv(Color.green));
		colorAmarillo.addActionListener(new ColorEv(Color.yellow));
	}
	
	class ColorEv  implements ActionListener{
		
		public ColorEv(Color c) {
					
			colorFondo=c;		
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			setBackground(colorFondo);
			
			
			
		}
		
		private Color colorFondo;
			
		
	}
	
}


