package server.database.connection.methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	private static Connection connection;

	public static void connectToDataBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
					"KingGiuseppe", "Dravenmeng47");
			setConnection(connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			setConnection(null);
		}
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		DataBaseConnection.connection = connection;
	}

	public static void closeConnection() {
		try {
			DataBaseConnection.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
