package com.animales.examen3;

public class Colibri extends Animales {

	//Atributos			
			private float velocidad;
			private boolean plumas;
	//Constructor
			public Colibri () {
				super(true, 5, false);
				this.velocidad=0;
				this.plumas=true;
			}
			public Colibri(float velocidad, boolean plumas, boolean Respira, float poscionOjos, boolean Dormido) {
				super (Respira , poscionOjos , Dormido);
				this.velocidad=velocidad;
				this.plumas=plumas;
			}
				
	//Metodos
		public void volar () {}
		public void posarse () {}

}
