package view_for_owner;

import buttons_for_login_panel.MenuBarForLogout;
import buttons_for_owner_panel.MenuBarForOwnerPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_newuser.NewUser;
import view_for_manager.PaneForRemoveEvent;

public class OwnerPane {

	private static Stage stage;
	private static NewUser user;
	private BorderPane mainPane;
	private MenuBarForOwnerPane menuBar;
	private Label text1Lbl;
	private Label text2Lbl;
	private Label text3Lbl;
	private GridPane textPane;
	private static Scene scene;

	public OwnerPane() {
		stage = new Stage();

		MenuBarForLogout logout = new MenuBarForLogout();
		PaneForRemoveEvent removeEv = new PaneForRemoveEvent();

		menuBar = new MenuBarForOwnerPane();
		mainPane = new BorderPane();
		text1Lbl = new Label("Welcome!");
		text1Lbl.setFont(new Font("Arial Rounded MT Bold", 40));
		text1Lbl.setTextFill(Color.web("#ffffff"));
		text2Lbl = new Label("What would you like to do today?");
		text2Lbl.setTextFill(Color.web("#ffffff"));
		text2Lbl.setFont(new Font("Arial Rounded MT Bold", 25));
		text3Lbl = new Label("Please click a button below");
		text3Lbl.setTextFill(Color.web("#ffffff"));
		text3Lbl.setFont(new Font("Arial Rounded MT Bold", 25));
		textPane = new GridPane();
		textPane.add(text1Lbl, 0, 0);
		textPane.setAlignment(Pos.CENTER);
		textPane.setHalignment(text1Lbl, HPos.CENTER);
		textPane.add(text2Lbl, 0, 1);
		textPane.setHalignment(text2Lbl, HPos.CENTER);
		textPane.add(text3Lbl, 0, 6);
		textPane.setHalignment(text3Lbl, HPos.CENTER);
		mainPane.setCenter(textPane);
		mainPane.setTop(logout.getMenu(2));
		mainPane.setBottom(menuBar.getPane());
		scene = new Scene(mainPane, 750, 400);
		stage.setScene(scene);
		stage.setTitle("The King's View");
		
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://jdnowweb-s.cdn.ubi.com/prod/20170215_1121/web/img/home/backgrounds/bg-stars.jpg", 750,
						400, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		mainPane.setBackground(new Background(myBI));
	}

	public static void showStage() {
		stage.show();
	}

	public static void setUser(NewUser newUser) {
		user = newUser;
	}

	public static Scene getScene() {
		return scene;
	}

	public static NewUser getUser() {
		return user;
	}

	public static void setScene(Scene newScene) {
		scene = newScene;
	}

	public static Stage getStage() {
		return stage;
	}

}
