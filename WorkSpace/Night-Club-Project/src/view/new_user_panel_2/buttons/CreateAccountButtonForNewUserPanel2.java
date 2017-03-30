package view.new_user_panel_2.buttons;

import alerts.AlertForNewUser;
import alerts.PasswordsDontMatchAlert;
import controller.NewUserController;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import model_for_newuser.NewUserObject;
import view.new_user_panel_1.buttons.ContinueButtonForNewUserPanel1;
import view.new_user_panel_2.panes.NewUserPane2TextFieldPane;

public class CreateAccountButtonForNewUserPanel2 {

	private Button createAccountButton;

	public CreateAccountButtonForNewUserPanel2() {
		createAccountButton = new Button("Create Account");
		createAccountButton.setFont(new Font("Arial Rounded MT Bold", 20));

		createAccountButton.setOnAction(event -> {

			if (NewUserPane2TextFieldPane.getEmailTxt().getText().equals("") || NewUserPane2TextFieldPane.getUsernameTxt().getText().equals("")
					|| NewUserPane2TextFieldPane.getPasswordTxt().getText().equals("")
					|| NewUserPane2TextFieldPane.getPassword2Txt().getText().equals("")) {
				new AlertForNewUser();
			} else {
				
				if (NewUserPane2TextFieldPane.getPasswordTxt().getText().equals(NewUserPane2TextFieldPane.getPassword2Txt().getText()) == false) {
					new PasswordsDontMatchAlert();
					
				} else if (NewUserPane2TextFieldPane.getPasswordTxt().getText().equals(NewUserPane2TextFieldPane.getPassword2Txt().getText())) {
					new NewUserController(new ButtonEventListenerMethods());
					
					NewUserObject userEvent = new NewUserObject(this,
							ContinueButtonForNewUserPanel1.getUserInformation().getFirstName(),
							ContinueButtonForNewUserPanel1.getUserInformation().getLastName(),
							ContinueButtonForNewUserPanel1.getUserInformation().getGender(),
							ContinueButtonForNewUserPanel1.getUserInformation().getZip(),
							NewUserPane2TextFieldPane.getEmailTxt().getText(), NewUserPane2TextFieldPane.getUsernameTxt().getText(),
							NewUserPane2TextFieldPane.getPasswordTxt().getText(), 0);

					if (ButtonEventListenerMethods.getButtonListener() != null) {
						ButtonEventListenerMethods.getButtonListener().btnClicked(userEvent);
					}
					NewUserPane2TextFieldPane.clearTextFields();
				}
			}
		});
	}

	public Button getCreateAccountButton() {
		return createAccountButton;
	}

}
