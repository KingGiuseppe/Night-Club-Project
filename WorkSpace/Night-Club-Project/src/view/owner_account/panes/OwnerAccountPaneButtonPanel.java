package view.owner_account.panes;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import view.owner_account.buttons.OwnerAccountPaneCreateManagerAccountButton;
import view.owner_account.buttons.OwnerAccountPaneRevenueButton;
import view.owner_account.buttons.OwnerAccountPaneSchedulingButton;
import view.owner_account.buttons.OwnerAccountPaneSendEmailButton;
import view.owner_account.buttons.OwnerAccountPaneViewEventsButton;

public class OwnerAccountPaneButtonPanel {

	private static HBox buttonPane;

	public OwnerAccountPaneButtonPanel() {
		buttonPane = new HBox(5);
		new OwnerAccountPaneViewEventsButton();
		new OwnerAccountPaneSendEmailButton();
		new OwnerAccountPaneSchedulingButton();
		new OwnerAccountPaneRevenueButton();
		new OwnerAccountPaneCreateManagerAccountButton();

		buttonPane.getChildren().addAll(OwnerAccountPaneViewEventsButton.getEventButton(),
				OwnerAccountPaneSchedulingButton.getSchedulingButton(),
				OwnerAccountPaneRevenueButton.getRevenueButton(),
				OwnerAccountPaneCreateManagerAccountButton.getCreateManagerAccountButton(),
				OwnerAccountPaneSendEmailButton.getSendEmailButton());
		buttonPane.setAlignment(Pos.TOP_CENTER);
	}
	
	public static HBox getButtonPane() {
		return buttonPane;
	}

}
