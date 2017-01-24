package view_for_manager;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_event_creation.CreateEventPaneObject;
import model_for_newuser.NewUser;
import view_for_login.MenuBarForLogout;

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
		label2 = new Label("Message from the Boss:");
		label3 = new Label("");
		label3.setAlignment(Pos.CENTER_LEFT);
		labelPane = new VBox(20);
		label1.setFont(Font.font(35));
		label1.setAlignment(Pos.CENTER);
		label2.setFont(Font.font(25));
		label3.setFont(Font.font(15));
		labelPane.getChildren().addAll(label1, label2, label3);
		labelPane.setAlignment(Pos.TOP_CENTER);
		mainPane.setCenter(labelPane);

		scene = new Scene(mainPane, 500, 400);
		stage.setScene(scene);
		stage.setTitle("Manager View");
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

	public static void setMessage() {
		String e = null;
		try {
			FileInputStream fileIn = new FileInputStream("ManagerMessage.dat");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			while (true) {
				try {
					e = (String) in.readObject();
					label3.setText(e);
				} catch (EOFException f) {
					break;
				}
			}
			
			in.close();
			fileIn.close();

		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}

	}

}
