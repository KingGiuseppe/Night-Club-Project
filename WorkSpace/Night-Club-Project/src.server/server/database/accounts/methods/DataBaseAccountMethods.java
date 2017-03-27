package server.database.accounts.methods;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model_for_login.ForgotPassObject;
import model_for_login.ForgotPassObject2;
import model_for_login.LoginObject;
import model_for_newuser.NewUser;
import model_for_newuser.NewUserObject;
import server.database.connection.methods.DataBaseConnection;

public class DataBaseAccountMethods {

	/** Return manager accounts in ArrayList. First it find the account information then gets the account user information. */
	public static ArrayList<NewUser> getManagerAccounts() {
		ArrayList<NewUser> list = new ArrayList<>();
		ArrayList<Integer> idList = new ArrayList<>();

		DataBaseConnection.connectToDataBase();

		PreparedStatement prepStatement;
		try {
			prepStatement = DataBaseConnection.getConnection().prepareStatement(
					"select user_name, password, email, account_type, id from user_account_information where account_type = 1");

			ResultSet resultSet = prepStatement.executeQuery();

			while (resultSet.next()) {
				idList.add(resultSet.getInt(5));
				list.add(new NewUser(null, null, null, null, resultSet.getString(3), resultSet.getString(1),
						resultSet.getString(2), resultSet.getInt(4)));
			}

			PreparedStatement prepStatement2 = DataBaseConnection.getConnection()
					.prepareStatement("select * from user_account_information");

			ResultSet resultSet2 = prepStatement2.executeQuery();

			int i = 0;
			while (resultSet2.next()) {
				if (idList.get(i) == resultSet2.getInt(5)) {
					list.get(i).setFirstName(resultSet2.getString(1));
					list.get(i).setLastName(resultSet2.getString(2));
					list.get(i).setGender(resultSet2.getString(3));
					list.get(i).setZip(resultSet2.getString(4));
					if (i < idList.size() - 1) {
						i++;
					}
				}

			}
			DataBaseConnection.closeConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
	/** Adds new account to database. */
	public static boolean addAccount(Object object) {
		NewUserObject user = (NewUserObject) object;
		try {
			DataBaseConnection.connectToDataBase();
			PreparedStatement prepStatement3 = DataBaseConnection.getConnection()
					.prepareStatement("select * from user_account_information");
			ResultSet resultSet = prepStatement3.executeQuery();

			int key = 0;
			while (resultSet.next()) {
				key = resultSet.getInt(5);
			}
			key++;

			PreparedStatement prepState2 = DataBaseConnection.getConnection().prepareStatement(
					"insert into user_account_information (user_name, password, email, account_type, id)"
							+ " values (?, ?, ?, ?, ?)");
			prepState2.setString(1, user.getUsername());
			prepState2.setString(2, user.getPassword());
			prepState2.setString(3, user.getEmail());
			prepState2.setInt(4, user.getType());
			prepState2.setInt(5, key);

			prepState2.execute();

			PreparedStatement prepState = DataBaseConnection.getConnection()
					.prepareStatement("insert into user_information (first_name, last_name, gender, zip_code, id)"
							+ " values (?, ?, ?, ?, ?)");

			prepState.setString(1, user.getFirstName());
			prepState.setString(2, user.getLastName());
			prepState.setString(3, user.getGender());
			prepState.setInt(4, Integer.parseInt(user.getZip()));
			prepState.setInt(5, key);
			prepState.execute();

			DataBaseConnection.closeConnection();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/** Checks to see if the login information is valid and returns true or false if found/not found respectively. */
	public static boolean getLoginVerification(Object object) throws SQLException, ClassNotFoundException {
		LoginObject loginInfo = (LoginObject) object;
		DataBaseConnection.connectToDataBase();
		Statement statement = DataBaseConnection.getConnection().createStatement();
		ResultSet resultSet = statement
				.executeQuery("select user_name, password from user_account_information where user_name = '"
						+ loginInfo.getUsername() + "' and password = '" + loginInfo.getPassword() + "'");

		while (resultSet.next()) {
			if (resultSet.getString(2).equals(loginInfo.getPassword())) {
				return true;
			} else {
				return false;
			}
		}

		DataBaseConnection.closeConnection();
		return false;
	}
	/** Gets account from database. */
	public static NewUser getAccount(Object object) throws SQLException, ClassNotFoundException {
		LoginObject loginInfo = (LoginObject) object;
		NewUser account = new NewUser();
		DataBaseConnection.connectToDataBase();

		Statement statement = DataBaseConnection.getConnection().createStatement();

		ResultSet resultSet1 = statement.executeQuery(
				"select user_name, password, email, account_type, id from user_account_information where user_name = '"
						+ loginInfo.getUsername() + "' and password = '" + loginInfo.getPassword() + "'");

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
		DataBaseConnection.closeConnection();
		return account;
	}
	/** Gets account login information. **/
	public static boolean getAccountLoginInfo(Object object) {
		ForgotPassObject acc = (ForgotPassObject) object;
		try {
			DataBaseConnection.connectToDataBase();
			Statement statement = DataBaseConnection.getConnection().createStatement();
			ResultSet resultSet = statement
					.executeQuery("select user_name, email from user_account_information where user_name = '"
							+ acc.getUsername() + "' and email = '" + acc.getEmail() + "'");

			while (resultSet.next()) {
				return true;
			}

			DataBaseConnection.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	/** Changes account password. */
	public static boolean setAccountPassword(Object object) {
		ForgotPassObject2 forgotPasswordObject = (ForgotPassObject2) object;
		try {
			DataBaseConnection.connectToDataBase();
			PreparedStatement prepState = DataBaseConnection.getConnection().prepareStatement(
					"update user_account_information set password = '" + forgotPasswordObject.getPass()
							+ "' where user_name = '" + forgotPasswordObject.getUsername() + "'");

			prepState.executeUpdate();
			DataBaseConnection.closeConnection();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
