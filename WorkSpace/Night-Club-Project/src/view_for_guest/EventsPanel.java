package view_for_guest;

import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class EventsPanel {

	private Label topLabel;
	private VBox mainPane;

	public EventsPanel() {

		topLabel = new Label("Events and Dates");

		mainPane = new VBox();
		mainPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
						CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		

	}
}
