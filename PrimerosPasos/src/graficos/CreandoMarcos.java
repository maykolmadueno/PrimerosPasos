package graficos;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco= new Marco();

	}

}

class Marco extends JFrame{
	
	public Marco() {
		
		setVisible(true);
		//setSize(500, 300);
		//setLocation(500,300);
		//setLocationRelativeTo(null);
		setBounds(500,300,500,300);
		//setResizable(false);
		//setExtendedState(MAXIMIZED_BOTH);
		setTitle("Mi primer programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
