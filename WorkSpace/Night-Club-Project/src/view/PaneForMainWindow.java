package view;

import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PaneForMainWindow {
	private VBox pane;
	private Login_Pane loginPane;

	public PaneForMainWindow() {
		// Test
		loginPane = new Login_Pane();
		
		pane = new VBox(20);
		
		pane.getChildren().add(loginPane.getPane());
	}
	
	public Pane getPane(){
		return pane;
	}
}
