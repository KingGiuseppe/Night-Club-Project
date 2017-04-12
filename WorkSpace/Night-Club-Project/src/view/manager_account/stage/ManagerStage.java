package view.manager_account.stage;

import javafx.stage.Stage;
import view.manager_account.scenes.ManagerAccountPanel;

public class ManagerStage {

	private static Stage stage;

	public ManagerStage() {
		new ManagerAccountPanel();
		stage = new Stage();
		stage.setScene(ManagerAccountPanel.getScene());
		stage.setTitle("Manager");
	}
	public static void showStage() {
		stage.show();
	}

	public static void closeStage() {
		stage.close();
	}

	public static Stage getStage() {
		return stage;
	}

}
