package com.string.info;

public class String2 {

	public static void main(String[] args) {
		String texto="Esto es un texto";
		//Tama?o del string:
		System.out.println(texto.length());
		//Letra en la posici?n indicada:
		System.out.println(texto.charAt(0));
		System.out.println(texto.charAt(6));
		System.out.println(texto.charAt(texto.length()-1));
		//para conseguir la ?ltima posici?n del String:
		int longitud=texto.length();
		int ultimaposicion=longitud-1;
		System.out.println(texto.charAt(ultimaposicion)); //Ser?a igual que la l?nea 12
		//Nos devuelve en que posici?n se encuentra la letra o string que deseamos:
		System.out.println(texto.indexOf('o'));
		System.out.println(texto.indexOf('t'));
		System.out.println(texto.indexOf('E'));
		System.out.println(texto.indexOf("es"));
		//Empieza a contar a partir del numero que se le asigna, por ende la "o" estar? en la posici?n 15 que se la final
		System.out.println(texto.indexOf('o',6));
		//Al no encontrar la cadena de caracteres a partir de esta posici?n devuelve: -1:
		System.out.println(texto.indexOf("es", 7));
		//Para hacer la busqueda desde el final:
		System.out.println(texto.lastIndexOf('o'));
		System.out.println(texto.lastIndexOf("es"));
		System.out.println(texto.indexOf('t'));
		//Empieza la cadena de Sting con lo asignado (true/false):
		System.out.println(texto.startsWith("Esto"));
		//Termina la cadena de String con lo asingado (true/false):
		System.out.println(texto.endsWith("to"));
		System.out.println(texto.endsWith("te"));
		//Esta el string vacio o no:
		System.out.println(texto.isEmpty());
		//En el string esta la busqueda o no?:
		String texto1 = "hola";
		System.out.println(texto1.equals("hola"));
		System.out.println(texto1.equals("Hola"));
		System.out.println(texto1.equals("Adios"));
		//Para ignorar mayusculas y minusculas
		System.out.println(texto1.equalsIgnoreCase("hOlA"));
		//Para comprobar si existe o no X texto en el String:
		System.out.println(texto.contains("ol"));
		System.out.println(texto.contains("texto"));
		/*Para que nos devuelva lo que hay en esas posiciones en intervalo, no inclye 
		la ultima posici?n si tuviese valor como en el segundo caso [6,10):*/
		System.out.println(texto.substring(6));
		System.out.println(texto.substring(6,10));
		//Devuelve el string en mayusculas/minusculas:
		System.out.println(texto.toUpperCase());
		System.out.println(texto.toLowerCase());
		//Esto concadena al valor del string:
		System.out.println(texto.concat(" m?s grande"));
		//Remplaza caracteres por otros
		String texto2 = "  En un lugar de la Mancha  ";
		System.out.println(texto2);
		System.out.println(texto2.replace("a", "u"));
		System.out.println(texto2.replace("la", "tu"));
		//Para remplazar solo la primera letra que encuentra:
		System.out.println(texto2.replaceFirst("a", "u"));
		//Quitar espacios por delante y por detr?s:
		System.out.println(texto2.trim());
		//Convierte cosas a String:
		String str1 = String.valueOf(true);
		String str2 = String.valueOf(1);
		//Concatenacion, la + con strings los concatena, no los suma
		System.out.println("1" + "1"); //11
		int i = 20;
		System.out.println("El valor es " + i + 20); //2020
		System.out.println("El valor es " + (i + 20)); //40
	}

}
