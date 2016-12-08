package view_for_owner;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model_for_newuser.NewUser;

public class OwnerPane {

	private static Stage stage;
	private static NewUser user;
	private BorderPane mainPane;
	private MenuBarForOwnerPane menuBar;
	private WelcomePaneForOwnerPane welcomePane;
	private static Scene scene;

	public OwnerPane() {
		stage = new Stage();
		menuBar = new MenuBarForOwnerPane();
		mainPane = new BorderPane();
		welcomePane = new WelcomePaneForOwnerPane();
		
		
		mainPane.setLeft(menuBar.getPane());
		mainPane.setCenter(new Label("LOOK"));
		scene = new Scene(mainPane, 900, 500);
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
