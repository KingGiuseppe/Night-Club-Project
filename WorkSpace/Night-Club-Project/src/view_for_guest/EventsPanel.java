package view_for_guest;

import bags.CreateEventBag;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import view_for_manager.ManagerPane;
import view_for_owner.OwnerPane;

public class EventsPanel {

	private Label topLabel;
	private VBox eventPane;
	private BorderPane borderPane;
	private HBox labelPane;
	private Button backBtn;
	private int num;

	public EventsPanel() {
		borderPane = new BorderPane();
		CreateEventBag bag = new CreateEventBag();
		eventPane = new VBox();
		eventPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
						CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		eventPane.setAlignment(Pos.CENTER);
		for(int i = 0; i < bag.getNElems(); i++){
			eventPane.getChildren().add(bag.getList().get(i).getPane());
		}
		borderPane.setCenter(eventPane);
		
		topLabel = new Label("Events and Dates");
		topLabel.setFont(Font.font(30));
		backBtn = new Button("Back");
		backBtn.setOnAction(event -> {
			if(num == 2) {
				OwnerPane.getStage().setScene(OwnerPane.getScene());
			} else if(num == 1) {
				ManagerPane.getStage().setScene(ManagerPane.getScene());
			} else {
				GuestPane.getStage().setScene(GuestPane.getScene());
			}
		});
		labelPane = new HBox();
		labelPane.getChildren().add(topLabel);
		labelPane.setAlignment(Pos.CENTER);
		
		borderPane.setTop(labelPane);
		
		borderPane.setLeft(new Label("Pictures"));
		borderPane.setRight(new Label("Friends Section"));
		borderPane.setBottom(backBtn);
		backBtn.setAlignment(Pos.BOTTOM_RIGHT);
				
	}
	public Pane getPane() {
		return borderPane;
	}
	public void setEventPane(GridPane grid) {
		eventPane.getChildren().add(grid);
	}
	public void setAccount(int num) {
		this.num = num;
	}
}
