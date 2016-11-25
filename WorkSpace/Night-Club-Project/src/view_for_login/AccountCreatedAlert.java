package view_for_login;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AccountCreatedAlert {

	public AccountCreatedAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Account Created!");
		alert.setHeaderText("Your account has been created!");
		alert.setContentText("Click ok to continue to login.");
		
		alert.setOnCloseRequest(event -> {
			NewUserPane.closeStage();
		});
		alert.showAndWait();
	}
}
