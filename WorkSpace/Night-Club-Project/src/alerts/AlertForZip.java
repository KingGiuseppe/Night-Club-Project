package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertForZip {

	public AlertForZip() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error!");
		alert.setHeaderText("The Zip Code can only contain numbers!");
		alert.setContentText("Click ok to continue to go back.");
		alert.showAndWait();
	}
}
