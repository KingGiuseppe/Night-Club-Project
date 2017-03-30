package view.new_user_panel_2.buttons;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.new_user.scenes.NewUserPanel1;
import view.new_user_panel.stage.NewUserStage;

public class BackButtonForNewUserPanel2 {

	private Button backButton;
	private NewUserPanel1 newUserPanel1;

	public BackButtonForNewUserPanel2() {
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
