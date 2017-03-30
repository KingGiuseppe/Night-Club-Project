package view.login_panel.new_user_panel_1.panes;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import view.login_panel.new_user_panel_1.buttons.NewUserPanel1CancelButton;
import view.login_panel.new_user_panel_1.buttons.NewUserPanel1ContinueButton;

public class NewUserPanel1ButtonPane {

	private static HBox buttonPane;
	private NewUserPanel1ContinueButton continueButton;
	private NewUserPanel1CancelButton cancelButton;

	public NewUserPanel1ButtonPane() {
		buttonPane = new HBox(20);
		buttonPane.setAlignment(Pos.BOTTOM_RIGHT);
		continueButton = new NewUserPanel1ContinueButton();
		cancelButton = new NewUserPanel1CancelButton();
		buttonPane.getChildren().addAll(continueButton.getContinueButton(), cancelButton.getCancelButton());
	}

	public static Pane getPane() {
		return buttonPane;
	}

}
