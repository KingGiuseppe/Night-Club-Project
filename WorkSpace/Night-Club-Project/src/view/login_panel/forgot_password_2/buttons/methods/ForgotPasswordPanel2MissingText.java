package view.login_panel.forgot_password_2.buttons.methods;

import view.login_panel.forgot_password_2.panes.ForgotPasswordPanel2TextFieldPane;

public class ForgotPasswordPanel2MissingText {

	public static boolean checkTextFields() {
		if (ForgotPasswordPanel2TextFieldPane.getPasswordTxt().getText().equals("") ||ForgotPasswordPanel2TextFieldPane.getRetypePasswordTxt().getText().equals("")) {
			return true;
		} else {
			return false;
		}
	}
	
}
