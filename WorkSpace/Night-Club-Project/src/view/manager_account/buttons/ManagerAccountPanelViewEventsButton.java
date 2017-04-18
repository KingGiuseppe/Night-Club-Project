package view.manager_account.buttons;

import java.util.EventObject;

import controller.GetEventsController;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;

public class ManagerAccountPanelViewEventsButton {

	private static Button viewEventsButton;

	public ManagerAccountPanelViewEventsButton() {
		viewEventsButton = new Button("Events");
		viewEventsButton.setFont(new Font("Arial Rounded MT Bold", 12));
		viewEventsButton.setPrefWidth(120);
		viewEventsButton.setPrefHeight(70);
		viewEventsButton.setOnAction(event -> {
			new GetEventsController(new ButtonEventListenerMethods());
			if(ButtonEventListenerMethods.getButtonListener() != null) {
				ButtonEventListenerMethods.getButtonListener().btnClicked(new EventObject(2));
			}

		});
		
	}
	
	public static Button getViewEventsButton() {
		return viewEventsButton;
	}

}
