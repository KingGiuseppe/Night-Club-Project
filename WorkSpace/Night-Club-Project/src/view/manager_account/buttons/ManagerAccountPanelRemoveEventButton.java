package view.manager_account.buttons;

import java.util.EventObject;

import controller.RemoveEvBtnClickedController;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import view.manager_account.stage.ManagerStage;
import view_for_manager.PaneForRemoveEvent;

public class ManagerAccountPanelRemoveEventButton {

	private Button removeEventButton;

	public ManagerAccountPanelRemoveEventButton() {
		removeEventButton = new Button("Remove Event");
		removeEventButton.setFont(new Font("Arial Rounded MT Bold", 12));
		removeEventButton.setPrefWidth(120);
		removeEventButton.setPrefHeight(70);

		removeEventButton.setOnAction(event -> {
			new RemoveEvBtnClickedController(new ButtonEventListenerMethods());

			if (ButtonEventListenerMethods.getButtonListener() != null) {
				ButtonEventListenerMethods.getButtonListener().btnClicked(new EventObject(2));
			}
			ManagerStage.getStage().setScene(PaneForRemoveEvent.getScene());
		});
		
	}
	public Button getRemoveEventButton() {
		return removeEventButton;
	}

}
