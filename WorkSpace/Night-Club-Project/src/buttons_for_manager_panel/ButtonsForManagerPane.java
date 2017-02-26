package buttons_for_manager_panel;

import Listeners.ListenerMethods;
import bags.CreateEventBag;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
import panes_for_login.Main_Window;
import view_for_guest.EventsPanel;
import view_for_manager.EmailLoginPane;
import view_for_manager.ManagerPane;
import view_for_manager.PaneForCreateEvent1;
import view_for_manager.PaneForGuestNotification;
import view_for_manager.PaneForRemoveEvent;

public class ButtonsForManagerPane {

	private Button createEventBtn;
	private VBox buttonPane;
	private Button setNotificationEventBtn;
	private Label label;
	private Button removeEventBtn;
	private Button eventsBtn;

	public ButtonsForManagerPane() {
		PaneForCreateEvent1 ev = new PaneForCreateEvent1();
		PaneForRemoveEvent ev2 = new PaneForRemoveEvent();
		CreateEventBag evbag = new CreateEventBag();
		PaneForGuestNotification notify = new PaneForGuestNotification();
		EmailLoginPane emlp = new EmailLoginPane();
		
		
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
		removeEventBtn.setPrefWidth(120);
		removeEventBtn.setPrefHeight(70);
		
		removeEventBtn.setOnAction(event -> {
			
			if(Main_Window.getListener().getButtonListener2() != null) {
				Main_Window.getListener().getButtonListener2().btnClicked(2);
			}
			ManagerPane.getStage().setScene(PaneForRemoveEvent.getScene());
		});

		eventsBtn = new Button("Events");
		eventsBtn.setPrefWidth(120);
		eventsBtn.setPrefHeight(70);
		eventsBtn.setOnAction(event -> {
			EventsPanel ep = new EventsPanel();
			ep.setAccount(1);
			ManagerPane.getStage().setScene(new Scene(ep.getPane(), 600, 600));
		});
		setNotificationEventBtn = new Button("Send Notification");
		setNotificationEventBtn.setPrefWidth(120);
		setNotificationEventBtn.setPrefHeight(70);
		setNotificationEventBtn.setOnAction(event -> {
			//EmailLoginPane.showStage();
			ManagerPane.getStage().setScene(PaneForGuestNotification.getScene());
		});

		buttonPane.getChildren().addAll(label, createEventBtn, removeEventBtn, eventsBtn, setNotificationEventBtn);

	}

	public Pane getPane() {
		return buttonPane;
	}
}
