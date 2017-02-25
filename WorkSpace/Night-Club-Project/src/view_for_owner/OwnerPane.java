package view_for_owner;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_newuser.NewUser;
import view_for_login.Main_Window;
import view_for_login.MenuBarForLogout;
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
	private MenuBar menuBarLogout;
	private Menu fileMenu;
	private MenuItem logoutMenuItem;
	private static Scene scene;

	public OwnerPane() {
		stage = new Stage();
		
		MenuBarForLogout logout = new MenuBarForLogout();
		PaneForRemoveEvent removeEv = new PaneForRemoveEvent();

		menuBar = new MenuBarForOwnerPane();
		mainPane = new BorderPane();
		text1Lbl = new Label("Welcome!");
		text1Lbl.setFont(Font.font(30));
		text2Lbl = new Label("What would you like to do today?");
		text2Lbl.setFont(Font.font(25));
		text3Lbl = new Label("Please click a button below");
		text3Lbl.setFont(Font.font(25));
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
