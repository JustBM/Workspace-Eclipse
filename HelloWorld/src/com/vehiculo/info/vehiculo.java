package com.vehiculo.info;
//Superclase de coche, avion y bicicleta
public class vehiculo {
//atributos se ponen en protected porque private solo podr?a cogerlo la clase vehiculo y no coche, avion ni bici
	protected float velocidad;
	protected int asientos;
	protected int orientacionRuedas;
	
//Constructor:
	public vehiculo(float velocidad, int asientos, int orientacionRuedas) {
	this.velocidad=velocidad;
	this.asientos=asientos;
	this.orientacionRuedas=orientacionRuedas;
	}
	public vehiculo() {
		this.velocidad=0.0f;
		this.asientos=4;
		this.orientacionRuedas=0;
	}
	
//metodos
	public void parar () {}
	public void acelerar() {}
	public void desacelerar () {}
	public void girarIzquierda() {}
	public void girarDerecha() {}
	
}
