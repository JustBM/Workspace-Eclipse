package BancoExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conectaBanco {

	public static void main(String[] args) {
		try {
			//1.Conexión con la base de datos
			Connection ConexionExam = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenbanco", "examen1", "examen1");
			System.out.println("Conexión establecida!\n");
			//2. Crear objeto Statement
			Statement StatementExam=ConexionExam.createStatement();
			System.out.println("Statement establecido!");
			//3.Instrucción de SQL
			ResultSet ResultsetExam= StatementExam.executeQuery("SELECT * FROM cliente");
			System.out.println("Resultset funcionando!");
			//4.Leer/Recorrer el ResultSet
			while (ResultsetExam.next()) {
				System.out.println(ResultsetExam.getString(1) + " " + ResultsetExam.getString(2) + " " 
			+ ResultsetExam.getString(3) + " " + ResultsetExam.getString(4) + " " + ResultsetExam.getString(5) 
			+ " " + ResultsetExam.getString(6));
			}
		}
		
		catch (Exception e) {
			System.out.println("Error: Se ha detenido el proceso. ");
			e.getStackTrace();
		}

	}

}
