package com.string.info;

public class EjerciciosString {

	public static void main(String[] args) {
		//Ejercicio 1
		String texto1= "Ha ver, me fui a mi casa caminando desde abc porque perdi el bus";
		String texto2= "Ha llovido un monton mientras iba en el bus";
		String cadena1= texto1.substring(0,2);
		System.out.println(cadena1);
		String cadena2= texto2.substring(0,2);
		System.out.println(cadena2);
		if (cadena1.equals(cadena2)) {
			System.out.println("Las dos primeras letras son iguales");
		}else {
			System.out.println("No son iguales las primeras letas");
		}
		//Ejercicio 2
		int posfin1=texto1.length()-1;
		int posfin2=texto2.length()-1;
		
		String fCadena1=texto1.substring(posfin1-2,posfin1);
		String fCadena2=texto2.substring(posfin2-2,posfin2);
		
		if (fCadena1.equals(fCadena2) && cadena1.equals(cadena2)) {
			System.out.println("Las dos primeras letras y las dos ultimas son iguales");
		}else {
			System.out.println("No son iguales las primeras y las ultimas letas");
		}
		//Ejercicio 3 
		boolean exist= texto1.contains("abc");
		System.out.println(exist);
		if (exist==true) {
			System.out.println("El String ABC esta en el texto");
			if(texto1.indexOf("abc")==0 || texto1.indexOf("abc")==posfin1-2) {
				System.out.println("Estan al principio o al final");
			} else {
				System.out.println("No estan ni al principio ni al final");
			}
		} else {
			System.out.println("No se encuentra ABC en el texto");
		}

		//Ejercicio 4
		int pos= 5;
		if (texto1.charAt(pos-1) ==texto1.charAt(pos +1) && texto1.charAt(pos) ==texto1.charAt(pos +1) && texto1.charAt(pos-1) ==texto1.charAt(pos)  ) {
			System.out.println("Los caracteres son iguales");
		} else {
			System.out.println("Los caracteres son distintos");
			
		}
		
		//Ejercicio 5
		int posA= texto1.indexOf('a');
		int posA2=texto1.indexOf('a', posA+1);
		System.out.println("La primera A se encuentra en la posici�n:" + posA);
		
		System.out.println("La segunda A se encuentra en la posici�n:" + texto1.indexOf('a',posA+1));
		System.out.println("La tercera A se encuentra en la posici�n:" + texto1.indexOf('a',posA2+1));
		
		//Ejercicio 6
		String palin= "amororoma";
		String palinReverse="";
		
		//Opci�n Crear y comparar
		int indiceRecorre = palin.length()-1;
		char caracter=palin.charAt(indiceRecorre);
		for(int i=indiceRecorre;i>=0;i--) {
			palinReverse=palinReverse.concat(palin.valueOf(caracter));
			indiceRecorre--;
			if(indiceRecorre>=0) {
				caracter=palin.charAt(indiceRecorre);
			}
		}
		if (palin.equals(palinReverse)) {
			System.out.println("Es un palindromo");	
		} else {
			System.out.println("No es un palindromo");
		}
		
		
		//Opci�n recorrer y comparar
		int pos1= 0;
		int pos2= palin.length()-1;
		System.out.println(pos1 + pos2);
		
		while (pos1!=palin.length() && pos2!=0) {
			
			if (palin.charAt(pos1)==palin.charAt(pos2)) {
				
				if(pos1==palin.length()/2) {
					System.out.println("Es palindromo");
					break;	
					
				} else { 
					pos1++;
					pos2--;
				}	
				
			} else {
				System.out.println("No es un palindromo");
				break;
			}
			
		}
		
		
	}
		
}


