import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Escriba el área que desea calcular");
		System.out.println("1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Círculo");
		
		int tipo=obj.nextInt();
		
		switch (tipo) {
		case 1: {
			String lado=JOptionPane.showInputDialog("Escriba el lado del cuadrado");
			int lado1=Integer.parseInt(lado);
			
			System.out.println("El area del cuadrado es: "+Math.pow(lado1, 2) );
			break;
			
		}
		case 2: {
			String base=JOptionPane.showInputDialog("Escriba la base del rectangulo");			
			int base1=Integer.parseInt(base);
			String altura=JOptionPane.showInputDialog("Escriba la altura del rectangulo");			
			int altura1=Integer.parseInt(altura);
			
			System.out.println("El area del rectangulo es: "+(base1*altura1) );
			break;
			
		}
		case 3: {
			String base=JOptionPane.showInputDialog("Escriba la base del triangulo");			
			int base1=Integer.parseInt(base);
			String altura=JOptionPane.showInputDialog("Escriba la altura del triangulo");			
			int altura1=Integer.parseInt(altura);
			
			System.out.println("El area del triangulo es: "+(base1*altura1)/2 );
			break;
		}
		case 4: {
			String radio=JOptionPane.showInputDialog("Escriba el radio del circulo");			
			int radio1=Integer.parseInt(radio);
				
			System.out.println("El area del círculo es: ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio1, 2)));
			
			break;
			
		}
		default:
			System.out.println("La opción no es correcta");
		
		}
		

	}

}
