package com.clase.info;

//Superclase de estudiante y profesor
public abstract class Persona implements PersonaInterfaz {
//atributos se ponen en protected porque private solo podr�a cogerlo la clase vehiculo y no coche, avion ni bici
	protected int id;
	protected int edad;
	protected int telefono;
	
//Constructor:
	public Persona(int id, int edad, int telefono) {
	this.id=id;
	this.edad=edad;
	this.telefono=telefono;
	}
	public Persona() {
		this.id=0;
		this.edad=18;
		this.telefono=000000000;
	}
	
//metodos
	
	public void mostrarInfo () {
	getid();
	getedad();
	gettelefono();
	}
	public int getid () {
		return id;
	}
	public int getedad() {
		return edad;
	}
	public int gettelefono() {
		return telefono;
	}
}