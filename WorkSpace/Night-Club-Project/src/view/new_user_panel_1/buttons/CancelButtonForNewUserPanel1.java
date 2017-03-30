package view.new_user_panel_1.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.new_user_panel.stage.NewUserStage;
import view.new_user_panel_1.panes.NewUserPanel1TextFieldPane;

public class CancelButtonForNewUserPanel1 {

	private Button cancelButton;

	public CancelButtonForNewUserPanel1() {
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
