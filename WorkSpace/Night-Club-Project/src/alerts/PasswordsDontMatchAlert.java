package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PasswordsDontMatchAlert {

	public PasswordsDontMatchAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Password Error!");
		alert.setHeaderText("Your passwords don't match!");
		alert.setContentText("Click ok to continue to try again.");
		alert.showAndWait();
	}
	
}
