package view.new_user_panel_1.panes;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import view.new_user_panel_1.buttons.CancelButtonForNewUserPanel1;
import view.new_user_panel_1.buttons.ContinueButtonForNewUserPanel1;

public class NewUserPanel1ButtonPane {

	private static HBox buttonPane;
	private ContinueButtonForNewUserPanel1 continueButton;
	private CancelButtonForNewUserPanel1 cancelButton;

	public NewUserPanel1ButtonPane() {
		buttonPane = new HBox(20);
		buttonPane.setAlignment(Pos.BOTTOM_RIGHT);
		continueButton = new ContinueButtonForNewUserPanel1();
		cancelButton = new CancelButtonForNewUserPanel1();
		buttonPane.getChildren().addAll(continueButton.getContinueButton(), cancelButton.getCancelButton());
	}

	public static Pane getPane() {
		return buttonPane;
	}

}
