package com.examen.ja;

import java.util.Scanner;

import com.banco.info.EjercicioExamen1;

public class Examen {

	public static void main(String[] args) {
		// Ejercicio 1:
		System.out.println("Buenos días");
		System.out.println("8x13");
		System.out.println(8*13);
		//Ejercicio 2:
		System.out.println("1 + 2 + 3 =" + (1+2+3));
		//Ejercicio 3:
		int a= 5;
		int b= 24;
		int c= 36;
		System.out.printf("La suma de las tres variables a(%d),b(%d) y c(%d) es:" + (a+b+c),a,b,c).println();
		c= 55;
		System.out.printf("La suma con c=%d es:" + (a+b+c),c).println();
		//Ejercicio 4
			//Definimos angulos= 
		int angulo1=180 ;
		int angulo2=50 ;
		int angulo3=140 ;
		int suma= angulo1 + angulo2 + angulo3;
			//Definimos condicional
		if (suma==180 && angulo1!=0 && angulo2!=0 && angulo3!=0) {
			System.out.println("Los ángulos pueden formar un triángulo ya que la suma de ellos es 180º.");
		} else {
			if(angulo1==0 || angulo2==0 || angulo3==0) {
				System.out.println("Uno o varios de los ángulos es 0, por lo que no puede ser un triángulo.");
			} else {
			System.out.printf("La suma de los ángulos, cuyo valor es %d, no podría formar un triángulo "
					+ "porque esta no es 180º.", suma).println();
			}
		}
		//Ejercicio 5
			//Definimos los 4 números:
		int num1= 80;
		int num2= 4;
		int num3= 5;
		int num4= 95;
			//Definimos el condicional:
		if (num1!=num2 && num1!=num3 && num1!=num4 && num2!=num3 && num2!=num4 && num3!=num4) {
			if(num1>num2 && num1>num3 && num1>num4) {
				System.out.printf("El numero 1, con valor %d, es el mayor de los cuatro números", num1).println();
			} else {
				if(num2>num3 && num2>num4) {
					System.out.printf("El numero 2, con valor %d, es el mayor de los cuatro números", num2).println();
				}else {
					if(num3>num4) {
						System.out.printf("El numero 3, con valor %d, es el mayor de los cuatro números", num3).println();
					}else {
						System.out.printf("El numero 4, con valor %d, es el mayor de los cuatro números", num4).println();
					}
				}
			}
		}else {
			System.out.println("Hay varios números repetidos, por favor, cambia sus valores");
		}
		
		//Ejercicio6
		//SuperClass Animales, Class Colibri, Delfin y Leopardo, Interfaz Seresvivos.
		
		//Ejercicio 7
		System.out.println ("1. Inserción de un gestor\r\n"
				+ "2. Inserción masiva de gestores con datos aleatorios\r\n" 
				+ "3. Obtención de un gestor\r\n"
				+ "4. Obtención de todos los gestores\r\n"
				+ "5. Actualización de un gestor\r\n"
				+ "6. Eliminación de un gestor\r\n"
				+ "7. Salir");
		int x=0;
		while (x!=7) {
			System.out.println("Introduce un numero en pantalla: ");
			Scanner keyboard = new Scanner(System.in);
			x = keyboard.nextInt();
			
			if (x==1) {
				Examen.mensajesGestores();
			} else if (x==2) {
				Examen.mensajesMasiva();
			} else if (x==3) {
				Examen.mensajesObtencion();
			} else if (x==4) {
				Examen.mensajesTodos();
			} else if(x==5) {
				Examen.mensajesActualizacion();
			} else if (x==6){
				Examen.mensajesEliminacion();
			} else if (x>7){
				Examen.mensajesReintenta();
			}
		}
		System.out.println("Has salido del programa");
	}		
	
	int Gestor [];
		public static void mensajesGestores () {
			System.out.println("Insertar un nuevo gestor:");
			Scanner keyboard = new Scanner(System.in);
			int z = keyboard.nextInt();
			int Gestor []= {z};
			
		}
		public static void mensajesMasiva () {
			int y =9;
			System.out.println("Inserta todos los gestores o escribe 0 para salir:");
			while (y!=0) {
				Scanner keyboard = new Scanner(System.in);
				y = keyboard.nextInt();
				int Gestor []= {y};
				
			}
			
		}
		public static void mensajesObtencion () {
			System.out.println("Sobre que gestor quiere tener información?");
			Scanner keyboard = new Scanner(System.in);
			int p = keyboard.nextInt();
			System.out.println(Gestor[p]);
			
		}
		public static void mensajesTodos () {
			System.out.println("Aquí esta la información de todos los gestores:");
			for(int Gestor : Gestor) {
				System.out.println(Gestor);
				}
		}
		public static void mensajesActualizacion () {
			System.out.println("Que gestor quiere actualizar?");
			Scanner keyboard = new Scanner(System.in);
			int p = keyboard.nextInt();
			System.out.println("Inserte sus cambios");
			Scanner keyboard = new Scanner(System.in);
			int cambio = keyboard.nextInt();
			Gestor [p]= cambio;
			
		}
		public static void mensajesEliminacion () {
			System.out.println("Que gestor quiere eliminar?");
			Scanner keyboard = new Scanner(System.in);
			int p = keyboard.nextInt();
			Gestor [p]=null;
		}
		public static void mensajesReintenta () {
			System.out.println("Su consulta no puede ser atendida");
		}
		//keyboard.close();
	}


