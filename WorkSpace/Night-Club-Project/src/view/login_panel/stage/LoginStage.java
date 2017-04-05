package view.login_panel.stage;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import view.login_panel.scenes.LoginPanel;

public class LoginStage {

	private static Stage stage;

	public LoginStage(Stage stage) {
		LoginStage.stage = stage;
		new LoginPanel();

		stage.initStyle(StageStyle.UNDECORATED);
		stage.setScene(LoginPanel.getScene());
		stage.show();
	}

	public static Stage getStage() {
		return stage;
	}

	public static void closeStage() {
		stage.close();
	}

}