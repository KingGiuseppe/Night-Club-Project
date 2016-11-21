package view_for_login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NewUserPane {

	private static GridPane newUserPane;
	private Label welcomeLbl;
	private Label firstNameLbl;
	private Label lastNameLbl;
	private Label genderLbl;
	private Label zipLbl;
	private Label emailLbl;
	private Label usernameLbl;
	private Label passwordLbl;
	private static Stage stage;
	private TextField firstNameTxt;
	private TextField lastNameTxt;
	private TextField zipTxt;

	private RadioButton maleRad;
	private RadioButton femaleRad;
	private ToggleGroup genderGroup;
	private HBox radPane;
	private Label password2Lbl;
	private static Scene scene;
	private static Scene scene2;

	public NewUserPane() {
		stage = new Stage();
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
		
		firstNameTxt = new TextField();
		firstNameTxt.setAlignment(Pos.CENTER);
		lastNameTxt = new TextField();
		lastNameTxt.setAlignment(Pos.CENTER);
		zipTxt = new TextField();
		zipTxt.setAlignment(Pos.CENTER);
		
		radPane = new HBox(20);
		maleRad = new RadioButton("Male");
		femaleRad = new RadioButton("Female");
		genderGroup = new ToggleGroup();
		maleRad.setToggleGroup(genderGroup);
		femaleRad.setToggleGroup(genderGroup);
		radPane.getChildren().addAll(maleRad, femaleRad);
		
		newUserPane.add(welcomeLbl, 0, 0, 2, 1);
		
		newUserPane.add(firstNameLbl, 0, 2);
		newUserPane.add(firstNameTxt, 1, 2);
		
		newUserPane.add(lastNameLbl, 0, 3);
		newUserPane.add(lastNameTxt, 1, 3);
		
		newUserPane.add(genderLbl, 0, 4);
		newUserPane.add(radPane, 1, 4);
		
		newUserPane.add(zipLbl, 0, 5);
		newUserPane.add(zipTxt, 1, 5);

		newUserPane.add(new ButtonsForNewUserPanel().getPane(), 1, 11, 2, 1);
		
		scene =  new Scene(newUserPane, 500, 500);
		stage.setScene(scene);
		stage.setTitle("New User");
		
		
	}
	
	public void showStage() {
		stage.show();
		stage.setScene(scene);
	}
	
	public static Stage getStage() {
		return stage;
	}
	
	public static void exitStage() {
		stage.close();
	}
	public static Pane getPane() {
		return newUserPane;
	}
	public static Scene getScene() {
		return scene;
	}
	public static void setScene(Scene newScene) {
		scene = newScene;
	}
	public static void clearNodes(){
		newUserPane.getChildren().clear();
	}
	
}
