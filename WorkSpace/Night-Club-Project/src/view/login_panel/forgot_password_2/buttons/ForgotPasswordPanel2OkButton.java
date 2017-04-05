package view.login_panel.forgot_password_2.buttons;

import alerts.AlertForNewUser;
import alerts.PasswordsDontMatchAlert;
import controller.ForgotPassController2;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import model_for_login.ForgotPassObject2;
import view.login_panel.forgot_password_2.buttons.methods.ForgotPasswordPanel2ClearTextFields;
import view.login_panel.forgot_password_2.buttons.methods.ForgotPasswordPanel2MissingText;
import view.login_panel.forgot_password_2.panes.ForgotPasswordPanel2TextFieldPane;

public class ForgotPasswordPanel2OkButton {

	private static Button okButton;

	public ForgotPasswordPanel2OkButton() {
		okButton = new Button("Ok");
		okButton.setFont(new Font("Arial Rounded MT Bold", 20));
		okButton.setMinWidth(50);
		okButton.setAlignment(Pos.CENTER_RIGHT);
		okButton.setOnAction(event -> {
			if (ForgotPasswordPanel2MissingText.checkTextFields() == true) {
				new AlertForNewUser();
			} else {
				if (ForgotPasswordPanel2TextFieldPane.getPasswordTxt().getText().equals(ForgotPasswordPanel2TextFieldPane.getRetypePasswordTxt().getText())) {
					
					new ForgotPassController2(new ButtonEventListenerMethods());

					ForgotPassObject2 object = new ForgotPassObject2(this, ForgotPasswordPanel2TextFieldPane.getPasswordTxt().getText(), ForgotPasswordPanel2TextFieldPane.getRetypePasswordTxt().getText());
					if (ButtonEventListenerMethods.getButtonListener() != null) {
						ButtonEventListenerMethods.getButtonListener().btnClicked(object);
						
						ForgotPasswordPanel2ClearTextFields.clearTextFields();
					}
				} else {
					new PasswordsDontMatchAlert();
				}
			}
		});
		
	}
	
	public static Button getOkButton() {
		return okButton;
	}

}
