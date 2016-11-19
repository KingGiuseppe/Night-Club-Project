package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NewUserPane {

	private GridPane newUserPane;
	private Label welcomeLbl;
	private Label firstNameLbl;
	private Label lastNameLbl;
	private Label genderLbl;
	private Label zipLbl;
	private Label emailLbl;
	private Label usernameLbl;
	private Label passwordLbl;
	private Button createBtn;
	private Button cancelBtn;
	private Stage stage;
	private Scene scene;
	private HBox btnPane;
	private TextField firstNameTxt;
	private TextField lastNameTxt;
	private TextField zipTxt;
	private TextField emailTxt;
	private TextField usernameTxt;
	private TextField passwordTxt;

	public NewUserPane() {
		stage = new Stage();
		btnPane = new HBox(10);
		newUserPane = new GridPane();
		newUserPane.setAlignment(Pos.CENTER);
		newUserPane.setHgap(10);
		newUserPane.setVgap(10);
		newUserPane.setPadding(new Insets(25, 25, 25, 25));
		
		welcomeLbl = new Label("Create Your Night Club Account!");
		welcomeLbl.setFont(Font.font(25));
		firstNameLbl = new Label("First name");
		lastNameLbl = new Label("Last name");
		genderLbl = new Label("Gender");
		zipLbl = new Label("Zip");
		emailLbl = new Label("Email address");
		usernameLbl = new Label("Username");
		passwordLbl = new Label("Password");
		
		firstNameTxt = new TextField();
		//firstNameTxt.positionCaret(10);
		lastNameTxt = new TextField();
		zipTxt = new TextField();
		emailTxt = new TextField();
		usernameTxt = new TextField();
		passwordTxt = new TextField();
		
		createBtn = new Button("Create");
		cancelBtn = new Button("Cancel");
		
		newUserPane.add(welcomeLbl, 0, 0, 2, 1);
		newUserPane.add(firstNameLbl, 0, 2);
		newUserPane.add(firstNameTxt, 1, 2);
		
		newUserPane.add(lastNameLbl, 0, 3);
		newUserPane.add(lastNameTxt, 1, 3);
		
		newUserPane.add(genderLbl, 0, 4);
		newUserPane.add(zipLbl, 0, 5);
		newUserPane.add(zipTxt, 1, 5);

		newUserPane.add(emailLbl, 0, 6);
		newUserPane.add(emailTxt, 1, 6);

		newUserPane.add(usernameLbl, 0, 7);
		newUserPane.add(usernameTxt, 1, 7);
		
		newUserPane.add(passwordLbl, 0, 8);
		newUserPane.add(passwordTxt, 1, 8);
		btnPane.getChildren().addAll(createBtn, cancelBtn);
		newUserPane.add(btnPane, 1, 10, 2, 1);
		
		stage.setScene(new Scene(newUserPane, 500, 500));
		stage.setTitle("New User");
		
		
	}
	
	public void getStage() {
		stage.showAndWait();
	}
}
