package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertForNewUser {
	
	public AlertForNewUser() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error!");
		alert.setHeaderText("One of the fields below are empty!");
		alert.setContentText("Click ok to continue to go back.");
		alert.showAndWait();

	}
}
