package panes_for_login;

import buttons_for_login_panel.ButtonsForLoginPanel;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Login_Pane {

	private VBox loginMainPane;
	private Label welcomeLbl;
	private Label loginLbl;
	private Label unLbl;
	private Label passLbl;
	private static TextField unTxt;
	private static TextField passTxt;
	private ButtonsForLoginPanel loginPanelButtons;
	private VBox txtFieldPane;
	private HBox btnPane;
	private Node root;
	private HBox btnPane2;

	public Login_Pane() {
		loginPanelButtons = new ButtonsForLoginPanel();

		loginMainPane = new VBox(30);
		txtFieldPane = new VBox(4);
		
		txtFieldPane.setAlignment(Pos.CENTER);
		btnPane2 = new HBox(1);
		btnPane2.setAlignment(Pos.CENTER);
		btnPane = new HBox(1);
		btnPane.setAlignment(Pos.CENTER);

		loginMainPane.setAlignment(Pos.CENTER);

		loginMainPane.setPadding(new Insets(25, 25, 25, 25));

		welcomeLbl = new Label("Welcome");
		welcomeLbl.setFont(Font.font(20));
		welcomeLbl.setFont(new Font("Arial Rounded MT Bold", 50));
		welcomeLbl.setTextFill(Color.web("#ffffff"));
		System.out.println(javafx.scene.text.Font.getFamilies());
		loginLbl = new Label("Login");
		loginLbl.setFont(new Font("Arial Rounded MT Bold", 30));
		loginLbl.setTextFill(Color.web("#ffffff"));
		unLbl = new Label("Username: ");
		passLbl = new Label("Password: ");
		unTxt = new TextField();
		unTxt.setMaxSize(200, 201);
		unTxt.setAlignment(Pos.CENTER);
		unTxt.setPromptText("User Name");
		unTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		passTxt = new TextField();
		passTxt.setMaxWidth(201);
		passTxt.setMaxHeight(200);
		passTxt.setPromptText("Password");
		passTxt.setAlignment(Pos.CENTER);
		passTxt.setFont(new Font("Arial Rounded MT Bold", 20));

		Platform.runLater(() -> loginLbl.requestFocus());

		BackgroundImage myBI = new BackgroundImage(
				new Image("http://2.bp.blogspot.com/-O7zb2a3_ECw/UNM_aS7jEFI/AAAAAAAAAKM/o4qt9uo_1HM/s1600/bg.png", 360,
						640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		loginMainPane.setBackground(new Background(myBI));
		btnPane2.getChildren().addAll(loginPanelButtons.getForgotPassBtn(), loginPanelButtons.getNewUserBtn());
		btnPane.getChildren().addAll(loginPanelButtons.getLoginBtn(), loginPanelButtons.getCancleBtn());
		txtFieldPane.getChildren().addAll(unTxt, passTxt, btnPane, btnPane2);

		loginMainPane.getChildren().addAll(welcomeLbl, loginLbl, txtFieldPane);

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

	public static void clearFields() {
		unTxt.clear();
		passTxt.clear();
	}
}
