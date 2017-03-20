package view_for_manager;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
		ButtonsForManagerPane buttons = new ButtonsForManagerPane();
		stage = new Stage();
		mainPane = new BorderPane();
		mainPane.setLeft(buttons.getPane());
		MenuBarForLogout logout = new MenuBarForLogout();
		mainPane.setTop(logout.getMenu(1));
		label1 = new Label("Welcome!");
		label1.setFont(new Font("Arial Rounded MT Bold", 35));
		label1.setTextFill(Color.web("#ffffff"));
		labelPane = new VBox(20);
		label1.setAlignment(Pos.CENTER);
		labelPane.getChildren().addAll(label1);
		labelPane.setAlignment(Pos.TOP_CENTER);
		mainPane.setCenter(labelPane);
		scene = new Scene(mainPane, 560, 400);
		stage.setScene(scene);
		stage.setTitle("Manager View");
		stage.setResizable(false);
		
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://powellong.com/data/wallpapers/21/WDF_692914.jpg", 550,
						450, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		mainPane.setBackground(new Background(myBI));
	}
	

	public static void setLabel(String message) {
		label3.setText(message);
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

	public static void setScene(Scene newScene) {
		scene = newScene;
	}

	public static Stage getStage() {
		return stage;
	}


}
