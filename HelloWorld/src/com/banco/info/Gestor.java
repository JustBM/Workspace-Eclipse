package com.banco.info;

public class Gestor {

	//atributos			

	private int id;
	private String usuario;
	private String password;
	private String correo;
	
	//Constructor
	
	/*public Gestor () {
		super(0, 18, 685326487);
		this.numeroDeEdadesEstudiantes=19;
		this.sumaDeEdadesEstudiantes=118;
		this.estudiantesEdadMedia=19;
	}*/
	
	public Gestor(int id, String usuario, String password, String correo) {
		this.id=id;
		this.usuario=usuario;
		this.password=password;
		this.correo=correo;
	}
		

//metodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo() {
		this.correo=correo;
	}
	
}
	
	
	/*String anGes="A?adir Gestor";
	String moGes="Modificar Gestor";
	String elGes="Eliminar Gestor";
	String veGes="Ver Gestor";
	String veGts="Ver Gestores";
	String atr="Volver Atr?s";
	 */

