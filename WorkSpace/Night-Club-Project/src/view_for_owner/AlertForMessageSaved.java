package view_for_owner;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertForMessageSaved {

	public AlertForMessageSaved() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Message Sent Successful!");
		alert.setHeaderText("Your message was sent!");
		alert.setContentText("Click ok to continue.");
		alert.showAndWait();
	}
}
