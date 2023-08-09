
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mi_matriz=new int[5];
		
		mi_matriz[0]=2;
		mi_matriz[1]=5;
		mi_matriz[2]=7;
		mi_matriz[3]=8;
		mi_matriz[4]=9;
		
		for(int i=0;i<mi_matriz.length;i++) {
			System.out.println("Valor del indice "+i+" = "+mi_matriz[i]);
		}
		System.out.println("/////////////////////////////////////////////////////");
		//otra forma de declara una matriz
		
		int[] mi_matriz2= {2,5,-2,3,4,7,9,12,15,18,25,100};
		
		for(int i=0;i<mi_matriz2.length;i++) {
			System.out.println("Valor del indice "+i+" = "+mi_matriz2[i]);
		}

	}

}
