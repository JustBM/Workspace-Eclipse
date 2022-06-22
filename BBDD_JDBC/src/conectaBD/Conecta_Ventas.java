package conectaBD;
import java.sql.*;

import java.sql.DriverManager;

public class Conecta_Ventas {

	public static void main(String[] args) {
		
		try {
			//1.Conexión con la base de datos
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
			System.out.println("Esta conectado\n");
			//2. Crear objeto Statement
			Statement miStatement=miConexion.createStatement();
			//3.Instrucción de SQL
			ResultSet miResultset= miStatement.executeQuery("SELECT * FROM PRODUCTOS");
			//4.Leer/Recorrer el ResultSet
			while (miResultset.next()) {
				System.out.println(miResultset.getString("CÓDIGOARTÍCULO") + " " + miResultset.getString("NOMBREARTÍCULO") + " " +
						miResultset.getString("PRECIO"));
						System.out.println(miResultset.getString("SECCIÓN") + " " + miResultset.getString("PAÍSDEORIGEN") + " " +
						miResultset.getDouble("PRECIO")*1.21);
			}
			
		}
		
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}
		

	}

}
