package view_for_guest;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class GuestPane {

	private GridPane guestPane;
	private Scene scene;

	public GuestPane() {
		guestPane = new GridPane();
		
		scene = new Scene(guestPane, 500, 500);	
	}
	
	public Pane getPane() {
		return guestPane;
	}
}
