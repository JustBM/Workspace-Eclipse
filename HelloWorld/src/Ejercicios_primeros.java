import java.util.*;

public class Ejercicios_primeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				System.out.println("Gestores");
			} else if (x==2) {
				System.out.println("Clientes");
			} else if (x==3) {
				System.out.println("Transferencias");
			} else if (x==4) {
				System.out.println("Mensajes");
			} else if(x==5) {
				System.out.println("Prestamos");
			} else if (x>6){
				System.out.println("Su consulta no puede ser atendida");
			}
		}
		System.out.println("Has salido del programa");
		keyboard.close();
	}
	}