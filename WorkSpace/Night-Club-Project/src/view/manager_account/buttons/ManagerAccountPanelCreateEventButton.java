package view.manager_account.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.manager_account.stage.ManagerStage;
import view_for_manager.PaneForCreateEvent1;

public class ManagerAccountPanelCreateEventButton {

	private Button createEventButton;

	public ManagerAccountPanelCreateEventButton() {
		createEventButton = new Button("Create Event");
		createEventButton.setFont(new Font("Arial Rounded MT Bold", 12));
		createEventButton.setPrefWidth(120);
		createEventButton.setPrefHeight(70);
		createEventButton.setOnAction(event -> {
			ManagerStage.getStage().setScene(PaneForCreateEvent1.getScene());
		});

	}

	public Button getCreateEventButton() {
		return createEventButton;
	}

}
