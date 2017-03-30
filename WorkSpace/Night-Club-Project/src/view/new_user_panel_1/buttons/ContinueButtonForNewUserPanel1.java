package view.new_user_panel_1.buttons;

import alerts.AlertForNewUser;
import alerts.AlertForZip;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import model_for_newuser.UserInformation;
import view.new_user.scenes.NewUserPanel2;
import view.new_user_panel.stage.NewUserStage;
import view.new_user_panel_1.panes.NewUserPanel1RadsPane;
import view.new_user_panel_1.panes.NewUserPanel1TextFieldPane;

public class ContinueButtonForNewUserPanel1 {

	private Button continueButton;
	private static UserInformation userInformation;

	public ContinueButtonForNewUserPanel1() {
		continueButton = new Button("Continue");
		continueButton.setFont(new Font("Arial Rounded MT Bold", 20));
		
		continueButton.setOnAction(event -> {
			if (NewUserPanel1TextFieldPane.getFirstNameTxt().getText().equals("") || NewUserPanel1TextFieldPane.getLastNameTxt().getText().equals("")
					|| NewUserPanel1TextFieldPane.getZipTxt().getText().equals("")) {
				new AlertForNewUser();
				
			} else if (NewUserPanel1TextFieldPane.getZipTxt().getText().matches("[0-9]+") == false) {
				new AlertForZip();
				
			} else {
				userInformation = new UserInformation(NewUserPanel1TextFieldPane.getFirstNameTxt().getText(),
						NewUserPanel1TextFieldPane.getLastNameTxt().getText(), NewUserPanel1RadsPane.getGenderGroup().getText(),
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
