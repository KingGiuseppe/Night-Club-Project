package view.login_panel.new_user_panel_2.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.login_panel.new_user.scenes.NewUserPanel1;
import view.login_panel.new_user.stage.NewUserStage;

public class NewUserPanel2BackButton {

	private Button backButton;

	public NewUserPanel2BackButton() {
		backButton = new Button("Go back");
		backButton.setFont(new Font("Arial Rounded MT Bold", 20));

		backButton.setOnAction(event -> {
			NewUserStage.getStage().setScene(NewUserPanel1.getScene());
		});
	}

	public Button getBackButton() {
		return backButton;
	}
}
