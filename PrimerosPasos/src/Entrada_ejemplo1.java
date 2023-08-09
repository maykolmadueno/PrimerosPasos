import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre completo por favor: ");
		String nombre=obj.nextLine();
		System.out.println("Ingrese su edad : ");
		int edad=obj.nextInt();
		
		System.out.println("Su nombre completo es "+nombre+" y el proximo año tendra "
				+(edad+1));
		

	}

}
