package view_for_guest;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EventsPanel {

	private Label topLabel;
	private VBox mainPane;
	private BorderPane borderPane;

	public EventsPanel() {
		borderPane = new BorderPane();

		topLabel = new Label("Events and Dates");
		topLabel.setFont(Font.font(30));
		HBox labelPane = new HBox();
		labelPane.getChildren().add(topLabel);
		labelPane.setAlignment(Pos.CENTER);
		
		borderPane.setTop(labelPane);
		borderPane.setLeft(new Label("Pictures"));
		borderPane.setRight(new Label("RIght holder"));
		mainPane = new VBox();
		mainPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
						CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		borderPane.setCenter(mainPane);
		
	}
	public Pane getPane() {
		return borderPane;
	}
}
