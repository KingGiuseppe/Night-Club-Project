package view.login_panel.new_user_panel_2.panes;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class NewUserPane2TextFieldPane {

	private static VBox textFieldVBox;
	private static TextField emailTxt;
	private static TextField usernameTxt;
	private static TextField passwordTxt;
	private static TextField password2Txt;

	public NewUserPane2TextFieldPane() {
		new NewUserPane2Labels();
		textFieldVBox = new VBox(10);
		emailTxt = new TextField();
		emailTxt.setAlignment(Pos.CENTER);
		emailTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		emailTxt.setPromptText("Email Address");

		usernameTxt = new TextField();
		usernameTxt.setAlignment(Pos.CENTER);
		usernameTxt.setPromptText("Username");
		usernameTxt.setFont(new Font("Arial Rounded MT Bold", 20));

		passwordTxt = new TextField();
		passwordTxt.setAlignment(Pos.CENTER);
		passwordTxt.setPromptText("Password");
		passwordTxt.setFont(new Font("Arial Rounded MT Bold", 20));

		password2Txt = new TextField();
		password2Txt.setAlignment(Pos.CENTER);
		password2Txt.setPromptText("Retype Password");
		password2Txt.setFont(new Font("Arial Rounded MT Bold", 20));

		textFieldVBox.getChildren().addAll(NewUserPane2Labels.getEnterInformationLbl(), emailTxt, usernameTxt,
				NewUserPane2Labels.getPasswordRuleLbl(), passwordTxt, password2Txt);
	}

	public static VBox getPane() {
		return textFieldVBox;
	}

	public static TextField getEmailTxt() {
		return emailTxt;
	}

	public static TextField getUsernameTxt() {
		return usernameTxt;
	}

	public static TextField getPasswordTxt() {
		return passwordTxt;
	}

	public static TextField getPassword2Txt() {
		return password2Txt;
	}

	public static void clearTextFields() {
		getEmailTxt().clear();
		getUsernameTxt().clear();
		getPasswordTxt().clear();
		getPassword2Txt().clear();
	}

}
