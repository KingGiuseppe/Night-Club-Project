package view.login_panel.buttons;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view.login_panel.forgot_password.scenes.ForgotPasswordPanel1;
import view.login_panel.forgot_password.scenes.ForgotPasswordPanel2;
import view.login_panel.forgot_password.stage.ForgotPasswordStage;

public class ForgotPasswordButtonForLoginPanel {

	private Button forgotPassButton;

	public ForgotPasswordButtonForLoginPanel() {
		new ForgotPasswordStage();
		new ForgotPasswordPanel1();
		new ForgotPasswordPanel2();
		
		forgotPassButton = new Button("Forgot Password?");
		forgotPassButton.setStyle("-fx-background-color: transparent;");
		forgotPassButton.setFont(new Font("Arial Rounded MT Bold", 12));
		forgotPassButton.setAlignment(Pos.TOP_RIGHT);
		forgotPassButton.setOnAction(event -> {
			ForgotPasswordStage.showStage();
			ForgotPasswordStage.getStage().setScene(ForgotPasswordPanel1.getScene());
		});
	}

	public Button getForgotPasswordButton() {
		return forgotPassButton;
	}

}
