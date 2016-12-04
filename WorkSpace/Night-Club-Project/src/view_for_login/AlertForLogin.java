package view_for_login;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertForLogin {

	public AlertForLogin(String name) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Login Successful!");
		alert.setHeaderText("Welcome " + name + "!");
		alert.setContentText("Click ok to continue.");
		alert.showAndWait();

	}

	public AlertForLogin() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Login Invalid!");
		alert.setHeaderText("Your Username of Password is incorrect!");
		alert.setContentText("Click ok to try again.");
		alert.showAndWait();
	}

}
