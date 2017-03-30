package view.login_panel.new_user_panel_2.buttons;

import alerts.AlertForNewUser;
import alerts.PasswordsDontMatchAlert;
import controller.NewUserController;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import view.login_panel.new_user_panel_2.buttons.methods.NewUserPanel2CreateUserObject;
import view.login_panel.new_user_panel_2.buttons.methods.NewUserPanel2MissingText;
import view.login_panel.new_user_panel_2.buttons.methods.NewUserPanel2PasswordCheck;
import view.login_panel.new_user_panel_2.panes.NewUserPane2TextFieldPane;

public class NewUserPanel2CreateAccountButton {

	private Button createAccountButton;

	public NewUserPanel2CreateAccountButton() {
		createAccountButton = new Button("Create Account");
		createAccountButton.setFont(new Font("Arial Rounded MT Bold", 20));

		createAccountButton.setOnAction(event -> {

			if (new NewUserPanel2MissingText().checkMissingText() == true) {
				new AlertForNewUser();

			} else {

				if (new NewUserPanel2PasswordCheck().checkPasswordMatch() == false) {
					new PasswordsDontMatchAlert();

				} else if (new NewUserPanel2PasswordCheck().checkPasswordMatch() == true) {
					new NewUserController(new ButtonEventListenerMethods());

					if (ButtonEventListenerMethods.getButtonListener() != null) {
						ButtonEventListenerMethods.getButtonListener()
								.btnClicked(new NewUserPanel2CreateUserObject().createUserObject());
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
