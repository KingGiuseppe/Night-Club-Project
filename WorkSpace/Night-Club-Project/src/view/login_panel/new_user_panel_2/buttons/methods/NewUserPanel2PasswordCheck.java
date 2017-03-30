package view.login_panel.new_user_panel_2.buttons.methods;

import view.login_panel.new_user_panel_2.panes.NewUserPane2TextFieldPane;

public class NewUserPanel2PasswordCheck {

	public boolean checkPasswordMatch() {
		if (NewUserPane2TextFieldPane.getPasswordTxt().getText()
				.equals(NewUserPane2TextFieldPane.getPassword2Txt().getText()) == false) {
			return false;
		} else {
			return true;
		}
	}

}
