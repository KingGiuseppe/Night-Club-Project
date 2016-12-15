package view_for_owner;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class LogoutAlert {

	public LogoutAlert() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Are you sure you want to logout?");
		alert.setContentText("Click ok to continue or cancel to go back");
		alert.showAndWait();
	}
}
