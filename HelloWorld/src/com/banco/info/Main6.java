package com.banco.info;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		System.out.println ("1. Gestores\r\n"
				+ "2. Clientes\r\n" 
				+ "3. Transferencias\r\n"
				+ "4. Mensajes\r\n"
				+ "5. Pr?stamos\r\n"
				+ "6. Salir");
		int x=0;

		while (x!=6) {
			System.out.println("Introduce un numero en pantalla: ");
			Scanner keyboard = new Scanner(System.in);
			x = keyboard.nextInt();
			
			if (x==1) {
				Main6.mensajesGestores();
			} else if (x==2) {
				Main6.mensajesClientes();
			} else if (x==3) {
				Main6.mensajesTransferencias();
			} else if (x==4) {
				Main6.mensajesMensajes();
			} else if(x==5) {
				Main6.mensajesPrestamos();
			} else if (x>6){
				Main6.mensajesReintenta();
			}
		}
		System.out.println("Has salido del programa");
		
	}		
		public static void mensajesGestores () {
			System.out.println("Gestores/r/n"
					+ "---/n"
					+ "1. A?adir gestor/r/n" 
					+ "2. Modificar gestor/r/n"
					+ "3. Eliminar gestor/r/n"
					+ "4. Ver gestor/r/n"
					+ "5. Ver gestores/r/n");
		}
		public static void mensajesClientes () {
			System.out.println("Clientes");
		}
		public static void mensajesTransferencias () {
			System.out.println("Transferencias");
		}
		public static void mensajesMensajes () {
			System.out.println("Mensajes");
		}
		public static void mensajesPrestamos () {
			System.out.println("Prestamos");
		}
		public static void mensajesReintenta () {
			System.out.println("Su consulta no puede ser atendida");
		}

	}
