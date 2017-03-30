package view.login_panel.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.login_panel.stage.LoginStage;

public class CancelButtonForLoginPanel {

	private Button cancelButton;

	public CancelButtonForLoginPanel() {
		cancelButton = new Button("Cancel");
		cancelButton.setMinSize(100, 30);
		cancelButton.setFont(new Font("Arial Rounded MT Bold", 20));
		cancelButton.setOnAction(event -> {
			LoginStage.closeStage();
		});
	}

	public Button getCancelButton() {
		return cancelButton;
	}
}
