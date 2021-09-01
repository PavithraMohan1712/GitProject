package MyGradle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getDBConnection() throws SQLException{
		Connection connection = null;
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return connection;
	}

}
