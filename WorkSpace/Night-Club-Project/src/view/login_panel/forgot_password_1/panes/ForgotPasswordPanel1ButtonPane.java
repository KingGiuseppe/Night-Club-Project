package view.login_panel.forgot_password_1.panes;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import view.login_panel.forgot_password_1.buttons.ForgotPassword1CancelButton;
import view.login_panel.forgot_password_1.buttons.ForgotPassword1ContinueButton;

public class ForgotPasswordPanel1ButtonPane {

	private static HBox buttonPane;
	private ForgotPassword1ContinueButton continueButton;
	private ForgotPassword1CancelButton cancelButton;

	public ForgotPasswordPanel1ButtonPane() {
		buttonPane = new HBox(10);
		buttonPane.setAlignment(Pos.BOTTOM_RIGHT);

		continueButton = new ForgotPassword1ContinueButton();
		cancelButton = new ForgotPassword1CancelButton();

		buttonPane.getChildren().addAll(continueButton.getContinueButton(), cancelButton.getCancelButton());
	}

	public static Node getPane() {
		return buttonPane;
	}

}
