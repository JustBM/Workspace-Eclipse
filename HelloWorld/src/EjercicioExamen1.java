import java.util.Scanner;

public class EjercicioExamen1 {

	public static void main(String[] args) {
		int j= EjercicioExamen1.suma(4,5);
		int i= EjercicioExamen1.resta(25,75);
		
		System.out.printf("La Suma es %d y la Resta %d", j, i).println();
		
//Ejercicio Proyecto:
		
		System.out.println ("1. Gestores\r\n"
				+ "2. Clientes\r\n" 
				+ "3. Transferencias\r\n"
				+ "4. Mensajes\r\n"
				+ "5. Préstamos\r\n"
				+ "6. Salir");
		int x=0;

		while (x!=6) {
			System.out.println("Introduce un numero en pantalla: ");
			Scanner keyboard = new Scanner(System.in);
			x = keyboard.nextInt();
			
			if (x==1) {
				EjercicioExamen1.mensajesGestores();
			} else if (x==2) {
				EjercicioExamen1.mensajesClientes();
			} else if (x==3) {
				EjercicioExamen1.mensajesTransferencias();
			} else if (x==4) {
				EjercicioExamen1.mensajesMensajes();
			} else if(x==5) {
				EjercicioExamen1.mensajesPrestamos();
			} else if (x>6){
				EjercicioExamen1.mensajesReintenta();
			}
		}
		System.out.println("Has salido del programa");
		
	}		
		public static void mensajesGestores () {
			System.out.println("Gestores");
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

		public static int suma(int x, int y){
			return x+y;
		}	
		public static int resta (int x, int y) {
			return x-y;
		}
}