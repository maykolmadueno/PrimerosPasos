package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	public String dime_datos_generales() { //getter
		
		return "La plataforma del vehículo tiene " +ruedas+ " ruedas"+
		" Mide "+ largo/1000+" metros con un ancho de "+ancho+" cm y un peso de plataforma "
		+ peso_plataforma+ " kg";
	}
	
	public void establece_color(String color) {
		this.color=color;
	}
	
	public String dime_color() {
		return "El color del coche es: "+color;
	}
	
	public void configura_asientos_cuero(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("SI")){
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos_cuero() {
		if(this.asientos_cuero==true) {
			return "El coche si cuenta con asientos de cuero";
		}else{
		
			return "El coche no cuenta con asientos de cuero";
		}
			
	}
	
	public void configura_climatizador(String climatizador) {  //Setter
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
	}
	
	public String dime_climatizador() {	//Getter::
		if (this.climatizador==true) {
			return "El coche si cuenta con climatizador.";
		}else {
			return "El coche no cuenta con climatizador";
		}
	}
	
	public String peso_coche() {  // getter and setter a la vez
		int peso_carroceria=500;
		peso_total = peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		
		return "El peso total del coche es "+peso_total;
		
	}
	
	public int precio_coche() { //getter
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			precio_final+=1500;
		}
		
		return precio_final;		
		
	}
	
	

}
