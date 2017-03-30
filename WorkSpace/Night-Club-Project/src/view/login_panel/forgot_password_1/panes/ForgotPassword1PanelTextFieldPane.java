package view.login_panel.forgot_password_1.panes;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ForgotPassword1PanelTextFieldPane {

	private static TextField usernameTxt;
	private static TextField emailTxt;
	private static VBox textFieldVBox;

	public ForgotPassword1PanelTextFieldPane() {
		textFieldVBox = new VBox(10);
		textFieldVBox.setAlignment(Pos.CENTER);
		usernameTxt = new TextField();
		usernameTxt.setPromptText("Username");
		usernameTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		usernameTxt.setAlignment(Pos.CENTER);

		emailTxt = new TextField();
		emailTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		emailTxt.setPromptText("Email Address");
		emailTxt.setAlignment(Pos.CENTER);

		textFieldVBox.getChildren().addAll(usernameTxt, emailTxt);

	}

	public static VBox getPane() {
		return textFieldVBox;
	}

	public static TextField getUsernameTxt() {
		return usernameTxt;
	}

	public static TextField getEmailTxt() {
		return emailTxt;
	}

	public static void clearTextFields() {
		usernameTxt.clear();
		emailTxt.clear();
	}

}
