package com.clase.info;
	public class estudiante extends Persona{
		//Constructores 
			//Por defecto
		public estudiante () {
			//this.id=1;
			//this.edad=18;
			//this.telefono=699999999;
			this.numeroDeNotas=1;
			this.sumaDeNotas=10;
			this.notaMedia=5;
		}
			//Parametrizado con 1 parametro
		public estudiante (int id) {
			//this.id=id;
			//this.edad=23;
			//this.telefono=695695695;
			this.numeroDeNotas=3;
			this.sumaDeNotas=12;
			this.notaMedia=6;
		}
			//Parametrizado con 2 parametros
		public estudiante (int id, int edad) {
			//this.id=id;
			//this.edad=edad;
			//this.telefono=685685685;
			this.numeroDeNotas=4;
			this.sumaDeNotas=30;
			this.notaMedia=4;
		}
			//Sin parametrizar, todos las variables se har?n a partir de los datos introducidos
		public estudiante (int id, int edad, int telefono, int numeroDeNotas, int sumaDeNotas, double notaMedia) {
			//this.id=id;
			//this.edad=edad;
			//this.telefono=telefono;
			this.numeroDeNotas=numeroDeNotas;
			this.sumaDeNotas=sumaDeNotas;
			this.notaMedia= notaMedia;
		}
		//Atributos
			//private int id;
			//private int edad;
			//private int telefono;
			private int numeroDeNotas;
			private int sumaDeNotas;
			private double notaMedia;

				
		//Metodos p?blicos
	
		public void mostrarInfo() {};
		public void agregarNuevaNota() {};
		public int getid() {
			return id;
		};
		public void Setid(int id) {
		};
		public int getedad() {
			return edad;
		};
		public void Setedad(int edad) {
		};
		public int gettelefono() {
			return telefono;
		};
		public void Settelefono(int telefono) {
		};
		public int getnumeroDeNotas() {
			return numeroDeNotas;
		};
		public void SetnumeroDeNotas(int numeroDeNotas) {
		};
		public int getsumaDeNotas() {
			return sumaDeNotas;
		};
		public void SetsumaDeNotas(int sumaDeNotas) {
		};
		public double getnotaMedia() {
			return notaMedia;
		};
		public void SetnotaMedia(double notaMedia) {
		}
		@Override
		public void mostrarID() {
			System.out.println(this.id+"-"+this.notaMedia);
			
		}
	}
	
	
