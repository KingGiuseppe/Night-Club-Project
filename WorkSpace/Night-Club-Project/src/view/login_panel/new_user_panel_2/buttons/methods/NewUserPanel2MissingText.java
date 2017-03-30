package view.login_panel.new_user_panel_2.buttons.methods;

import view.login_panel.new_user_panel_2.panes.NewUserPane2TextFieldPane;

public class NewUserPanel2MissingText {

	public boolean checkMissingText() {

		if (NewUserPane2TextFieldPane.getEmailTxt().getText().equals("")
				|| NewUserPane2TextFieldPane.getUsernameTxt().getText().equals("")
				|| NewUserPane2TextFieldPane.getPasswordTxt().getText().equals("")
				|| NewUserPane2TextFieldPane.getPassword2Txt().getText().equals("")) {
			return true;
		} else {
			return false;
		}

	}
}
