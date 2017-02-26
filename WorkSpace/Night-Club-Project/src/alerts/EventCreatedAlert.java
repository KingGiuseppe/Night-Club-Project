package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EventCreatedAlert {

	
	public EventCreatedAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Event Creation Successful!");
		alert.setHeaderText("Your event was created!");
		alert.setContentText("Click ok to continue.");
		alert.showAndWait();
	}
}
