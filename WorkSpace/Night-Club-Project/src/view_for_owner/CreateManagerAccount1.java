package view_for_owner;

import buttons_for_owner_panel.ButtonsForCreateManAcc1;
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
	private static TextField firstNameTxt;
	private static TextField lastNameTxt;
	private static TextField zipTxt;
	private HBox radPane;
	private RadioButton maleRad;
	private RadioButton femaleRad;
	private static ToggleGroup genderGroup;
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

		setFirstNameTxt(new TextField());
		getFirstNameTxt().setAlignment(Pos.CENTER);
		setLastNameTxt(new TextField());
		getLastNameTxt().setAlignment(Pos.CENTER);
		setZipTxt(new TextField());
		getZipTxt().setAlignment(Pos.CENTER);

		setFirstNameTxt(new TextField());
		getFirstNameTxt().setAlignment(Pos.CENTER);
		setLastNameTxt(new TextField());
		getLastNameTxt().setAlignment(Pos.CENTER);
		setZipTxt(new TextField());
		getZipTxt().setAlignment(Pos.CENTER);

		radPane = new HBox(20);

		maleRad = new RadioButton("Male");
		maleRad.setSelected(true);
		femaleRad = new RadioButton("Female");
		setGenderGroup(new ToggleGroup());
		maleRad.setToggleGroup(getGenderGroup());
		femaleRad.setToggleGroup(getGenderGroup());
		radPane.getChildren().addAll(maleRad, femaleRad);

		createManagerGridPane.add(titleLbl, 0, 0, 2, 1);

		createManagerGridPane.add(firstNameLbl, 0, 3);
		createManagerGridPane.add(getFirstNameTxt(), 1, 3);

		createManagerGridPane.add(lastNameLbl, 0, 4);
		createManagerGridPane.add(getLastNameTxt(), 1, 4);

		createManagerGridPane.add(genderLbl, 0, 5);
		createManagerGridPane.add(radPane, 1, 5);

		createManagerGridPane.add(zipLbl, 0, 6);
		createManagerGridPane.add(getZipTxt(), 1, 6);

		createManagerGridPane.add(new ButtonsForCreateManAcc1().getPane(), 1, 8, 2, 1);

		scene = new Scene(createManagerGridPane, 500, 360);

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
