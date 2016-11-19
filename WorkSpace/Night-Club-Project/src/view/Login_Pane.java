package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Login_Pane {

	private GridPane loginMainPane;
	private Label welcomeLbl;
	private Label loginLbl;
	private Label unLbl;
	private Label passLbl;
	private TextField unTxt;
	private TextField passTxt;
	private Button loginBtn;
	private Button newUserBtn;
	private Button forgotPassBtn;
	private HBox btnPane;

	public Login_Pane() {
		loginMainPane = new GridPane();
		btnPane = new HBox(20);
		
		loginMainPane.setAlignment(Pos.CENTER);
		loginMainPane.setHgap(10);
		loginMainPane.setVgap(10);
		loginMainPane.setPadding(new Insets(25, 25, 25, 25));
		
		welcomeLbl = new Label("Welcome");
		welcomeLbl.setFont(Font.font(20));
		
		loginLbl = new Label("Login");
		loginLbl.setFont(Font.font(15));
		unLbl = new Label("Username: ");
		passLbl = new Label("Password: ");
		unTxt = new TextField();
		passTxt = new TextField();
		loginBtn = new Button("Login");
		newUserBtn = new Button("New User?");
		forgotPassBtn = new Button("Forgot Password?");
		
		loginMainPane.add(welcomeLbl, 0, 0, 2, 1);
		loginMainPane.add(loginLbl, 0, 1);
		loginMainPane.add(unLbl, 0, 2);
		loginMainPane.add(unTxt, 1, 2);
		loginMainPane.add(passLbl, 0, 4);
		loginMainPane.add(passTxt, 1, 4);
		btnPane.getChildren().addAll(newUserBtn, forgotPassBtn, loginBtn);
		loginMainPane.add(btnPane, 1, 5);
		
		
	}
	
	public Pane getPane() {
		return loginMainPane;
	}
}
