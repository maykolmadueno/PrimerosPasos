import javax.swing.JOptionPane;

public class evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String edad_i=JOptionPane.showInputDialog("Introduce tu edad: ");
		
		int edad=Integer.parseInt(edad_i);
		
		if(edad>0 && edad<=11){
			
			System.out.println("Eres un niño");
			
		}else if(edad>11 && edad<=17){
			
			System.out.println("Eres un adolescente");
			
		}else if(edad>17 && edad<=25){
			
			System.out.println("Eres un joven");
			
		}else if(edad>25 && edad<=75){
			
			System.out.println("Eres un adulto");
		}else {
			System.out.println("Cuidate");
		}
		
		
		// el video que sigue es el número 17
		
		

	}

}
