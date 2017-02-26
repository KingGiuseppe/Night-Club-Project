package view_for_guest;

import buttons_for_login_panel.MenuBarForLogout;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model_for_newuser.NewUser;

public class GuestPane {

	private static BorderPane mainPane;
	private static Scene scene;
	private static NewUser user;
	private static Stage stage;
	private EventsPanel eventsPanel;

	public GuestPane() {
		stage = new Stage();
		MenuBarForLogout logout = new MenuBarForLogout();
		mainPane = new BorderPane();
		eventsPanel = new EventsPanel();
		mainPane.setCenter(eventsPanel.getPane());
		eventsPanel.setAccount(0);
		mainPane.setTop(logout.getMenu(0));

		scene = new Scene(mainPane, 900, 500);
		stage.setScene(scene);
		stage.setTitle("Guest View");
	}

	public static void showStage() {
		stage.show();
	}

	public static Stage getStage() {
		return stage;
	}

	public static void setUser(NewUser theUser) {
		user = theUser;
	}

	public static Scene getScene() {
		return scene;
	}
}
