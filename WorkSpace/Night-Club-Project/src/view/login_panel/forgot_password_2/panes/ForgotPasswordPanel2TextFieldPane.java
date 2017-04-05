package view.login_panel.forgot_password_2.panes;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ForgotPasswordPanel2TextFieldPane {

	private static VBox textFieldVBox;
	private static TextField passwordTxt;
	private static TextField retypePasswordTxt;

	public ForgotPasswordPanel2TextFieldPane() {
		textFieldVBox = new VBox(10);
		
		passwordTxt = new TextField();
		passwordTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		passwordTxt.setPromptText("New Password");
		passwordTxt.setAlignment(Pos.CENTER);
		
		retypePasswordTxt = new TextField();
		retypePasswordTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		retypePasswordTxt.setPromptText("Retype New Password");
		retypePasswordTxt.setAlignment(Pos.CENTER);
		
		textFieldVBox.getChildren().addAll(passwordTxt, retypePasswordTxt);
	}

	
	public static VBox getPane() {
		return textFieldVBox;
	}


	public static TextField getPasswordTxt() {
		return passwordTxt;
	}


	public static TextField getRetypePasswordTxt() {
		return retypePasswordTxt;
	}
	
	
}
