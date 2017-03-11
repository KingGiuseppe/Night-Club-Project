package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import view_for_login.NewUserPane;
import view_for_login.NewUserPane2;

public class AccountCreatedAlert {

	public AccountCreatedAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Account Created!");
		alert.setHeaderText("Your account has been created!");
		alert.setContentText("Click ok to continue to login.");
		
		alert.setOnCloseRequest(event -> {
			NewUserPane.getFirstNameTxt().clear();
			NewUserPane.getLastNameTxt().clear();
			NewUserPane.getZipTxt().clear();
			NewUserPane2.getEmailTxt().clear();
			NewUserPane2.getUsernameTxt().clear();
			NewUserPane2.getPasswordTxt().clear();
			NewUserPane2.getPassword2Txt().clear();
			NewUserPane.closeStage();
		});
		
		alert.showAndWait();
	}
}
