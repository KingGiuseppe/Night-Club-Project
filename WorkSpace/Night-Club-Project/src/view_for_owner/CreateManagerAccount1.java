package view_for_owner;

import buttons_for_owner_panel.ButtonsForCreateManAcc1;
import javafx.application.Platform;
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

		titleLbl = new Label("Please enter the information below to \ncreate a new manager account!");
		titleLbl.setFont(new Font("Arial Rounded MT Bold", 25));

		setFirstNameTxt(new TextField());
		getFirstNameTxt().setAlignment(Pos.CENTER);
		getFirstNameTxt().setPromptText("First Name");
		getFirstNameTxt().setFont(new Font("Arial Rounded MT Bold", 20));
		
		setLastNameTxt(new TextField());
		getLastNameTxt().setAlignment(Pos.CENTER);
		getLastNameTxt().setPromptText("Last Name");
		getLastNameTxt().setFont(new Font("Arial Rounded MT Bold", 20));
		
		setZipTxt(new TextField());
		getZipTxt().setAlignment(Pos.CENTER);
		getZipTxt().setFont(new Font("Arial Rounded MT Bold", 20));
		getZipTxt().setPromptText("Zip Code");
		
		radPane = new HBox(20);

		maleRad = new RadioButton("Male");
		maleRad.setFont(new Font("Arial Rounded MT Bold", 20));
		maleRad.setSelected(true);
		femaleRad = new RadioButton("Female");
		setGenderGroup(new ToggleGroup());
		maleRad.setToggleGroup(getGenderGroup());
		femaleRad.setToggleGroup(getGenderGroup());
		femaleRad.setFont(new Font("Arial Rounded MT Bold", 20));

		radPane.getChildren().addAll(maleRad, femaleRad);
		radPane.setAlignment(Pos.CENTER);

		Platform.runLater(() -> titleLbl.requestFocus());
		
		createManagerGridPane.add(titleLbl, 0, 0, 2, 1);

		createManagerGridPane.add(getFirstNameTxt(), 1, 3);

		createManagerGridPane.add(getLastNameTxt(), 1, 4);

		createManagerGridPane.add(radPane, 1, 5);

		createManagerGridPane.add(getZipTxt(), 1, 6);

		createManagerGridPane.add(new ButtonsForCreateManAcc1().getPane(), 1, 8, 2, 1);

		scene = new Scene(createManagerGridPane, 500, 400);

	}

	public static Pane getPane() {
		return createManagerGridPane;
	}

	public static Scene getScene() {
		return scene;
	}

	public static TextField getFirstNameTxt() {
		return firstNameTxt;
	}

	public static void setFirstNameTxt(TextField firstNameTxt) {
		CreateManagerAccount1.firstNameTxt = firstNameTxt;
	}

	public static TextField getLastNameTxt() {
		return lastNameTxt;
	}

	public static void setLastNameTxt(TextField lastNameTxt) {
		CreateManagerAccount1.lastNameTxt = lastNameTxt;
	}

	public static TextField getZipTxt() {
		return zipTxt;
	}

	public static void setZipTxt(TextField zipTxt) {
		CreateManagerAccount1.zipTxt = zipTxt;
	}

	public static ToggleGroup getGenderGroup() {
		return genderGroup;
	}

	public static void setGenderGroup(ToggleGroup genderGroup) {
		CreateManagerAccount1.genderGroup = genderGroup;
	}
}
