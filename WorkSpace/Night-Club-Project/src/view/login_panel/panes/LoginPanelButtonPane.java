package view.login_panel.panes;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import view.login_panel.buttons.CancelButtonForLoginPanel;
import view.login_panel.buttons.ForgotPasswordButtonForLoginPanel;
import view.login_panel.buttons.LoginButtonForLoginPanel;
import view.login_panel.buttons.NewUserButtonForLoginPanel;

public class LoginPanelButtonPane {

	private static VBox loginButtonMainPane;
	private HBox loginButtonPane2;
	private HBox loginButtonPane1;
	private LoginButtonForLoginPanel loginButton;
	private CancelButtonForLoginPanel cancelButton;
	private ForgotPasswordButtonForLoginPanel forgotPasswordButton;
	private NewUserButtonForLoginPanel newUserButton;

	public LoginPanelButtonPane() {
		loginButtonMainPane = new VBox(4);
		loginButtonMainPane.setAlignment(Pos.CENTER);
		loginButtonPane1 = new HBox(1);
		loginButtonPane1.setAlignment(Pos.CENTER);
		loginButtonPane2 = new HBox(1);
		loginButtonPane2.setAlignment(Pos.CENTER);

		loginButton = new LoginButtonForLoginPanel();
		cancelButton = new CancelButtonForLoginPanel();
		forgotPasswordButton = new ForgotPasswordButtonForLoginPanel();
		newUserButton = new NewUserButtonForLoginPanel();

		loginButtonPane1.getChildren().addAll(loginButton.getLoginButton(), cancelButton.getCancelButton());
		loginButtonPane2.getChildren().addAll(forgotPasswordButton.getForgotPasswordButton(),
				newUserButton.getNewUserButton());

		loginButtonMainPane.getChildren().addAll(loginButtonPane1, loginButtonPane2);
	}

	public static VBox getPane() {
		return loginButtonMainPane;
	}

}
