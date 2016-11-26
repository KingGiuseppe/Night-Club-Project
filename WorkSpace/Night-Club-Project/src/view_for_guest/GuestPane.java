package view_for_guest;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model_for_newuser.NewUser;

public class GuestPane {

	private static BorderPane mainPane;
	private static Scene scene;
	private static NewUser user;
	private static Stage stage;
	private ButtonTabForGuestPane buttonPane;
	private EventsPanel eventsPanel;

	public GuestPane() {
		stage = new Stage();
		
		mainPane = new BorderPane();
		buttonPane = new ButtonTabForGuestPane();
		eventsPanel = new EventsPanel();
		
		//mainPane.setTop(buttonPane.getPane());
		mainPane.setCenter(eventsPanel.getPane());
		
		
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
