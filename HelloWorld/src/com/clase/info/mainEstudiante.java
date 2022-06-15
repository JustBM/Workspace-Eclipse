package com.clase.info;

public class mainEstudiante {

	public static void main(String[] args) {
		estudiante isaac = new estudiante();
		estudiante adrian = new estudiante(3);
		estudiante laura = new estudiante(5,19);
		estudiante alison = new estudiante(5 , 25 , 696999999, 8 , 8 , 8.0);
		//Mostrar la id del estudiante albert solo si es visible, es decir, "public"
		//System.out.println(albert.id);
		System.out.println(isaac.getid());
		isaac.Setid(3);
		System.out.println(isaac.getid());
		//Mostrar la id del estudiante albert solo si es visible, es decir, "public"
				//System.out.println(albert.id);
				System.out.println(isaac.getid()); //Muestra valor actual = 1
				isaac.setid(3);//Modificamos valor actual, asignando por argumento un 3
				System.out.println(isaac.getid());//Muestra valor actual = 3
				System.out.println(albert.gettelefono()); //Muestra valor 699999996
				albert.settelefono(654321789);//Modificamos valor actual
				System.out.println(albert.gettelefono()); //Muestra valor 654321789
				System.out.println(isaac.gettelefono()); //Muestra valor 699999999
				System.out.println(laura.getid()); //Muestra valor actual
				laura.setId(5);//Modificamos valor actual, asignando por argumento
				System.out.println(alison.getid()); //Muestra valor actual
				alison.setid(2);//Modificamos valor actual, asignando por argumento
				System.out.println(adrian.getid()); //Muestra valor actual
				adrian.setid(18);//Modificamos valor actual, asignando por argumento
				}
	}
}