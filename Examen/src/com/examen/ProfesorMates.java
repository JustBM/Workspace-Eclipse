package com.examen;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

	@Entity
	@Table(name="profesormates")
	public class ProfesorMates {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		@Column(name="nombre")
		private String nombre;
		@Column(name="apellidos")
		private String apellidos;
		@Column(name="edad")
		private int edad ;
		
		//Contructor
		public ProfesorMates() {}
		
		//Contructor campos
		public ProfesorMates(String nombre, String apellidos, int edad) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
		}

		@Override
		public String toString() {
			return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getId() {
			return id;
		}
	}