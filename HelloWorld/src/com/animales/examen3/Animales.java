package com.animales.examen3;

public class Animales implements SeresVivos{
	//Superclase Colibri, Delfin y Leopardo

	//Atributos 
		protected boolean Respira;
		protected float posicionOjos;
		protected boolean Dormido;
		
	//Constructor:
		public Animales(boolean Respira, float posicionOjos, boolean Dormido) {
		this.Respira=Respira;
		this.posicionOjos=posicionOjos;
		this.Dormido=Dormido;
		}
		public Animales() {
			this.Respira=true;
			this.posicionOjos=0;
			this.Dormido=false;
		}
		
	//metodos
		public void Nacer () {
			getrespira();
			getdormido();
		}
		public boolean getrespira () {
			return Respira;
		}
		public boolean getdormido() {
			return Dormido;
		}
		
		@Override
		public void Latidos() {
			System.out.println("Has generado latidos en este animal, ahora empieza su vida");
			
		}
		
}
