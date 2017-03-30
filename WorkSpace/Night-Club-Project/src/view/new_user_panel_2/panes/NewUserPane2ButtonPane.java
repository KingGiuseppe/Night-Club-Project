package view.new_user_panel_2.panes;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import view.new_user_panel_2.buttons.BackButtonForNewUserPanel2;
import view.new_user_panel_2.buttons.CreateAccountButtonForNewUserPanel2;

public class NewUserPane2ButtonPane {

	private static HBox buttonPane;
	private CreateAccountButtonForNewUserPanel2 createAccountButton;
	private BackButtonForNewUserPanel2 backButton;

	public NewUserPane2ButtonPane() {
		buttonPane = new HBox(20);
		buttonPane.setAlignment(Pos.BOTTOM_RIGHT);
		createAccountButton = new CreateAccountButtonForNewUserPanel2();
		backButton = new BackButtonForNewUserPanel2();

		buttonPane.getChildren().addAll(createAccountButton.getCreateAccountButton(), backButton.getBackButton());

	}

	public static Pane getPane() {
		return buttonPane;
	}

}
