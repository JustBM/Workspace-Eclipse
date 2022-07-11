package com.examen;

public interface Profesor {
	public abstract String getAprendizaje();
	public abstract int getExperiencia();
	
	public String getId();
	public void setId(String id);
	public String getEquipo();
	public void setClase(String clase);
	
	public void init();
	public void destroy();
}
