package view.login_panel.forgot_password_1.buttons;

import alerts.AccountFoundAlert;
import alerts.AlertForNewUser;
import alerts.InvalidInfoAlert;
import controller.ForgotPassController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import model_for_login.ForgotPassObject;
import view.login_panel.forgot_password.scenes.ForgotPasswordPanel2;
import view.login_panel.forgot_password.stage.ForgotPasswordStage;
import view.login_panel.forgot_password_1.buttons.methods.ForgotPasswordPanel1MissingText;
import view.login_panel.forgot_password_1.panes.ForgotPasswordPanel1TextFieldPane;

public class ForgotPassword1ContinueButton {

	private static Button continueButton;
	private static boolean isValid;

	public ForgotPassword1ContinueButton() {
		continueButton = new Button("Continue");
		continueButton.setAlignment(Pos.CENTER_RIGHT);
		continueButton.setFont(new Font("Arial Rounded MT Bold", 20));

		continueButton.setOnAction(event -> {
			new ForgotPassController(new ButtonEventListenerMethods());
			if (new ForgotPasswordPanel1MissingText().checkTextFields() == true) {
				new AlertForNewUser();
			} else {
				ForgotPassObject forgotPassEvent = new ForgotPassObject(this,
						ForgotPasswordPanel1TextFieldPane.getUsernameTxt().getText(),
						ForgotPasswordPanel1TextFieldPane.getEmailTxt().getText());
				if (ButtonEventListenerMethods.getButtonListener() != null) {
					ButtonEventListenerMethods.getButtonListener().btnClicked(forgotPassEvent);
				}
				if (isValid == true) {
					new AccountFoundAlert();
					ForgotPasswordStage.getStage().setScene(ForgotPasswordPanel2.getScene());
				} else {
					new InvalidInfoAlert();
				}
			}

		});
	}

	public Button getContinueButton() {
		return continueButton;
	}

	public static void setIsInfo(boolean valid) {
		isValid = valid;
	}

}
