import java.util.Scanner;

public class Uso_Tallas {
	
	enum Talla{
		MINI("Mi"), MEDIANO("Me"),GRANDE("G"), MUY_GRANDE("Mg");
		
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura() {
			return abreviatura;
		}
		
		
		private String abreviatura;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese la talla:MINI,MEDIANO,GRANDE,MUY_GRANDE");
		String ingreso=entrada.next().toUpperCase();
		// primera forma
		System.out.println("La talla es:"+Talla.valueOf(Talla.class, ingreso));
		System.out.println("La abreviatura es: "+Talla.valueOf(ingreso).dameAbreviatura());
		
		// segunda forma
		
		//Talla la_talla=Enum.valueOf(Talla.class, ingreso);
		
		//System.out.println("La talla es:"+la_talla.valueOf(Talla.class, ingreso));
		//System.out.println("La abreviatura es: "+la_talla.dameAbreviatura());
		
		

	}

}
