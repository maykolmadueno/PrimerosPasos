import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String contra="maykolmf";
		
		String i_contra="";
		
		while(contra.equals(i_contra)==false) {
			
			i_contra=JOptionPane.showInputDialog("Ingrese la contraseña");
			
		}
		
		
		System.out.println("Bienvenido al sistema");
		
		

	}

}




