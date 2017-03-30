package view.login_panel.new_user_panel_1.panes;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class NewUserPanel1TextFieldPane {

	private static VBox textFieldVBox;
	private TextField firstNameTxt;
	private TextField lastNameTxt;
	private static TextField zipCodeTxt;

	public NewUserPanel1TextFieldPane() {
		new NewUserPanel1RadsPane();
		
		textFieldVBox = new VBox(10);
		
		firstNameTxt = new TextField();
		firstNameTxt.setAlignment(Pos.CENTER);
		firstNameTxt.setPromptText("First Name");
		firstNameTxt.setFont(new Font("Arial Rounded MT Bold", 20));

		lastNameTxt = new TextField();
		lastNameTxt.setAlignment(Pos.CENTER);
		lastNameTxt.setPromptText("Last Name");
		lastNameTxt.setFont(new Font("Arial Rounded MT Bold", 20));

		zipCodeTxt = new TextField();
		zipCodeTxt.setAlignment(Pos.CENTER);
		zipCodeTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		zipCodeTxt.setPromptText("Zip Code");

		textFieldVBox.getChildren().addAll(firstNameTxt, lastNameTxt, NewUserPanel1RadsPane.getPane(), zipCodeTxt);
	}

	public static VBox getPane() {
		return textFieldVBox;
	}

	public static TextField getFirstNameTxt() {
		return zipCodeTxt;
	}

	public static TextField getLastNameTxt() {
		return zipCodeTxt;
	}

	public static TextField getZipTxt() {
		return zipCodeTxt;
	}
}
