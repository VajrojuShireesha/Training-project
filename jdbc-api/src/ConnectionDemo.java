
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.DatabaseMetaData;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/siridb";
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection(url, "root", "Mysqlsiri@22");
			System.out.println("connection successful");
			
			DatabaseMetaData meta = (DatabaseMetaData) conn.getMetaData();
			System.out.println("DB name: " + meta.getDatabaseProductName());
			System.out.println("DB version: " + meta.getDatabaseProductVersion());
			System.out.println("Driver name: " + meta.getDriverName());
			System.out.println("Driver ver: " + meta.getDriverVersion());

		}
		 catch (SQLException e) {
			 System.out.println( "connection failed");
			 e.printStackTrace();
		 }
	}
}

