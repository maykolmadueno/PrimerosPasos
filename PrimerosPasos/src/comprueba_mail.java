import javax.swing.JOptionPane;

public class comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba=0;
		int punto=0;
		
		
		
		String mail=JOptionPane.showInputDialog("Ingresa tu email");
		
		for(int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
				
			}else if(mail.charAt(i)=='.') {
				punto++;
			}
		}
		
		
		if(arroba==1 && punto>=1) {
			System.out.println("Correcto");;
		}else {
			System.out.println("Incorrecto");
		}

	}

}
