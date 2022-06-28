package com.ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorBaloncesto")
public class entrenadorBaloncesto implements Entrenador {

	public String getEntrenamiento() {
		return "Lanzar a canasta 30 veces";
	}

	@Override
	public int getExperiencia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}