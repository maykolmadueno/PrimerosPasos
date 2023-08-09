import javax.swing.JOptionPane;

public class Entrada_ejemplo_II {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario= JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
		
		String edad= JOptionPane.showInputDialog("Introduce tu edad, por favor: " );
		
		int edad_usuario=Integer.parseInt(edad);
		

		System.out.println("Tu nombre es "+nombre_usuario+" y el año que viene tendras "+(edad_usuario+1));
				

	}

}
