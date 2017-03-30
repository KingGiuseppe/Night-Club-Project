package buttons_for_manager_panel;

import java.util.EventObject;

import controller.GetEventsController;
import controller.RemoveEvBtnClickedController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import view_for_guest.EventsPanel;
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
		label = new Label("    Select a button\n	   below!");
		label.setTextFill(Color.web("#ffffff"));
		label.setAlignment(Pos.CENTER);
		label.setFont(new Font("Arial Rounded MT Bold", 12));
		buttonPane = new VBox(20);
		buttonPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		createEventBtn = new Button("Create Event");
		createEventBtn.setFont(new Font("Arial Rounded MT Bold", 12));
		createEventBtn.setPrefWidth(120);
		createEventBtn.setPrefHeight(70);
		createEventBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(PaneForCreateEvent1.getScene());
		});
		removeEventBtn = new Button("Remove Event");
		removeEventBtn.setFont(new Font("Arial Rounded MT Bold", 12));
		removeEventBtn.setPrefWidth(120);
		removeEventBtn.setPrefHeight(70);

		removeEventBtn.setOnAction(event -> {
			RemoveEvBtnClickedController removeEvBtn = new RemoveEvBtnClickedController(new ButtonEventListenerMethods());

			if (ButtonEventListenerMethods.getButtonListener() != null) {
				ButtonEventListenerMethods.getButtonListener().btnClicked(new EventObject(2));
			}
			ManagerPane.getStage().setScene(PaneForRemoveEvent.getScene());
		});

		eventsBtn = new Button("Events");
		eventsBtn.setFont(new Font("Arial Rounded MT Bold", 12));
		eventsBtn.setPrefWidth(120);
		eventsBtn.setPrefHeight(70);
		eventsBtn.setOnAction(event -> {
			GetEventsController eventsCont = new GetEventsController(new ButtonEventListenerMethods());
			if(ButtonEventListenerMethods.getButtonListener() != null) {
				ButtonEventListenerMethods.getButtonListener().btnClicked(new EventObject(2));
			}

		});
		setNotificationEventBtn = new Button("Send Notification");
		setNotificationEventBtn.setFont(new Font("Arial Rounded MT Bold", 12));
		setNotificationEventBtn.setPrefWidth(120);
		setNotificationEventBtn.setPrefHeight(70);
		setNotificationEventBtn.setOnAction(event -> {

			ManagerPane.getStage().setScene(new PaneForGuestNotification(2).getScene());
		});

		buttonPane.getChildren().addAll(label, createEventBtn, removeEventBtn, eventsBtn, setNotificationEventBtn);

		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqfa9vQe4zD00N-ajy-RADGBTA15bthYnwKl3U9M7H5E7OWlVo",
						550, 450, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		buttonPane.setBackground(new Background(myBI));

	}

	public Pane getPane() {
		return buttonPane;
	}
}
