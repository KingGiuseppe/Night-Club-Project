package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AccountFoundAlert {
	
	public AccountFoundAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Account found!");
		alert.setHeaderText("Your account has been found!");
		alert.setContentText("Click ok to continue to try again.");
		alert.showAndWait();
	}
}
