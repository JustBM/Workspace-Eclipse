package com.app.f1;
import java.util.*;
public class EjerciciosPg357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int num =0; num<=10; num++) {
			for (int i=0; i<=10;i++) {
				int mult= num*i;
				System.out.printf("%d x %d = %d", num, i, mult).println();
			}
		}
		
		System.out.println("Introduce un numero en pantalla: ");
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		
		if (x%2==0){
			System.out.println("El numero no es primo");
		} else {
			System.out.println("El numero es primo");
		}
		
		while (x!=0) {
			System.out.println(x--);
		}
		keyboard.close();
	}
}

