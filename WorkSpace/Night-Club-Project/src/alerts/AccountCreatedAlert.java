package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import view.new_user_panel_1.panes.NewUserPanel1TextFieldPane;

public class AccountCreatedAlert {

	public AccountCreatedAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Account Created!");
		alert.setHeaderText("Your account has been created!");
		alert.setContentText("Click ok to continue to login.");
		alert.showAndWait();
		
		alert.setOnCloseRequest(event -> {
			clearTextFields();
		});
		
		
	}
	
	public static void clearTextFields() {
		NewUserPanel1TextFieldPane.getFirstNameTxt().clear();
		NewUserPanel1TextFieldPane.getLastNameTxt().clear();
		NewUserPanel1TextFieldPane.getZipTxt().clear();
	}
}
