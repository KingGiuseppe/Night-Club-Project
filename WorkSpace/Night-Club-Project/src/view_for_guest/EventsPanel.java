package view_for_guest;

import bags.CreateEventBag;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EventsPanel {

	private Label topLabel;
	private HBox eventPane;
	private BorderPane borderPane;
	private HBox labelPane;

	public EventsPanel() {
		borderPane = new BorderPane();
		CreateEventBag bag = new CreateEventBag();
		eventPane = new HBox();
		eventPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
						CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		eventPane.setAlignment(Pos.CENTER);
		eventPane.getChildren().add(bag.getList().get(0).getPane());
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
	public void setEventPane(GridPane grid) {
		eventPane.getChildren().add(grid);
	}
}
