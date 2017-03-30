package view.login_panel.buttons;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import view_for_login.ForgotPasswordPane;

public class ForgotPasswordButtonForLoginPanel {

	private Button forgotPassButton;

	public ForgotPasswordButtonForLoginPanel() {
		ForgotPasswordPane forgotPasswordPane = new ForgotPasswordPane();
		forgotPassButton = new Button("Forgot Password?");
		forgotPassButton.setStyle("-fx-background-color: transparent;");
		forgotPassButton.setFont(new Font("Arial Rounded MT Bold", 12));
		forgotPassButton.setAlignment(Pos.TOP_RIGHT);
		forgotPassButton.setOnAction(event -> {
			forgotPasswordPane.showStage();
		});
	}

	public Button getForgotPasswordButton() {
		return forgotPassButton;
	}

}
