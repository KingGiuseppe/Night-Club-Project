package view.owner_account.buttons;

import java.util.EventObject;

import controller.GetEventsController;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;

public class OwnerAccountPaneViewEventsButton {

	private static Button eventButton;

	public OwnerAccountPaneViewEventsButton() {
		eventButton = new Button("Events");
		eventButton.setFont(new Font("Arial Rounded MT Bold", 13));
		eventButton.setPrefWidth(200);
		eventButton.setPrefHeight(50);
		eventButton.setOnAction(event -> {
			new GetEventsController(new ButtonEventListenerMethods());
			if (ButtonEventListenerMethods.getButtonListener() != null) {
				ButtonEventListenerMethods.getButtonListener().btnClicked(new EventObject(3));
			}
		});

	}

	public static Button getEventButton() {
		return eventButton;
	}

}
