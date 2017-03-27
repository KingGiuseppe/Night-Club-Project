package server.database.events.methods;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model_for_event_creation.CreateEventObject;
import model_for_event_creation.CreateEventPaneObject;
import model_for_removeEv.RemoveEventObj;
import server.database.connection.methods.DataBaseConnection;

public class DataBaseEventsMethods {

	/** Removes event from database. */
	public static boolean removeEvent(Object object) {
		RemoveEventObj event = (RemoveEventObj) object;

		try {
			DataBaseConnection.connectToDataBase();
			PreparedStatement prepState = DataBaseConnection.getConnection()
					.prepareStatement("delete from event_table where event_name = '" + event.getEventName() + "'");

			prepState.execute();
			DataBaseConnection.closeConnection();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	/** Adds an event to the database. */
	public static boolean addEvent(Object object) {
		CreateEventObject eventObject = (CreateEventObject) object;
		try {

			DataBaseConnection.connectToDataBase();

			PreparedStatement prepState = DataBaseConnection.getConnection()
					.prepareStatement("insert into event_table (event_name, artist, music_type, date, picture_link)"
							+ " values (?, ?, ?, ?, ?)");

			prepState.setString(1, eventObject.getEventName());
			prepState.setString(2, eventObject.getArtist());
			prepState.setString(3, eventObject.getGenre());
			prepState.setString(4, eventObject.getDate());
			prepState.setString(5, eventObject.getPictureLink());
			prepState.execute();

			DataBaseConnection.closeConnection();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	/** Get events list from database. */
	public static ArrayList<CreateEventPaneObject> getEvents() {
		ArrayList<CreateEventPaneObject> list = new ArrayList<>();

		DataBaseConnection.connectToDataBase();

		try {
			PreparedStatement prepStatement = DataBaseConnection.getConnection()
					.prepareStatement("select * from event_table");

			ResultSet resultSet = prepStatement.executeQuery();

			while (resultSet.next()) {
				list.add(new CreateEventPaneObject(resultSet.getString(1), resultSet.getString(4),
						resultSet.getString(3), resultSet.getString(2), resultSet.getString(5)));
			}
			DataBaseConnection.closeConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

}
