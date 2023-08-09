
public class Uso_arrays_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aleatorio=new int[30];
		
		for(int i=0;i<aleatorio.length;i++) {
			
			aleatorio[i]=(int)(Math.random()*100);
			
		}
		
		for(int elemento:aleatorio) {
			System.out.print(elemento+" ");
		}
		

	}

}
