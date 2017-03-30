package view_for_login;

import alerts.AlertForNewUser;
import alerts.PasswordsDontMatchAlert;
import controller.ForgotPassController2;
import javafx.application.Platform;
import javafx.geometry.HPos;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import model_for_login.ForgotPassObject2;
import model_for_newuser.NewUser;

public class ForgotPasswordPane2 {
	private static GridPane mainPane2;
	private Label topLbl;
	private Label passLbl;
	private Label pass2Lbl;
	private TextField pass2Txt;
	private TextField passTxt;
	private Button okBtn;
	private static Scene scene;
	private static NewUser user;
	static Label top2Lbl;
	private static String email1;
	private static String un1;

	public ForgotPasswordPane2() {
		mainPane2 = new GridPane();
		mainPane2.setAlignment(Pos.CENTER);
		mainPane2.setHgap(10);
		mainPane2.setVgap(10);
		mainPane2.setPadding(new Insets(25, 25, 25, 25));
		top2Lbl = new Label("Please enter in a new password");
		top2Lbl.setFont(new Font("Arial Rounded MT Bold", 30));
		top2Lbl.setTextFill(Color.web("#ffffff"));
		topLbl = new Label("Password must contain 1 letter \nand one uppercase letter!");
		topLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		topLbl.setTextFill(Color.web("#ffffff"));

		passTxt = new TextField();
		passTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		passTxt.setPromptText("New Password");
		passTxt.setAlignment(Pos.CENTER);
		pass2Txt = new TextField();
		pass2Txt.setFont(new Font("Arial Rounded MT Bold", 20));
		pass2Txt.setPromptText("Retype New Password");
		pass2Txt.setAlignment(Pos.CENTER);
		okBtn = new Button("Ok");
		okBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		okBtn.setMinWidth(50);
		okBtn.setAlignment(Pos.CENTER_RIGHT);
		okBtn.setOnAction(event -> {
			if (passTxt.getText().equals("") || pass2Txt.getText().equals("")) {
				new AlertForNewUser();
			} else {
				if (passTxt.getText().equals(pass2Txt.getText())) {
					
					ForgotPassController2 pasCont2 = new ForgotPassController2(new ButtonEventListenerMethods());

					ForgotPassObject2 object = new ForgotPassObject2(this, un1, passTxt.getText());
					if (ButtonEventListenerMethods.getButtonListener() != null) {
						ButtonEventListenerMethods.getButtonListener().btnClicked(object);
					}
					passTxt.clear();
					pass2Txt.clear();
					ForgotPasswordPane.userNameTxt.clear();
					ForgotPasswordPane.emailTxt.clear();
				} else {
					PasswordsDontMatchAlert alert = new PasswordsDontMatchAlert();
				}
			}
		});

		mainPane2.add(top2Lbl, 0, 0, 1, 1);
		mainPane2.add(topLbl, 0, 1, 3, 1);
		mainPane2.add(passTxt, 0, 3);
		mainPane2.add(pass2Txt, 0, 4);
		mainPane2.add(okBtn, 0, 6);
		mainPane2.setHalignment(okBtn, HPos.RIGHT);

		Platform.runLater(() -> top2Lbl.requestFocus());
		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"https://s-media-cache-ak0.pinimg.com/originals/0f/fc/80/0ffc8072381c1cd334a9d51872cd9b9c.png",
						360, 640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		mainPane2.setBackground(new Background(myBI));

		scene = new Scene(mainPane2, 570, 350);

	}

	public static Pane getPane() {
		return mainPane2;
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setUser(String un, String email) {
		un1 = un;
		email1 = email;
	}

}
