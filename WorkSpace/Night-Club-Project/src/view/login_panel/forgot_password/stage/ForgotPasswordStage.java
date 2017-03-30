package view.login_panel.forgot_password.stage;

import javafx.stage.Stage;
import view.login_panel.forgot_password.scenes.ForgotPasswordPanel1;

public class ForgotPasswordStage {

	private static Stage stage;

	public ForgotPasswordStage() {
		stage = new Stage();
		stage.setScene(ForgotPasswordPanel1.getScene());
		stage.setTitle("New User");
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
