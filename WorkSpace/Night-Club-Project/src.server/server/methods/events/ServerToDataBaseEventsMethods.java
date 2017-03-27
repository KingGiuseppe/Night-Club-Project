package server.methods.events;

import java.io.ObjectOutputStream;

import server.database.events.methods.DataBaseEventsMethods;
import src.server.server.ServerMethods;

public class ServerToDataBaseEventsMethods {

	public synchronized static void getEventsList(ObjectOutputStream out) {
		if (DataBaseEventsMethods.getEvents() != null) {
			ServerMethods.writeObject(out, DataBaseEventsMethods.getEvents());
		} else {
			ServerMethods.writeObject(out, null);
		}
	}

	public synchronized static void addEvent(ObjectOutputStream out, Object object) {
		if (DataBaseEventsMethods.addEvent(object) == true) {
			ServerMethods.writeObject(out, true);
		} else {
			ServerMethods.writeObject(out, false);
		}

	}

	public synchronized static void removeEvent(ObjectOutputStream out, Object object) {
		if (DataBaseEventsMethods.removeEvent(object) == true) {
			ServerMethods.writeObject(out, true);
		} else {
			ServerMethods.writeObject(out, false);
		}
	}

}
