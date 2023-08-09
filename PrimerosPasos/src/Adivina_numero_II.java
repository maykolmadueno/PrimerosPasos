import javax.swing.JOptionPane;

public class Adivina_numero_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);
		
		int num=0;
		
		int intentos=0;
		
		do {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
			
			if(num>aleatorio) {
				System.out.println("Mas abajo");
			}else if(num<aleatorio) {
				System.out.println("Mas arriba");
			}
			
			intentos++;
			
			
		}while(aleatorio!=num);
		
		System.out.println("Felicidades has acertado...");
		System.out.println("Lo has conseguido luego de " +intentos+" intentos");

	}

}
