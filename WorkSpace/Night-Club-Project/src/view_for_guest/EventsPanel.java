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
	private VBox eventPane;
	private BorderPane borderPane;
	private HBox labelPane;

	public EventsPanel() {
		borderPane = new BorderPane();

		eventPane = new VBox();
		eventPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
						CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		borderPane.setCenter(eventPane);
		
		topLabel = new Label("Events and Dates");
		topLabel.setFont(Font.font(30));
		
		labelPane = new HBox();
		labelPane.getChildren().add(topLabel);
		labelPane.setAlignment(Pos.CENTER);
		
		borderPane.setTop(labelPane);
		
		borderPane.setLeft(new Label("Pictures"));
		borderPane.setRight(new Label("Friends Section"));
		
				
	}
	public Pane getPane() {
		return borderPane;
	}
}
