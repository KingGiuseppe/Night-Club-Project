package view_for_guest;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import model_for_newuser.NewUser;

public class GuestPane {

	private GridPane guestPane;
	private static Scene scene;
	private static NewUser user;

	public GuestPane() {
		guestPane = new GridPane();
		
		scene = new Scene(guestPane, 500, 500);	
	}
	
	public Pane getPane() {
		return guestPane;
	}
	
	public static void setUser(NewUser theUser) {
		user = theUser;
	}
	
	public static Scene getScene() {
		return scene;
	}
}
