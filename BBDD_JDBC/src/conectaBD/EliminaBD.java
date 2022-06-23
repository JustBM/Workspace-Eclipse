package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EliminaBD {

	public static void main(String[] args) {
			try {
				//1.Conexi�n con la base de datos
				Connection ConexionM = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
				System.out.println("Esta conectado\n");
				//2. Crear objeto Statement
				Statement StatementM=ConexionM.createStatement();
				System.out.println("Creado Statement");
				//3.Generamos en un String la consulta SQL
				String eliminaSQL="DELETE FROM productos WHERE C�DIGOART�CULO=\"AR77\"";
				System.out.println("Insertada la instrucci�n");
				//4.Con executeUpdate("") introducimos la instrucci�n SQL del String anterior
				StatementM.executeUpdate(eliminaSQL);
				System.out.println("Datos eliminados correctamente");
				}
			
			
			catch(Exception e) {
				System.out.println("No esta conectado");
				e.getStackTrace();
			}


	}

}
