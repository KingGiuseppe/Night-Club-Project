package view.login_panel.forgot_password_2.buttons.methods;

import view.login_panel.forgot_password_1.panes.ForgotPasswordPanel1TextFieldPane;
import view.login_panel.forgot_password_2.panes.ForgotPasswordPanel2TextFieldPane;

public class ForgotPasswordPanel2ClearTextFields {

	public static void clearTextFields() {
		ForgotPasswordPanel1TextFieldPane.getEmailTxt().clear();
		ForgotPasswordPanel1TextFieldPane.getUsernameTxt().clear();
		ForgotPasswordPanel2TextFieldPane.getPasswordTxt().clear();
		ForgotPasswordPanel2TextFieldPane.getRetypePasswordTxt().clear();
	}

}
