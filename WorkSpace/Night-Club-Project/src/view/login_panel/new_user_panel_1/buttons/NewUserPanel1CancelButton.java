package view.login_panel.new_user_panel_1.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.login_panel.new_user.stage.NewUserStage;
import view.login_panel.new_user_panel_1.panes.NewUserPanel1TextFieldPane;

public class NewUserPanel1CancelButton {

	private Button cancelButton;

	public NewUserPanel1CancelButton() {
		cancelButton = new Button("Cancel");
		cancelButton.setFont(new Font("Arial Rounded MT Bold", 20));
		
		cancelButton.setOnAction(event -> {
			NewUserPanel1TextFieldPane.getFirstNameTxt().clear();
			NewUserPanel1TextFieldPane.getLastNameTxt().clear();
			NewUserPanel1TextFieldPane.getZipTxt().clear();
			NewUserStage.closeStage();
		});
	}

	public Button getCancelButton() {
		return cancelButton;
	}
}
