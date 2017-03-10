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
			NewUserPane.firstNameTxt.clear();
			NewUserPane.lastNameTxt.clear();
			NewUserPane.zipTxt.clear();
			NewUserPane2.emailTxt.clear();
			NewUserPane2.usernameTxt.clear();
			NewUserPane2.passwordTxt.clear();
			NewUserPane2.password2Txt.clear();
			NewUserPane.closeStage();
		});
		
		alert.showAndWait();
	}
}
