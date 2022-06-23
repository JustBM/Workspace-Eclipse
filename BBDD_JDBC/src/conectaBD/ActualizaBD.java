package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ActualizaBD {

	public static void main(String[] args) {
		try {
			//1.Conexión con la base de datos
			Connection ConexionM = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
			System.out.println("Esta conectado\n");
			//2. Crear objeto Statement
			Statement StatementM=ConexionM.createStatement();
			System.out.println("Creado Statement");
			//3.Generamos en un String la consulta SQL
			String actualizarPrecio="UPDATE productos SET PRECIO = PRECIO*2 WHERE CÓDIGOARTÍCULO = \"AR77\"";
			String actualizarSeccion="UPDATE productos SET SECCIÓN = `DEPORTES` CÓDIGOARTÍCULO = \"AR77\"";
			System.out.println("actualizarSeccion");
			//4.Con executeUpdate("") introducimos la instrucción SQL del String anterior
			StatementM.executeUpdate(actualizarPrecio);
			StatementM.executeUpdate(actualizarSeccion);
			System.out.println("Datos insertados correctamente");
			}
		
		
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}

}
