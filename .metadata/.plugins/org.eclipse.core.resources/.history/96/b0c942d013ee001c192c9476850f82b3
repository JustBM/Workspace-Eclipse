package com.string.info;

public class EjStringBuilder {
	public static void main(String[] args) {
	//ejercicio1 - 421
	StringBuilder strb1 =new StringBuilder("Me voy a Barna");
	StringBuilder strb2 =new StringBuilder(", que calor hace");
	
	String str = strb1.toString() + strb2.toString(); //Convertir los StringsBuilder a String
	System.out.println(str);
	
	System.out.println(strb1.append(" a la playa."));
	
	//ejercicio2 
	StringBuilder strb3 = new StringBuilder("El gato trepa por la ventana");
	int ult = strb3.length()-1;
	System.out.println(strb3.deleteCharAt(ult));
	
	//ejercicio3
	for(int i=0;i<=ult+3;i+=3) {
		strb3.insert(i, "b");
	}
	System.out.println(strb3);
	//ejercicio4
	StringBuilder strb4 = new StringBuilder("Ayer cayó un rayo");
	String conv=strb4.toString();
	int pos= 0;
	
	while (pos<=conv.length()) {
		char Caract=conv.charAt(pos);
			if (Caract == ' ') {
				pos++;
				//conv.replace(Caract.toUpperCase(Caract));
				strb4.setCharAt(pos, Caract.toUpperCase(Caract));
			}else {
				pos++;
			}
	}
}