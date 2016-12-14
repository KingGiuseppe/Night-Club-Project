package view_for_manager;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ButtonsForManagerPane {
	
	private Button createEventBtn;
	private HBox buttonPane;
	private Button setNotificationEventBtn;

	public ButtonsForManagerPane() {
		PaneForCreateEvent1 ev = new PaneForCreateEvent1();
		buttonPane = new HBox(20);
		
		createEventBtn = new Button("Create Event");
		createEventBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(PaneForCreateEvent1.getScene());
		});
		
		setNotificationEventBtn = new Button("Send Notification");
		setNotificationEventBtn.setOnAction(event -> {
			
		});
		
		buttonPane.getChildren().addAll(createEventBtn, setNotificationEventBtn);
		
	}
	
	public Pane getPane() {
		return buttonPane;
	}
}
