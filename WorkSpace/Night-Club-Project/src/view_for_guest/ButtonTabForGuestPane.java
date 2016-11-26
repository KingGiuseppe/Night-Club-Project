package view_for_guest;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ButtonTabForGuestPane {

	private static HBox pane;
	private Button eventsBtn;
	private Button friendsBtn;

	public ButtonTabForGuestPane() {
		pane = new HBox();
		
		eventsBtn = new Button("Events");
		friendsBtn = new Button("Friend Zone");
		
		pane.getChildren().addAll(eventsBtn, friendsBtn);
		pane.setAlignment(Pos.CENTER);
		
	}
	
	public Pane getPane() {
		return pane;
	}
	
}
