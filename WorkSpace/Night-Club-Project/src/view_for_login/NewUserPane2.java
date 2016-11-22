package view_for_login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class NewUserPane2 {

	private static GridPane newUserPane2;
	private Label emailLbl;
	private Label usernameLbl;
	private Label passwordLbl;
	private Label passRuleLbl;
	private Label password2Lbl;
	static TextField emailTxt;
	static TextField usernameTxt;
	static TextField passwordTxt;
	private TextField password2Txt;
	private Label label;
	private HBox pane2;
	private static Scene scene;

	public NewUserPane2() {
		newUserPane2 = new GridPane();
		newUserPane2.setAlignment(Pos.CENTER);
		newUserPane2.setHgap(10);
		newUserPane2.setVgap(10);
		newUserPane2.setPadding(new Insets(25, 25, 25, 25));
		
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
		
		newUserPane2.add(label, 0, 0, 2, 1);
		
		newUserPane2.add(emailLbl, 0, 3);
		newUserPane2.add(emailTxt, 1, 3);

		newUserPane2.add(usernameLbl, 0, 4);
		newUserPane2.add(usernameTxt, 1, 4);
		
		newUserPane2.add(passwordLbl, 0, 5);
		newUserPane2.add(passwordTxt, 1, 5);
		
		newUserPane2.add(pane2, 1, 6);
		
		newUserPane2.add(password2Lbl, 0, 7);
		newUserPane2.add(password2Txt, 1, 7);
		
		newUserPane2.add(new ButtonsForNewUserPanel2().getPane(), 1, 9, 2, 1);
		scene = new Scene(newUserPane2, 500, 450);
	}
	
	public static Pane getPane() {
		return newUserPane2;
	}
	public static Scene getScene() {
		return scene;
	}
}
