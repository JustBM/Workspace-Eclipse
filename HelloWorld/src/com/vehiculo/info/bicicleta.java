package com.vehiculo.info;

public class bicicleta extends vehiculo {
//atributos			

		private boolean cambios;
		
		public bicicleta () {
			super(0.0f, 4, 0);
			this.cambios=true;
		}
		public bicicleta(float velocidad, boolean cambios, int asientos, int orientacionRuedas) {
			super (velocidad , asientos , orientacionRuedas);
			this.cambios=cambios;
		}
			

//metodos
	//no tiene


}