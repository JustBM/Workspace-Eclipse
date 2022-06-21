package com.banco.info;

public class Cliente {
	//atributos			

		private int id;
		private int id_gestor;
		private String usuario;
		private String password;
		private String correo;
		private float saldo;
		
		/*public Cliente () {
			super(0, 18, 685326487);
			this.numeroDeEdadesEstudiantes=19;
			this.sumaDeEdadesEstudiantes=118;
			this.estudiantesEdadMedia=19;
		}*/
		public Cliente(int id, int id_gestor, String usuario, String password, String correo, float saldo) {
			this.id=id;
			this.id_gestor=id_gestor;
			this.usuario=usuario;
			this.password=password;
			this.correo=correo;
			this.saldo=saldo;
		}
			

	//metodos
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public int getIdGestor() {
			return id_gestor;
		}
		public void setIdGestor() {
			this.id_gestor=id_gestor;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario() {
			this.usuario=usuario;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword() {
			this.password=password;
		}
		public float getSaldo() {
			return saldo;
		}
		public void setSaldo() {
			this.saldo=saldo;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo() {
			this.correo=correo;
		}
}
