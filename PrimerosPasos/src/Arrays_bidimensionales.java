
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [][] matrix=new int[4][5];
		
		matrix[0][0]=5;
		matrix[0][1]=6;
		matrix[0][2]=7;
		matrix[0][3]=8;
		matrix[0][4]=9;
		
		matrix[1][0]=11;
		matrix[1][1]=21;
		matrix[1][2]=24;
		matrix[1][3]=25;
		matrix[1][4]=30;
		
		matrix[2][0]=23;
		matrix[2][1]=22;
		matrix[2][2]=27;
		matrix[2][3]=29;
		matrix[2][4]=35;
		
		matrix[3][0]=15;
		matrix[3][1]=54;
		matrix[3][2]=52;
		matrix[3][3]=57;
		matrix[3][4]=59; */
		
		int[][] matrix= {{5,6,7,8,9},{11,21,24,25,30},{23,22,27,29,35},{15,54,52,57,59}};
		
		
		//Primera forma de recorrer un array bidimensional
		
		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				//System.out.println("Valor en la posicion " +i+","+j+" : "+ matrix[i][j]);
				System.out.print(matrix[i][j]+ " ");
			}
		}
		
		//Segunda forma de recorrer un array bidimensional
		
		for(int[] elemento:matrix) {
			System.out.println();
			for(int z:elemento) {
				System.out.print(z +" ");
			}
		}
		
		
		
		
		
	}
	
	

}
