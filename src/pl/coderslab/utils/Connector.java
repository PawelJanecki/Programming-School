package pl.coderslab.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	private static Connection conn;
	
	public static Connection getConnection() throws SQLException {
		if (conn == null) {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warsztat2?useSSL=false", "root",
				"coderslab");
		}
		return conn;
	}
}
