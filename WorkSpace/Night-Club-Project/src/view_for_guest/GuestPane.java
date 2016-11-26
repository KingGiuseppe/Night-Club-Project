package view_for_guest;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model_for_newuser.NewUser;

public class GuestPane {

	private static HBox mainPane;
	private static Scene scene;
	private static NewUser user;
	private static Stage stage;
	private ButtonTabForGuestPane buttonPane;

	public GuestPane() {
		stage = new Stage();
		mainPane = new HBox();
		buttonPane = new ButtonTabForGuestPane();
		
		mainPane.getChildren().add(buttonPane.getPane());
		scene = new Scene(mainPane, 900, 500);	
		stage.setScene(scene);
		stage.setTitle("Guest View");
	}
	public static void showStage() {
		stage.show();
	}
	
	public static Pane getPane() {
		return mainPane;
	}
	
	public static void setUser(NewUser theUser) {
		user = theUser;
	}
	
	public static Scene getScene() {
		return scene;
	}
}
