import javax.swing.JOptionPane;

public class Uso_arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises= new String[8];
		
		//Utilizando for each
		
		
		for(int i=0;i<paises.length;i++) {
			paises[i]=JOptionPane.showInputDialog("Escriba el país "+(i+1)+" : ");
		}
		
		for(String elemento:paises) {
			System.out.println(elemento);
		}

	}

}
