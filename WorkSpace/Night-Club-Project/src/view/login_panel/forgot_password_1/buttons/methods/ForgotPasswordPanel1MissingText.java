package view.login_panel.forgot_password_1.buttons.methods;

import view.login_panel.forgot_password_1.panes.ForgotPassword1PanelTextFieldPane;

public class ForgotPasswordPanel1MissingText {

	public  boolean checkTextFields() {
		if (ForgotPassword1PanelTextFieldPane.getUsernameTxt().getText().equals("")
				|| ForgotPassword1PanelTextFieldPane.getEmailTxt().getText().equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
