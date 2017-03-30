package view.login_panel.panes;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LoginPanelTextFieldPane {

	private static TextField usernameTxt;
	private static TextField passwordTxt;
	private static VBox textFieldPane;

	public LoginPanelTextFieldPane() {
		textFieldPane = new VBox(1);
		textFieldPane.setAlignment(Pos.CENTER);

		usernameTxt = new TextField();
		usernameTxt.setMaxSize(200, 201);
		usernameTxt.setAlignment(Pos.CENTER);
		usernameTxt.setPromptText("User Name");
		usernameTxt.setFont(new Font("Arial Rounded MT Bold", 20));

		passwordTxt = new TextField();
		passwordTxt.setMaxSize(200, 201);
		passwordTxt.setPromptText("Password");
		passwordTxt.setAlignment(Pos.CENTER);
		passwordTxt.setFont(new Font("Arial Rounded MT Bold", 20));

		textFieldPane.getChildren().addAll(usernameTxt, passwordTxt);
	}

	public static String getUsername() {
		return usernameTxt.getText();
	}

	public static String getPass() {
		return passwordTxt.getText();
	}

	public static void clearFields() {
		usernameTxt.clear();
		passwordTxt.clear();
	}

	public static VBox getPane() {
		return textFieldPane;
	}

}
