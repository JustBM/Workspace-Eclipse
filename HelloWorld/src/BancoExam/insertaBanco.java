package BancoExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class insertaBanco {

	public static void main(String[] args) {
		try {
			//1.Conexión con la base de datos
			Connection ConexionIExam = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenbanco", "examen1", "examen1");
			System.out.println("Conexión establecida!\n");
			//2. Crear objeto Statement
			Statement StatementIExam=ConexionIExam.createStatement();
			System.out.println("Statement en marcha!");
			//3.Generamos en un String la consulta SQL
			String instruccion1="INSERT INTO cliente (IdGestor,Nombre,Teléfono,Movimientos,Mensajes) VALUES ('1', 'Eliminación', '000000000', '666', 'Para el hoyo');";
			System.out.println("Insertada la instrucción!");
			//4.Con executeUpdate("") introducimos la instrucción SQL del String anterior
			StatementIExam.executeUpdate(instruccion1);
			System.out.println("Datos insertados correctamente!");
			}
		
		
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}


	}

}
