package src.server.methods.user;

import java.io.ObjectOutputStream;
import java.sql.SQLException;

import server.database.accounts.methods.DataBaseAccountMethods;
import src.server.server.ServerMethods;

public class ServerToDatabaseUserMethods {

	/** Finds Manager account in database then writes to client. */
	public synchronized static void findManagers(ObjectOutputStream out) {
		if (DataBaseAccountMethods.getManagerAccounts() != null) {
			ServerMethods.writeObject(out, DataBaseAccountMethods.getManagerAccounts());
		} else {
			ServerMethods.writeObject(out, null);
		}
	}

	/** Changes user password in database then writes to client. */
	public synchronized static void setPassword(ObjectOutputStream out, Object object) {
		if (DataBaseAccountMethods.setAccountPassword(object) == true) {
			ServerMethods.writeObject(out, true);
		} else {
			ServerMethods.writeObject(out, false);
		}
	}

	/** Finds user account in database then writes to client. */
	public synchronized static void getUserAcc(ObjectOutputStream out, Object object) {
		if (DataBaseAccountMethods.getAccountLoginInfo(object) == true) {
			ServerMethods.writeObject(out, true);
		} else {
			ServerMethods.writeObject(out, false);
		}

	}

	/** Adds user account to database then writes to client. */
	public synchronized static void addUserAccount(ObjectOutputStream out, Object object) {
		if (DataBaseAccountMethods.addAccount(object) == true) {
			ServerMethods.writeObject(out, true);
		} else {
			ServerMethods.writeObject(out, false);
		}
	}

	/** Gets login validation from database then writes to client. */
	public synchronized static void getLoginValidation(ObjectOutputStream out, Object object) {
		try {
			if (DataBaseAccountMethods.getLoginVerification(object) == true) {
				ServerMethods.writeObject(out, DataBaseAccountMethods.getAccount(object));
			} else {
				ServerMethods.writeObject(out, null);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
