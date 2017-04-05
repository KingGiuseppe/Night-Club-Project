package view.login_panel.forgot_password_1.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.login_panel.forgot_password.stage.ForgotPasswordStage;
import view.login_panel.forgot_password_2.buttons.methods.ForgotPasswordPanel2ClearTextFields;

public class ForgotPassword1CancelButton {

	private Button cancelButton;

	public ForgotPassword1CancelButton() {
		cancelButton = new Button("Cancel");
		cancelButton.setFont(new Font("Arial Rounded MT Bold", 20));

		cancelButton.setOnAction(event -> {
			ForgotPasswordPanel2ClearTextFields.clearTextFields();
			ForgotPasswordStage.closeStage();
		});

	}
	
	public Button getCancelButton() {
		return cancelButton;
	}

}
