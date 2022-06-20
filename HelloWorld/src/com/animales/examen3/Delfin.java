package com.animales.examen3;

public class Delfin extends Animales {

	//Atributos			
	private float velocidad;
	private float profundidad;
	
	//Constructor
		public Delfin () {
			super(true, 4, false);
			this.velocidad=0;
			this.profundidad=-50;
		}
		public Delfin(float velocidad, boolean prfundidad, boolean Respira, float poscionOjos, boolean Dormido) {
			super (Respira , poscionOjos , Dormido);
			this.velocidad=velocidad;
			this.profundidad=profundidad;
		}
		
	//Metodos
	public void sumergirse () {}
	public void saltar () {}

}
