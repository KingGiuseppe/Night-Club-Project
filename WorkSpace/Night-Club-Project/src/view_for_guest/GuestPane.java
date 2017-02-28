package view_for_guest;

import buttons_for_login_panel.MenuBarForLogout;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
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
		mainPane.setPadding(new Insets(0, 25, 25, 25));
		//mainPane.setLeft(new Label("    "));
		//mainPane.setRight(new Label("    "));
		eventsPanel.setAccount(0);
		mainPane.setTop(logout.getMenu(0));

		scene = new Scene(mainPane, 900, 500);
		stage.setScene(scene);
		stage.setTitle("Guest View");

		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRhFa7NxzjkPrwSjM6l4NgZspZQCVhLXDeHX0txs96uWUZOehZiSw",
						360, 640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		mainPane.setBackground(new Background(myBI));
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
