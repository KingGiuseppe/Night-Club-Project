package view_for_owner;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class WelcomePaneForOwnerPane {

	private Label welcomeLbl;
	private HBox mainPane;
	private Label bodyLbl;

	public WelcomePaneForOwnerPane() {
		mainPane = new HBox();

		welcomeLbl = new Label("Welcome " + OwnerPane.getUser().getFirstName() + "!");
		bodyLbl = new Label("What would you like to do today?");
		
		mainPane.getChildren().addAll(welcomeLbl, bodyLbl);
	}
	
	public Pane getPane() {
		return mainPane;
	}
	
}
