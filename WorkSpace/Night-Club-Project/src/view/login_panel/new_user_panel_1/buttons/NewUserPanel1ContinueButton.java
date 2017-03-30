package view.login_panel.new_user_panel_1.buttons;

import alerts.AlertForNewUser;
import alerts.AlertForZip;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import model_for_newuser.UserInformation;
import view.login_panel.new_user.scenes.NewUserPanel2;
import view.login_panel.new_user.stage.NewUserStage;
import view.login_panel.new_user_panel_1.buttons.methods.NewUserPanel1MissingText;
import view.login_panel.new_user_panel_1.panes.NewUserPanel1RadsPane;
import view.login_panel.new_user_panel_1.panes.NewUserPanel1TextFieldPane;

public class NewUserPanel1ContinueButton {

	private Button continueButton;
	private static UserInformation userInformation;

	public NewUserPanel1ContinueButton() {
		continueButton = new Button("Continue");
		continueButton.setFont(new Font("Arial Rounded MT Bold", 20));

		continueButton.setOnAction(event -> {
			if (new NewUserPanel1MissingText().checkMissingText() == true) {
				new AlertForNewUser();

			} else if (NewUserPanel1TextFieldPane.getZipTxt().getText().matches("[0-9]+") == false) {
				new AlertForZip();

			} else {
				userInformation = new UserInformation(NewUserPanel1TextFieldPane.getFirstNameTxt().getText(),
						NewUserPanel1TextFieldPane.getLastNameTxt().getText(),
						NewUserPanel1RadsPane.getGenderGroup().getText(),
						NewUserPanel1TextFieldPane.getZipTxt().getText());
				
				NewUserStage.getStage().setScene(NewUserPanel2.getScene());
			}

		});
	}

	public Button getContinueButton() {
		return continueButton;
	}

	public static UserInformation getUserInformation() {
		return userInformation;
	}
}
