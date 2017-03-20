package view_for_login;

import alerts.AccountFoundAlert;
import alerts.InvalidInfoAlert;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_login.ForgotPassObject;
import model_for_newuser.NewUser;

public class ForgotPasswordPane {

	private static boolean isValid;
	private static NewUser user;
	private static Stage stage;
	private VBox mainPane;
	private Label topLbl;
	private Label topLbl2;
	private Label usernameLbl;
	private Label emailLbl;
	static TextField userNameTxt;
	static TextField emailTxt;
	private Button continueBtn;
	private Scene scene;
	
	private static String un;
	private static String email;

	public ForgotPasswordPane() {
		stage = new Stage();
		ForgotPasswordPane2 fpp2 = new ForgotPasswordPane2();
		mainPane = new VBox(10);
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setPadding(new Insets(25, 25, 25, 25));

		topLbl = new Label("Forgot password?");
		topLbl.setFont(new Font("Arial Rounded MT Bold", 35));
		topLbl.setTextFill(Color.web("#ffffff"));
		topLbl.setAlignment(Pos.CENTER_LEFT);
		topLbl2 = new Label("Please enter your username \nand email");
		topLbl2.setFont(new Font("Arial Rounded MT Bold", 25));
		topLbl2.setTextFill(Color.web("#ffffff"));

		userNameTxt = new TextField();
		userNameTxt.setPromptText("Username");
		userNameTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		userNameTxt.setAlignment(Pos.CENTER);
		emailTxt = new TextField();
		emailTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		emailTxt.setPromptText("Email Address");
		emailTxt.setAlignment(Pos.CENTER);

		continueBtn = new Button("Continue");
		continueBtn.setAlignment(Pos.CENTER_RIGHT);
		continueBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		continueBtn.setOnAction(event -> {
			String username = userNameTxt.getText();
			String email = emailTxt.getText();

			ForgotPassObject forgotPassEvent = new ForgotPassObject(this, username, email);

			if (Main_Window.getForgotPassListener() != null) {
				Main_Window.getForgotPassListener().forgotPassBtnClicked(forgotPassEvent);
			}
			if (isValid == true) {
				AccountFoundAlert alert2 = new AccountFoundAlert();
				stage.setScene(ForgotPasswordPane2.getScene());
			} else {
				InvalidInfoAlert alert = new InvalidInfoAlert();
			}

		});

		
		mainPane.getChildren().addAll(topLbl, topLbl2, userNameTxt, emailTxt, continueBtn);
		Platform.runLater(() -> topLbl.requestFocus());
		BackgroundImage myBI = new BackgroundImage(
				new Image("https://s-media-cache-ak0.pinimg.com/originals/0f/fc/80/0ffc8072381c1cd334a9d51872cd9b9c.png", 460,
						640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		mainPane.setBackground(new Background(myBI));

		scene = new Scene(mainPane, 450, 350);

	}

	public void showStage() {
		stage.show();
		stage.setScene(scene);
	}

	public static void setIsInfo(boolean valid) {
		isValid = valid;
	}

	public static void setUser(String un2, String email2) {
		un = un2;
		email = email2;
	}

	public static Stage getStage() {
		return stage;
	}

}
