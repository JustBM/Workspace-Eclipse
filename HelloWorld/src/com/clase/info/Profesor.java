package com.clase.info;
public class Profesor extends Persona {
		//atributos			

		private int numeroDeEdadesEstudiantes;
		private int sumaDeEdadesEstudiantes;
		private float estudiantesEdadMedia;
		
		public Profesor () {
			super(0, 18, 685326487);
			this.numeroDeEdadesEstudiantes=19;
			this.sumaDeEdadesEstudiantes=118;
			this.estudiantesEdadMedia=19;
		}
		public Profesor(int id, int edad, int telefono, int numeroDeEdadesEstudiantes, int sumaDeEdadesEstudiantes, float estudiantesEdadMedia) {
			super (id , edad , telefono);
			this.numeroDeEdadesEstudiantes=numeroDeEdadesEstudiantes;
			this.sumaDeEdadesEstudiantes=sumaDeEdadesEstudiantes;
			this.estudiantesEdadMedia=estudiantesEdadMedia;
		}
			

//metodos
	public void agregarNotaNueva() {}
	public void mostrarInfo() {
		getNumeroDeEdadesEstudiantes();
		getsumaDeEdadesEstudiantes();
		getestudiantesEdadMedia();
	}
	
	public int getNumeroDeEdadesEstudiantes() {
		return numeroDeEdadesEstudiantes;
	}
	
	public int getsumaDeEdadesEstudiantes() {
		return sumaDeEdadesEstudiantes;
	}
	
	public float getestudiantesEdadMedia() {
		return estudiantesEdadMedia;
	}
	
	public void crearEstudiante () {}

	@Override
	public void mostrarID() {
		System.out.println(this.id+"-"+this.sumaDeEdadesEstudiantes);
		
	}
}