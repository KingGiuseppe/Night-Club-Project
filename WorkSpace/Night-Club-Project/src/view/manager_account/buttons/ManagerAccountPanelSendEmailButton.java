package view.manager_account.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.manager_account.stage.ManagerStage;
import view_for_manager.PaneForGuestNotification;

public class ManagerAccountPanelSendEmailButton {

	private Button sendEmailButton;

	public ManagerAccountPanelSendEmailButton() {
		sendEmailButton = new Button("Send Notification");
		sendEmailButton.setFont(new Font("Arial Rounded MT Bold", 12));
		sendEmailButton.setPrefWidth(120);
		sendEmailButton.setPrefHeight(70);
		sendEmailButton.setOnAction(event -> {
			new PaneForGuestNotification(2);
			ManagerStage.getStage().setScene(PaneForGuestNotification.getScene());
		});
	}
	
	public Button getSendEmailButton() {
		return sendEmailButton;
	}

}
