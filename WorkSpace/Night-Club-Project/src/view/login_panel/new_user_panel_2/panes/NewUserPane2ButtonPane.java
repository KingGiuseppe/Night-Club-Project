package view.login_panel.new_user_panel_2.panes;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import view.login_panel.new_user_panel_2.buttons.NewUserPanel2BackButton;
import view.login_panel.new_user_panel_2.buttons.NewUserPanel2CreateAccountButton;

public class NewUserPane2ButtonPane {

	private static HBox buttonPane;
	private NewUserPanel2CreateAccountButton createAccountButton;
	private NewUserPanel2BackButton backButton;

	public NewUserPane2ButtonPane() {
		buttonPane = new HBox(20);
		buttonPane.setAlignment(Pos.BOTTOM_RIGHT);
		
		createAccountButton = new NewUserPanel2CreateAccountButton();
		
		backButton = new NewUserPanel2BackButton();

		buttonPane.getChildren().addAll(createAccountButton.getCreateAccountButton(), backButton.getBackButton());
	}

	public static Pane getPane() {
		return buttonPane;
	}

}
