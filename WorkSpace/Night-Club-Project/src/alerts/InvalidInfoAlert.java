package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class InvalidInfoAlert {
	
	public InvalidInfoAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Info Error!");
		alert.setHeaderText("The info you entered does not exist!");
		alert.setContentText("Click ok to continue to try again.");
		alert.showAndWait();
	}
}
