package view.owner_account.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.owner_account.stage.OwnerStage;
import view_for_owner.CreateManagerAccount1;

public class OwnerAccountPaneCreateManagerAccountButton {

	private static Button createManagerAccountButton;

	public OwnerAccountPaneCreateManagerAccountButton() {
		createManagerAccountButton = new Button("New Manager Account");
		createManagerAccountButton.setFont(new Font("Arial Rounded MT Bold", 13));
		createManagerAccountButton.setPrefWidth(200);
		createManagerAccountButton.setPrefHeight(50);
		createManagerAccountButton.setOnAction(event -> {
			new CreateManagerAccount1();
			OwnerStage.getStage().setScene(CreateManagerAccount1.getScene());
		});
		
	}
	
	public static Button getCreateManagerAccountButton() {
		return createManagerAccountButton;
	}

}
