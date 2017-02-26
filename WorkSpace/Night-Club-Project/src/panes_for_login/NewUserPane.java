package panes_for_login;

import buttons_for_login_panel.ButtonsForNewUserPanel;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_newuser.Person;

public class NewUserPane {

	private static GridPane newUserPane;
	private Label welcomeLbl;
	private Label firstNameLbl;
	private Label lastNameLbl;
	private Label genderLbl;
	private Label zipLbl;
	private static Stage stage;
	private static TextField firstNameTxt;
	private static TextField lastNameTxt;
	private static TextField zipTxt;

	private RadioButton maleRad;
	private RadioButton femaleRad;
	private static ToggleGroup genderGroup;
	private HBox radPane;
	private Label wayLbl;
	private static Person person;
	private static Scene scene;

	public NewUserPane() {
		stage = new Stage();
		newUserPane = new GridPane();
		newUserPane.setAlignment(Pos.CENTER);
		newUserPane.setHgap(10);
		newUserPane.setVgap(10);
		newUserPane.setPadding(new Insets(25, 25, 25, 25));

		welcomeLbl = new Label("Create Your Night Club Account!");
		welcomeLbl.setFont(new Font("Arial Rounded MT Bold", 30));
		wayLbl = new Label("Who are you?");
		wayLbl.setFont(new Font("Arial Rounded MT Bold", 25));

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
		maleRad.setSelected(true);
		maleRad.setFont(new Font("Arial Rounded MT Bold", 20));
		femaleRad = new RadioButton("Female");
		femaleRad.setFont(new Font("Arial Rounded MT Bold", 20));
		setGenderGroup(new ToggleGroup());
		maleRad.setToggleGroup(getGenderGroup());
		femaleRad.setToggleGroup(getGenderGroup());
		radPane.getChildren().addAll(maleRad, femaleRad);
		radPane.setAlignment(Pos.CENTER);

		newUserPane.add(welcomeLbl, 0, 0, 2, 1);
		newUserPane.add(wayLbl, 0, 1, 2, 1);

		newUserPane.add(getFirstNameTxt(), 1, 3);

		newUserPane.add(getLastNameTxt(), 1, 4);

		newUserPane.add(radPane, 1, 5);

		newUserPane.add(getZipTxt(), 1, 6);

		newUserPane.add(new ButtonsForNewUserPanel().getPane(), 1, 8, 2, 1);
		Platform.runLater(() -> welcomeLbl.requestFocus());
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://wallpapercave.com/wp/BhcQpIw.jpg", 360,
						640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		newUserPane.setBackground(new Background(myBI));
		scene = new Scene(newUserPane, 550, 370);
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

	public static void closeStage() {
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

	public static void clearNodes() {
		newUserPane.getChildren().clear();
	}

	public static Person getPerson() {
		return person;
	}

	public static TextField getFirstNameTxt() {
		return firstNameTxt;
	}

	public static void setFirstNameTxt(TextField firstNameTxt) {
		NewUserPane.firstNameTxt = firstNameTxt;
	}

	public static TextField getLastNameTxt() {
		return lastNameTxt;
	}

	public static void setLastNameTxt(TextField lastNameTxt) {
		NewUserPane.lastNameTxt = lastNameTxt;
	}

	public static TextField getZipTxt() {
		return zipTxt;
	}

	public static void setZipTxt(TextField zipTxt) {
		NewUserPane.zipTxt = zipTxt;
	}

	public static ToggleGroup getGenderGroup() {
		return genderGroup;
	}

	public static void setGenderGroup(ToggleGroup genderGroup) {
		NewUserPane.genderGroup = genderGroup;
	}

}
