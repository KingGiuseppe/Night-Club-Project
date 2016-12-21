package view_for_login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Login_Pane {

	private GridPane loginMainPane;
	private Label welcomeLbl;
	private Label loginLbl;
	private Label unLbl;
	private Label passLbl;
	private static TextField unTxt;
	private static TextField passTxt;
	private ButtonsForLoginPanel loginPanelButtons;

	public Login_Pane() {
		loginPanelButtons = new ButtonsForLoginPanel();
		
		loginMainPane = new GridPane();
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
		
		loginMainPane.add(welcomeLbl, 0, 0, 2, 1);
		loginMainPane.add(loginLbl, 0, 1);
		loginMainPane.add(unLbl, 0, 3);
		loginMainPane.add(unTxt, 1, 3);
		loginMainPane.add(passLbl, 0, 4);
		loginMainPane.add(passTxt, 1, 4);
		loginMainPane.add(loginPanelButtons.getPane(), 1, 6);
		
	}
	
	public Pane getPane() {
		return loginMainPane;
	}
	public static String getUsername() {
		return unTxt.getText();
	}
	public static String getPass() {
		return passTxt.getText();
	}
	public static void clearFields(){ 
		unTxt.clear();
		passTxt.clear();
	}
}
