package view.owner_account.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.owner_account.stage.OwnerStage;
import view_for_owner.PaneForRevenue;

public class OwnerAccountPaneRevenueButton {

	private static Button revenueButton;

	public OwnerAccountPaneRevenueButton() {
		revenueButton = new Button("Revenue");
		revenueButton.setFont(new Font("Arial Rounded MT Bold", 13));
		revenueButton.setPrefWidth(200);
		revenueButton.setPrefHeight(50);
		revenueButton.setOnAction(event -> {
			new PaneForRevenue();
			OwnerStage.getStage().setScene(PaneForRevenue.getScene());
		});
	}
	
	public static Button getRevenueButton() {
		return revenueButton;
	}

}
