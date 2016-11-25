package view_for_login;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AccountCreatedAlert {

	public AccountCreatedAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Alert from Child Window 1.");
		alert.setHeaderText("Error Alert from Window 1");
		alert.setContentText("Ouch, something is wrong");
		alert.showAndWait();
	}
}
