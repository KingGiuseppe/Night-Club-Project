package view_for_guest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import bags.CreateEventBag;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
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
import model_for_event_creation.CreateEventPaneObject;
import view_for_manager.ManagerPane;
import view_for_owner.OwnerPane;

public class EventsPanel {

	private Label topLabel;
	private VBox eventPane;
	private BorderPane borderPane;
	private HBox labelPane;
	private Button backBtn;
	private int num;
	private CreateEventBag bag;
	private Button rListBtn;
	private HBox btnPane;
	private ScrollPane sp;
	private CreateEventBag bag2;

	public EventsPanel() {
		borderPane = new BorderPane();
		
		eventPane = new VBox();
		eventPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
						CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		eventPane.setAlignment(Pos.CENTER);
		sp = new ScrollPane();
		sp.setContent(eventPane);
		borderPane.setCenter(sp);
		
		topLabel = new Label("Events and Dates");
		topLabel.setFont(Font.font(30));
		backBtn = new Button("Back");
		rListBtn = new Button("Refresh");
		rListBtn.setOnAction(event -> {
			
			bag = new CreateEventBag();
			bag.saveToFile();
			for(int i = 0; i < bag.getNElems(); i++){
				bag.getList().get(i).setPane();
				eventPane.getChildren().add(bag.getList().get(i).getPane());
			}
			bag.loadEvents();
			
			
		});
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
		btnPane = new HBox();
		borderPane.setTop(labelPane);
		btnPane.getChildren().addAll(backBtn, rListBtn);
		borderPane.setLeft(new Label("Pictures"));
		borderPane.setRight(new Label("Friends Section"));
		borderPane.setBottom(btnPane);
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
