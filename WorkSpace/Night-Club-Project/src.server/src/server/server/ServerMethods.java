package src.server.server;

import java.io.IOException;
import java.io.ObjectOutputStream;

import model_for_event_creation.CreateEventObject;
import model_for_login.ForgotPassObject;
import model_for_login.ForgotPassObject2;
import model_for_login.LoginObject;
import model_for_newuser.NewUserObject;
import model_for_removeEv.RemoveEventObj;
import server.methods.events.ServerToDataBaseEventsMethods;
import src.server.methods.user.ServerToDatabaseUserMethods;

public class ServerMethods {

	/** Sends object and objectOutputStream to server methods */
	public static void getServerMethod(Object object, ObjectOutputStream outputToClient) {
		if (object.getClass() == LoginObject.class) {
			ServerToDatabaseUserMethods.getLoginValidation(outputToClient, object);
		} else if (object.toString().equals("Get Events")) {
			ServerToDataBaseEventsMethods.getEventsList(outputToClient);
		} else if (object.getClass() == CreateEventObject.class) {
			ServerToDataBaseEventsMethods.addEvent(outputToClient, object);
		} else if (object.getClass() == RemoveEventObj.class) {
			ServerToDataBaseEventsMethods.removeEvent(outputToClient, object);
		} else if (object.getClass() == NewUserObject.class) {
			ServerToDatabaseUserMethods.addUserAccount(outputToClient, object);
		} else if (object.getClass() == ForgotPassObject.class) {
			ServerToDatabaseUserMethods.getUserAcc(outputToClient, object);
		} else if (object.getClass() == ForgotPassObject2.class) {
			ServerToDatabaseUserMethods.setPassword(outputToClient, object);
		} else if (object.toString().equals("Find Managers")) {
			ServerToDatabaseUserMethods.findManagers(outputToClient);
		}
	}

	/** Writes an object to the controller */
	public synchronized static void writeObject(ObjectOutputStream out, Object object) {
		try {
			out.writeObject(object);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
