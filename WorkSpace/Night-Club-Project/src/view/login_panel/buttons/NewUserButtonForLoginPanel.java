package view.login_panel.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.login_panel.new_user.scenes.NewUserPanel1;
import view.login_panel.new_user.scenes.NewUserPanel2;
import view.login_panel.new_user.stage.NewUserStage;

public class NewUserButtonForLoginPanel {

	private Button newUserButton;

	public NewUserButtonForLoginPanel() {
		
		new NewUserStage();
		new NewUserPanel1();
		new NewUserPanel2();
		
		newUserButton = new Button("New User?");
		newUserButton.setStyle("-fx-background-color: transparent;");
		newUserButton.setFont(new Font("Arial Rounded MT Bold", 12));
		newUserButton.setOnAction(event -> {
			NewUserStage.showStage();
			NewUserStage.getStage().setScene(NewUserPanel1.getScene());
		});
	}

	public Button getNewUserButton() {
		return newUserButton;
	}
}
