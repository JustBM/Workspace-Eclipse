package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		/*Entrenador entrenadorFutbol = new entrenadorFutbol();
		Entrenador entrenadorBaloncesto = new entrenadorBaloncesto();
		System.out.println(entrenadorFutbol.getEntrenamiento());
		System.out.println(entrenadorBaloncesto.getEntrenamiento());*/
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Entrenador entrenador = context.getBean("mientrenador", Entrenador.class);
		//System.out.println(entrenador.getEntrenamiento());
		Entrenador entrenador = context.getBean("mientrenadorFutbol", Entrenador.class);
		System.out.println(entrenador.getExperiencia());
		//Entrenador entrenadorB = context.getBean("mientrenadorBaloncesto", Entrenador.class);
		//System.out.println(entrenadorB.getEntrenamiento());
		context.close();
	}

}
