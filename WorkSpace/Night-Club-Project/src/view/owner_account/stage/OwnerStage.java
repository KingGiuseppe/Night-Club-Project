package view.owner_account.stage;

import javafx.stage.Stage;
import view.owner_account.scenes.OwnerAccountPanel;

public class OwnerStage {

	private static Stage stage;

	public OwnerStage() {
		new OwnerAccountPanel();
		stage = new Stage();
		stage.setScene(OwnerAccountPanel.getScene());
		stage.setTitle("Manager");
	}

	public static void showStage() {
		stage.show();
	}

	public static Stage getStage() {
		return stage;
	}
	
}
