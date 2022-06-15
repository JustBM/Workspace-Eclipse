package com.vehiculo.info;

public class avion extends vehiculo {

//atributos			
		private boolean trenDeAterrizaje;		

			public avion () {
				super(0.0f, 4, 0);
				this.trenDeAterrizaje=true;
			}
			public avion(float velocidad, int asientos, int orientacionRuedas, boolean trenDeAterrizaje) {
				super (velocidad , asientos , orientacionRuedas);
				this.trenDeAterrizaje=trenDeAterrizaje;
			}
			

//metodos
	public void volar () {}
	public void aterrizar () {}


}