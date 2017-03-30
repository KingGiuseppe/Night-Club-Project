package view.login_panel.new_user_panel_1.buttons.methods;

import view.login_panel.new_user_panel_1.panes.NewUserPanel1TextFieldPane;

public class NewUserPanel1MissingText {

	public boolean checkMissingText() {

		if (NewUserPanel1TextFieldPane.getFirstNameTxt().getText().equals("")
				|| NewUserPanel1TextFieldPane.getLastNameTxt().getText().equals("")
				|| NewUserPanel1TextFieldPane.getZipTxt().getText().equals("")) {
			return true;
		} else {
			return false;
		}
	}

}
