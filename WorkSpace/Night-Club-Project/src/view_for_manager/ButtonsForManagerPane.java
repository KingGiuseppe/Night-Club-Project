package view_for_manager;

import bags.CreateEventBag;
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
import view_for_login.Main_Window;

public class ButtonsForManagerPane {

	private Button createEventBtn;
	private VBox buttonPane;
	private Button setNotificationEventBtn;
	private Label label;
	private Button removeEventBtn;

	public ButtonsForManagerPane() {
		PaneForCreateEvent1 ev = new PaneForCreateEvent1();
		PaneForRemoveEvent ev2 = new PaneForRemoveEvent();
		CreateEventBag evbag = new CreateEventBag();
		label = new Label("  Please select a\n   button below!");
		label.setAlignment(Pos.CENTER);
		label.setFont(Font.font(15));
		buttonPane = new VBox(20);
		buttonPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		createEventBtn = new Button("Create Event");
		createEventBtn.setPrefWidth(120);
		createEventBtn.setPrefHeight(70);
		createEventBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(PaneForCreateEvent1.getScene());
		});
		removeEventBtn = new Button("Remove Event");
		removeEventBtn.setOnAction(event -> {
			if(Main_Window.getRemoveEventBtnListener() != null) {
				Main_Window.getRemoveEventBtnListener().removeEventBtnClicked();
			}
			ManagerPane.getStage().setScene(PaneForRemoveEvent.getScene());
		});

		setNotificationEventBtn = new Button("Send Notification");
		setNotificationEventBtn.setPrefWidth(120);
		setNotificationEventBtn.setPrefHeight(70);
		setNotificationEventBtn.setOnAction(event -> {

		});

		buttonPane.getChildren().addAll(label, createEventBtn, removeEventBtn, setNotificationEventBtn);

	}

	public Pane getPane() {
		return buttonPane;
	}
}
