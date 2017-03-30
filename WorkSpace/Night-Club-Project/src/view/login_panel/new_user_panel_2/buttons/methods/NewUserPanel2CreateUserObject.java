package view.login_panel.new_user_panel_2.buttons.methods;

import java.util.EventObject;

import model_for_newuser.NewUserObject;
import view.login_panel.new_user_panel_1.buttons.NewUserPanel1ContinueButton;
import view.login_panel.new_user_panel_2.buttons.NewUserPanel2CreateAccountButton;
import view.login_panel.new_user_panel_2.panes.NewUserPane2TextFieldPane;

public class NewUserPanel2CreateUserObject {

	public EventObject createUserObject() {

		NewUserObject userEvent = new NewUserObject(new NewUserPanel2CreateAccountButton(),
				NewUserPanel1ContinueButton.getUserInformation().getFirstName(),
				NewUserPanel1ContinueButton.getUserInformation().getLastName(),
				NewUserPanel1ContinueButton.getUserInformation().getGender(),
				NewUserPanel1ContinueButton.getUserInformation().getZip(),
				NewUserPane2TextFieldPane.getEmailTxt().getText(), NewUserPane2TextFieldPane.getUsernameTxt().getText(),
				NewUserPane2TextFieldPane.getPasswordTxt().getText(), 0);

		return userEvent;

	}

}
