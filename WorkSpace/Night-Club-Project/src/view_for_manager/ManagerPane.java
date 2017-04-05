package view_for_manager;

import buttons_for_login_panel.MenuBarForLogout;
import buttons_for_manager_panel.ButtonsForManagerPane;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_newuser.NewUser;

public class ManagerPane {

	private static Stage stage;
	private static NewUser user;
	private BorderPane mainPane;
	private static Label label3;
	private Label label2;
	private Label label1;
	private VBox labelPane;
	private static Scene scene;

	public ManagerPane() {
		new ButtonsForManagerPane();
		mainPane = new BorderPane();
		mainPane.setLeft(ButtonsForManagerPane.getPane());
		new MenuBarForLogout();
		mainPane.setTop(MenuBarForLogout.getMenu(1));
	
		mainPane.setCenter(labelPane);
		scene = new Scene(mainPane, 560, 400);
		
		BackgroundImage myBI = new BackgroundImage(
				new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqfa9vQe4zD00N-ajy-RADGBTA15bthYnwKl3U9M7H5E7OWlVo", 550,
						450, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		mainPane.setBackground(new Background(myBI));
	}

	public static void setUser(NewUser newUser) {
		user = newUser;
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setScene(Scene newScene) {
		scene = newScene;
	}

}
