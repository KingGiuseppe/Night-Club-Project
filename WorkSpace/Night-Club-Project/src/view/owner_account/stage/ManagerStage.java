package view.owner_account.stage;

import javafx.stage.Stage;
import view.login_panel.new_user.scenes.NewUserPanel1;

public class ManagerStage {

	private static Stage stage;

	public ManagerStage() {
		stage = new Stage();
		stage.setScene(NewUserPanel1.getScene());
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
