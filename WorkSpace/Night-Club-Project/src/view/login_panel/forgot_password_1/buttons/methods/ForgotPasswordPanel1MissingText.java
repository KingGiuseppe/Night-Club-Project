package view.login_panel.forgot_password_1.buttons.methods;

import view.login_panel.forgot_password_1.panes.ForgotPasswordPanel1TextFieldPane;

public class ForgotPasswordPanel1MissingText {

	public  boolean checkTextFields() {
		if (ForgotPasswordPanel1TextFieldPane.getUsernameTxt().getText().equals("")
				|| ForgotPasswordPanel1TextFieldPane.getEmailTxt().getText().equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
