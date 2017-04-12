package view.owner_account.buttons;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.owner_account.stage.OwnerStage;
import view_for_owner.SchedulingPane;

public class OwnerAccountPaneSchedulingButton {

	private static Button schedulingBtn;

	public OwnerAccountPaneSchedulingButton() {
		schedulingBtn = new Button("Scheduling");
		schedulingBtn.setFont(new Font("Arial Rounded MT Bold", 13));
		schedulingBtn.setPrefWidth(200);
		schedulingBtn.setPrefHeight(50);
		schedulingBtn.setOnAction(event -> {
			new SchedulingPane();

			// if (ListenerMethods.getButtonListener2() != null) {
			// ListenerMethods.getButtonListener2().btnClicked(1);

			// }
			OwnerStage.getStage().setScene(SchedulingPane.getScene());
		});
	}

	public static Button getSchedulingButton() {
		return schedulingBtn;
	}

}
