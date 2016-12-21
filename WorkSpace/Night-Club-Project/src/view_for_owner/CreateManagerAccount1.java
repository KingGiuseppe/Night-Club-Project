package view_for_owner;

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
import view_for_login.ButtonsForNewUserPanel;

public class CreateManagerAccount1 {

	private static GridPane createManagerGridPane;
	private Label titleLbl;
	private Label firstNameLbl;
	private Label lastNameLbl;
	private Label genderLbl;
	private Label zipLbl;
	static TextField firstNameTxt;
	static TextField lastNameTxt;
	static TextField zipTxt;
	private HBox radPane;
	private RadioButton maleRad;
	private RadioButton femaleRad;
	static ToggleGroup genderGroup;
	private static Scene scene;

	public CreateManagerAccount1() {
		createManagerGridPane = new GridPane();
		createManagerGridPane.setAlignment(Pos.CENTER);
		createManagerGridPane.setHgap(10);
		createManagerGridPane.setVgap(10);
		createManagerGridPane.setPadding(new Insets(25, 25, 25, 25));
		
		titleLbl = new Label("Please enter the information below to \nCreate a new manager account!");
		titleLbl.setFont(Font.font(25));
		
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

		firstNameTxt = new TextField();
		firstNameTxt.setAlignment(Pos.CENTER);
		lastNameTxt = new TextField();
		lastNameTxt.setAlignment(Pos.CENTER);
		zipTxt = new TextField();
		zipTxt.setAlignment(Pos.CENTER);

		radPane = new HBox(20);

		maleRad = new RadioButton("Male");
		maleRad.setSelected(true);
		femaleRad = new RadioButton("Female");
		genderGroup = new ToggleGroup();
		maleRad.setToggleGroup(genderGroup);
		femaleRad.setToggleGroup(genderGroup);
		radPane.getChildren().addAll(maleRad, femaleRad);

		createManagerGridPane.add(titleLbl, 0, 0, 2, 1);

		createManagerGridPane.add(firstNameLbl, 0, 3);
		createManagerGridPane.add(firstNameTxt, 1, 3);

		createManagerGridPane.add(lastNameLbl, 0, 4);
		createManagerGridPane.add(lastNameTxt, 1, 4);

		createManagerGridPane.add(genderLbl, 0, 5);
		createManagerGridPane.add(radPane, 1, 5);

		createManagerGridPane.add(zipLbl, 0, 6);
		createManagerGridPane.add(zipTxt, 1, 6);

		createManagerGridPane.add(new ButtonsForCreateManAcc1().getPane(), 1, 8, 2, 1);

		scene = new Scene(createManagerGridPane, 500, 360);
		
	}
	
	public static Pane getPane() {
		return createManagerGridPane;
	}
	public static Scene getScene() {
		return scene;
	}
}
