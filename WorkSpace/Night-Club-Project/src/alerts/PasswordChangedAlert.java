package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PasswordChangedAlert {

	public PasswordChangedAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Password Changed!");
		alert.setHeaderText("Your password has been changed!");
		alert.setContentText("Click ok to continue to try again.");
		alert.showAndWait();
	}
}
