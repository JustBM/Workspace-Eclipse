package com.animales.examen3;

public class Leopardo extends Animales {
	
	//Atributos			
	private float velocidad;
	private int numeroDePelos;
	
	//Constructor
	public Leopardo () {
		super(true, 5, false);
		this.velocidad=0;
		this.numeroDePelos=4;
	}
	public Leopardo(float velocidad, int numeroDePelos, boolean Respira, float poscionOjos, boolean Dormido) {
		super (Respira , poscionOjos , Dormido);
		this.velocidad=velocidad;
		this.numeroDePelos=numeroDePelos;
	}

	//Metodos
	public void acelerar () {}
	public void morder () {}

}
