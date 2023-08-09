
public class Ejemplo_array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] saldo= new double[5][6];
		double acum=0.10;
		double num;
		
		
		for(int i=0;i<6;i++) {
			
			saldo[0][i]=10000;
			num=10000;
			
			for(int j=1;j<5;j++) {
				
				saldo[j][i]=num+num*acum;
				
				num=num+num*acum;
			}
			acum=acum+0.01;
		}
		
		
	
		
		for(int k=0;k<5;k++) {
			
			System.out.println();
			
			for(int m=0;m<6;m++) {	
				
				System.out.printf("%1.2f",saldo[k][m]);
				System.out.print(" ");
				
			}
		}
		
		// Nos quedamos en el video 27
	
		
		

	}

}
