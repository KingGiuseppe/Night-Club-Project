package bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model_for_newuser.NewUser;

public class DataBase {

	public static boolean getLoginVerification(String username, String password) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false", "KingGiuseppe",
				"Dravenmeng47");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select user_name, password from user_account_information where user_name = '" + username + "' and password = '" + password + "'" );
		
		while (resultSet.next()) {
			return true;
		}
		
		connection.close();
		return false;
	}
	
	public static NewUser getAccount(String username, String password) throws SQLException, ClassNotFoundException {

		NewUser account = new NewUser();
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false", "KingGiuseppe",
				"Dravenmeng47");

		Statement statement = connection.createStatement();
		ResultSet resultSet1 = statement
				.executeQuery("select user_name, password, email, account_type, id from user_account_information where user_name = '" + username + "' and password = '" + password + "'" );
		
		while (resultSet1.next()) {
			account.setUsername(resultSet1.getString(1));
			account.setPassword(resultSet1.getString(2));
			account.setEmail(resultSet1.getString(3));
			account.setType(resultSet1.getInt(4));
			account.setId(resultSet1.getInt(5));
		}
		
		ResultSet resultSet2 = statement.executeQuery("select first_name, last_name, gender, zip_code, id from user_information where id = '" + account.getId() + "'");
		
		while (resultSet2.next()) {
			account.setFirstName(resultSet2.getString(1));
			account.setLastName(resultSet2.getString(2));
			account.setGender(resultSet2.getString(3));
			account.setZip(resultSet2.getString(4));
		}
		connection.close();
		return account;
	}
	
	
	
}
