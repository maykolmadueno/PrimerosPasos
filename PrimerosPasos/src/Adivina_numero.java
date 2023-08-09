import javax.swing.JOptionPane;

public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double aleatorio=Math.round(Math.random()*100);
		
		int num_i=0;
		
		int intentos=0;
		
		while(num_i!=aleatorio) {
			//System.out.println(aleatorio);
			//System.out.println("Vuelve a intentarlo");
			num_i=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
			
			if(num_i>aleatorio) {
				System.out.println("mas bajo");
			}else if(num_i<aleatorio) {
				System.out.println("mas alto");
			}
			
			intentos++;
		}
		System.out.println("Felicidades acertaste con el número");
		System.out.println("Despues de "+intentos+" intentos");
		
		//Nos quedamos en el video # 20
		
	}

}
