package conectaBD;
import java.sql.*;

import java.sql.DriverManager;

public class Conecta_Ventas {

	public static void main(String[] args) {
		
		try {
			//1.Conexi�n con la base de datos
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
			System.out.println("Esta conectado\n");
			//2. Crear objeto Statement
			Statement miStatement=miConexion.createStatement();
			//3.Instrucci�n de SQL
			ResultSet miResultset= miStatement.executeQuery("SELECT * FROM PRODUCTOS");
			//4.Leer/Recorrer el ResultSet
			while (miResultset.next()) {
				System.out.println(miResultset.getString("C�DIGOART�CULO") + " " + miResultset.getString("NOMBREART�CULO") + " " +
						miResultset.getString("PRECIO"));
						System.out.println(miResultset.getString("SECCI�N") + " " + miResultset.getString("PA�SDEORIGEN") + " " +
						miResultset.getDouble("PRECIO")*1.21);
			}
			
		}
		
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}
		

	}

}
