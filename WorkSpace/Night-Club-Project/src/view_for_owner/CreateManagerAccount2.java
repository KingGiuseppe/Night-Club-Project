package view_for_owner;

import buttons_for_owner_panel.ButtonsForCreateManAcc2;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class CreateManagerAccount2 {

	private static GridPane createManagerAccount2;
	private Label label;
	private Label emailLbl;
	private Label usernameLbl;
	private Label passwordLbl;
	private HBox pane2;
	private Label passRuleLbl;
	private Label password2Lbl;
	private static TextField emailTxt;
	private static TextField usernameTxt;
	private static TextField passwordTxt;
	private static TextField password2Txt;
	private static Scene scene;

	public CreateManagerAccount2() {
		createManagerAccount2 = new GridPane();
		createManagerAccount2.setAlignment(Pos.CENTER);
		createManagerAccount2.setHgap(10);
		createManagerAccount2.setVgap(10);
		createManagerAccount2.setPadding(new Insets(25, 25, 25, 25));

		label = new Label("Please enter your information below");
		label.setFont(Font.font(25));
		emailLbl = new Label("Email address");
		usernameLbl = new Label("Username");
		passwordLbl = new Label("Password");

		pane2 = new HBox();
		passRuleLbl = new Label("Must contain atleast one number and one uppercase letter!");
		passRuleLbl.setFont(Font.font(10));
		pane2.setAlignment(Pos.CENTER);
		pane2.getChildren().add(passRuleLbl);

		password2Lbl = new Label("Retype Password");

		setEmailTxt(new TextField());
		getEmailTxt().setAlignment(Pos.CENTER);
		setUsernameTxt(new TextField());
		getUsernameTxt().setAlignment(Pos.CENTER);
		setPasswordTxt(new TextField());
		getPasswordTxt().setAlignment(Pos.CENTER);
		setPassword2Txt(new TextField());
		getPassword2Txt().setAlignment(Pos.CENTER);

		createManagerAccount2.add(label, 0, 0, 2, 1);

		createManagerAccount2.add(emailLbl, 0, 3);
		createManagerAccount2.add(getEmailTxt(), 1, 3);

		createManagerAccount2.add(usernameLbl, 0, 4);
		createManagerAccount2.add(getUsernameTxt(), 1, 4);

		createManagerAccount2.add(passwordLbl, 0, 5);
		createManagerAccount2.add(getPasswordTxt(), 1, 5);

		createManagerAccount2.add(pane2, 1, 6);

		createManagerAccount2.add(password2Lbl, 0, 7);
		createManagerAccount2.add(getPassword2Txt(), 1, 7);

		createManagerAccount2.add(new ButtonsForCreateManAcc2().getPane(), 1, 9, 2, 1);
		scene = new Scene(createManagerAccount2, 500, 450);
	}

	public static Pane getPane() {
		return createManagerAccount2;
	}

	public static Scene getScene() {
		return scene;
	}

	public static TextField getEmailTxt() {
		return emailTxt;
	}

	public static void setEmailTxt(TextField emailTxt) {
		CreateManagerAccount2.emailTxt = emailTxt;
	}

	public static TextField getUsernameTxt() {
		return usernameTxt;
	}

	public static void setUsernameTxt(TextField usernameTxt) {
		CreateManagerAccount2.usernameTxt = usernameTxt;
	}

	public static TextField getPasswordTxt() {
		return passwordTxt;
	}

	public static void setPasswordTxt(TextField passwordTxt) {
		CreateManagerAccount2.passwordTxt = passwordTxt;
	}

	public static TextField getPassword2Txt() {
		return password2Txt;
	}

	public static void setPassword2Txt(TextField password2Txt) {
		CreateManagerAccount2.password2Txt = password2Txt;
	}
}
