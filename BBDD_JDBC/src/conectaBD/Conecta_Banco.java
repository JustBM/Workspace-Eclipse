package conectaBD;
import java.sql.*;

public class Conecta_Banco {

	public static void main(String[] args) {
		try {
			//1.Conexión con la base de datos
			Connection miConexionBanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("Esta conectado\n");
			//2. Crear objeto Statement
			Statement miStatementBanco=miConexionBanco.createStatement();
			//3.Instrucción de SQL
			ResultSet miResultsetBanco= miStatementBanco.executeQuery("SELECT * FROM gestor");
			//4.Leer/Recorrer el ResultSet
			while (miResultsetBanco.next()) {
				System.out.println(miResultsetBanco.getString(1) + " " + miResultsetBanco.getString(2) + " " +
						miResultsetBanco.getString(3));
					
			}
		}
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}
	}

}
