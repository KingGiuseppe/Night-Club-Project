package view_for_manager;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EmailSentAlert {

	public EmailSentAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Email Sent!");
		alert.setHeaderText("Your email successfully sent!");
		alert.setContentText("Click ok to continue.");
		alert.showAndWait();
	}
}
