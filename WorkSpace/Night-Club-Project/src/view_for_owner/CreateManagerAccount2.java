package view_for_owner;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import view_for_login.ButtonsForNewUserPanel2;

public class CreateManagerAccount2 {

	
	private static GridPane createManagerAccount2;
	private Label label;
	private Label emailLbl;
	private Label usernameLbl;
	private Label passwordLbl;
	private HBox pane2;
	private Label passRuleLbl;
	private Label password2Lbl;
	static TextField emailTxt;
	static TextField usernameTxt;
	static TextField passwordTxt;
	static TextField password2Txt;
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
		
		emailTxt = new TextField();
		emailTxt.setAlignment(Pos.CENTER);
		usernameTxt = new TextField();
		usernameTxt.setAlignment(Pos.CENTER);
		passwordTxt = new TextField();
		passwordTxt.setAlignment(Pos.CENTER);
		password2Txt = new TextField();
		password2Txt.setAlignment(Pos.CENTER);
		
		createManagerAccount2.add(label, 0, 0, 2, 1);
		
		createManagerAccount2.add(emailLbl, 0, 3);
		createManagerAccount2.add(emailTxt, 1, 3);

		createManagerAccount2.add(usernameLbl, 0, 4);
		createManagerAccount2.add(usernameTxt, 1, 4);
		
		createManagerAccount2.add(passwordLbl, 0, 5);
		createManagerAccount2.add(passwordTxt, 1, 5);
		
		createManagerAccount2.add(pane2, 1, 6);
		
		createManagerAccount2.add(password2Lbl, 0, 7);
		createManagerAccount2.add(password2Txt, 1, 7);
		
		createManagerAccount2.add(new ButtonsForCreateManAcc2().getPane(), 1, 9, 2, 1);
		scene = new Scene(createManagerAccount2, 500, 450);
	}
	
	public static Pane getPane() {
		return createManagerAccount2;
	}
	public static Scene getScene() {
		return scene;
	}
}
