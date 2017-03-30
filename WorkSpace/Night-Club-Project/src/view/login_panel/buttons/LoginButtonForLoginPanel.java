package view.login_panel.buttons;

import controller.LoginController;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import model_for_login.LoginObject;
import view.login_panel.panes.LoginPanelTextFieldPane;

public class LoginButtonForLoginPanel {

	private static Button loginBtn;

	public LoginButtonForLoginPanel() {
		loginBtn = new Button("Login");
		loginBtn.setMinSize(100, 30);
		loginBtn.setFont(new Font("Arial Rounded MT Bold", 20));

		loginBtn.setOnAction(event -> {
			new LoginController(new ButtonEventListenerMethods());
			String username = LoginPanelTextFieldPane.getUsername();
			String pass = LoginPanelTextFieldPane.getPass();

			LoginObject loginEvent = new LoginObject(this, username, pass);

			if (ButtonEventListenerMethods.getButtonListener() != null) {
				ButtonEventListenerMethods.getButtonListener().btnClicked(loginEvent);
			}

		});
	}

	public Button getLoginButton() {
		return loginBtn;
	}

}
