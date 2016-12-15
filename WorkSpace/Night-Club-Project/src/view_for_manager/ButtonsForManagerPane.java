package view_for_manager;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ButtonsForManagerPane {
	
	private Button createEventBtn;
	private VBox buttonPane;
	private Button setNotificationEventBtn;
	private Label label;

	public ButtonsForManagerPane() {
		PaneForCreateEvent1 ev = new PaneForCreateEvent1();
		label = new Label("  Please select a\n   button below!");
		label.setAlignment(Pos.CENTER);
		label.setFont(Font.font(15));
		buttonPane = new VBox(20);
		buttonPane.setBorder(new Border(new BorderStroke(Color.BLACK, 
	            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		createEventBtn = new Button("Create Event");
		createEventBtn.setPrefWidth(120);
		createEventBtn.setPrefHeight(70);
		createEventBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(PaneForCreateEvent1.getScene());
		});
		
		setNotificationEventBtn = new Button("Send Notification");
		setNotificationEventBtn.setPrefWidth(120);
		setNotificationEventBtn.setPrefHeight(70);
		setNotificationEventBtn.setOnAction(event -> {
			
		});
		
		buttonPane.getChildren().addAll(label, createEventBtn, setNotificationEventBtn);
		
	}
	
	public Pane getPane() {
		return buttonPane;
	}
}
