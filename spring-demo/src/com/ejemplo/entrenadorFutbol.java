package com.ejemplo;

import org.springframework.stereotype.Component;


@Component ("mientrenadorFutbol")
public class entrenadorFutbol implements Entrenador {

		private ExperienciaServicio experienciaServicio;
		public entrenadorFutbol(ExperienciaServicio experienciaServicio) {
			System.out.println("Inyección en el constructor");
			this.experienciaServicio = experienciaServicio;
			}
		@Override
		public String getEntrenamiento() {
			return "Correr durante 30 minutos";
		}

		@Override
		public int getExperiencia() {
			return experienciaServicio.getExperiencia();
			}
}
		
