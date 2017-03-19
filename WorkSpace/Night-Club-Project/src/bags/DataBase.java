package bags;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model_for_event_creation.CreateEventObject;
import model_for_event_creation.CreateEventPaneObject;
import model_for_login.ForgotPassObject;
import model_for_login.ForgotPassObject2;
import model_for_newuser.NewUser;
import model_for_newuser.NewUserObject;
import model_for_removeEv.RemoveEventObj;

public class DataBase {
	
	public static boolean getUserAcc(Object object) throws SQLException, ClassNotFoundException {
		ForgotPassObject acc = (ForgotPassObject) object;
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
				"KingGiuseppe", "Dravenmeng47");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select user_name, email from user_account_information where user_name = '" + acc.getUsername()
						+ "' and email = '" + acc.getEmail() + "'");

		while (resultSet.next()) {
			return true;
		}

		connection.close();
		return false;
	}
	
	public static boolean addNewUser(Object object) {
		NewUserObject user = (NewUserObject) object;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
					"KingGiuseppe", "Dravenmeng47");
			
			PreparedStatement prepStatement3 = connection.prepareStatement("select * from user_account_information");
			ResultSet resultSet = prepStatement3.executeQuery();
			int key = 0;

			while (resultSet.next()) {
				key = resultSet.getInt(5);
			}
			key++;
			
		
			PreparedStatement prepState2 = connection.prepareStatement("insert into user_account_information (user_name, password, email, account_type, id)" + 
					" values (?, ?, ?, ?, ?)");
			prepState2.setString(1, user.getUsername());
			prepState2.setString(2, user.getPassword());
			prepState2.setString(3, user.getEmail());
			prepState2.setInt(4, user.getType());
			prepState2.setInt(5, key);
			
			prepState2.execute();
			
			PreparedStatement prepState = connection.prepareStatement("insert into user_information (first_name, last_name, gender, zip_code, id)" + 
			" values (?, ?, ?, ?, ?)");
			
			prepState.setString(1, user.getFirstName());
			prepState.setString(2, user.getLastName());
			prepState.setString(3, user.getGender());
			prepState.setInt(4, Integer.parseInt(user.getZip()));
			prepState.setInt(5, key);
			prepState.execute();
			
			connection.close();
			return true;
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean removeEvent(Object object) {
		RemoveEventObj event = new RemoveEventObj();
		event = (RemoveEventObj) object;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
					"KingGiuseppe", "Dravenmeng47");
			
			PreparedStatement prepState = connection.prepareStatement("delete from event_table where event_name = '" + event.getEventName() + "'");
			
			prepState.execute();
			connection.close();
			return true;
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
		
	}
	public static boolean addEvent(CreateEventObject object) {
		CreateEventPaneObject event = new CreateEventPaneObject();
		System.out.println((object).getArtist());
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
					"KingGiuseppe", "Dravenmeng47");
			
			PreparedStatement prepState = connection.prepareStatement("insert into event_table (event_name, artist, music_type, date, picture_link)" + 
			" values (?, ?, ?, ?, ?)");
			
			System.out.println(object.getArtist());
			
			prepState.setString(1, object.getEventName());
			prepState.setString(2, object.getArtist());
			prepState.setString(3, object.getGenre());
			prepState.setString(4, object.getDate());
			prepState.setString(5, object.getPictureLink());
			prepState.execute();
			connection.close();
			
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	//prepared statement example
	public static ArrayList<CreateEventPaneObject> getEvents() throws SQLException, ClassNotFoundException {
		CreateEventPaneObject event = new CreateEventPaneObject();
		ArrayList<CreateEventPaneObject> list = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
				"KingGiuseppe", "Dravenmeng47");

		PreparedStatement prepStatement = connection.prepareStatement("select * from event_table");
		ResultSet resultSet = prepStatement.executeQuery();

		while (resultSet.next()) {
			list.add(new CreateEventPaneObject(resultSet.getString(1), resultSet.getString(4), resultSet.getString(3),
					resultSet.getString(2), resultSet.getString(5)));
		}
		connection.close();
		return list;
	}
	//regular statement example
	public static boolean getLoginVerification(String username, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
				"KingGiuseppe", "Dravenmeng47");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select user_name, password from user_account_information where user_name = '" + username
						+ "' and password = '" + password + "'");

		while (resultSet.next()) {
			return true;
		}

		connection.close();
		return false;
	}

	public static NewUser getAccount(String username, String password) throws SQLException, ClassNotFoundException {

		NewUser account = new NewUser();
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
				"KingGiuseppe", "Dravenmeng47");

		Statement statement = connection.createStatement();
		ResultSet resultSet1 = statement.executeQuery(
				"select user_name, password, email, account_type, id from user_account_information where user_name = '"
						+ username + "' and password = '" + password + "'");

		while (resultSet1.next()) {
			account.setUsername(resultSet1.getString(1));
			account.setPassword(resultSet1.getString(2));
			account.setEmail(resultSet1.getString(3));
			account.setType(resultSet1.getInt(4));
			account.setId(resultSet1.getInt(5));
		}

		ResultSet resultSet2 = statement
				.executeQuery("select first_name, last_name, gender, zip_code, id from user_information where id = '"
						+ account.getId() + "'");

		while (resultSet2.next()) {
			account.setFirstName(resultSet2.getString(1));
			account.setLastName(resultSet2.getString(2));
			account.setGender(resultSet2.getString(3));
			account.setZip(resultSet2.getString(4));
		}
		connection.close();
		return account;
	}

	public boolean changePassword(Object object) {
		ForgotPassObject2 acc = (ForgotPassObject2) object;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/nightclub_database?useSSL=false",
					"KingGiuseppe", "Dravenmeng47");
			
			PreparedStatement prepState = connection.prepareStatement("update user_account_information set password = '" + acc.getPass() +"' where user_name = '" + acc.getUsername() + "'");
					
			prepState.executeUpdate();
			
			connection.close();
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
