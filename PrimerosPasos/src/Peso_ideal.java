import javax.swing.JOptionPane;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero="";
		int altura=0;
		
		int peso=0;
		
		do {
			
	    genero=JOptionPane.showInputDialog("Elige el sexo, M:mujer,V:varon");
		altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura"));
		
		if(genero.equalsIgnoreCase("M") && altura>150) {
			peso=altura-120;
			System.out.println("Su sexo es femenino y su peso ideal es:" +peso);
		}else if(genero.equalsIgnoreCase("V") && altura>150) {
			peso=altura-110;
			System.out.println("Su sexo es masculino y su peso ideal es:" +peso);
		}
		}while((genero.equalsIgnoreCase("m")||genero.equalsIgnoreCase("v"))==false || (altura>150)==false);
		
		
		
		//System.out.println("como "+ genero+ " su peso ideal es " + peso);
		

	}

}
