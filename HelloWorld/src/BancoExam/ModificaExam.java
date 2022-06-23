package BancoExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaExam {

	public static void main(String[] args) {
			try {
			//1.Conexión con la base de datos
			Connection ConexionMExam = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenbanco", "examen1", "examen1");
			System.out.println("Conexión establecida!\n");
			//2. Crear objeto Statement
			Statement StatementMExam=ConexionMExam.createStatement();
			System.out.println("Statement en marcha!");
			//3.Generamos en un String la consulta SQL
			String actualizarIVA="UPDATE cliente SET Movimientos = Movimientos*1.21";
			System.out.println("Insertada la instrucción!");
			//4.Con executeUpdate("") introducimos la instrucción SQL del String anterior
			StatementMExam.executeUpdate(actualizarIVA);
			System.out.println("Datos insertados correctamente!");
			}
		
		
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}

}
