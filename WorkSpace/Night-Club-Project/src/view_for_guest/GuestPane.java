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

		scene = new Scene(mainPane, 650, 600);
		stage.setScene(scene);
		stage.setTitle("Guest View");
		stage.setResizable(false);

		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"http://urdu-mag.com/blog/wp-content/uploads/2012/11/large/abstract+backgrounds+15.jpg",
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
