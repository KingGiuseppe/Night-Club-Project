package view.owner_account.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.owner_account.stage.OwnerStage;
import view_for_manager.PaneForGuestNotification;

public class OwnerAccountPaneSendEmailButton {

	private static Button sendEmailButton;

	public OwnerAccountPaneSendEmailButton() {
		sendEmailButton = new Button("Send Email");
		sendEmailButton.setFont(new Font("Arial Rounded MT Bold", 13));
		sendEmailButton.setPrefWidth(200);
		sendEmailButton.setPrefHeight(50);
		sendEmailButton.setOnAction(event -> {
			new PaneForGuestNotification(1);
			OwnerStage.getStage().setScene(PaneForGuestNotification.getScene());
		});
	}
	
	public static Button getSendEmailButton() {
		return sendEmailButton;
	}

}
