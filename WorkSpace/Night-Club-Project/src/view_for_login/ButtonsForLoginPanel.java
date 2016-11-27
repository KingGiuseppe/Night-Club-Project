package view_for_login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model_for_login.LoginObject;
import model_for_newuser.NewUser;
import view_for_guest.GuestPane;
import view_for_manager.ManagerPane;

public class ButtonsForLoginPanel {
	private Button loginBtn;
	private Button newUserBtn;
	private Button forgotPassBtn;
	private HBox pane;
	private static NewUser user;
	private static boolean isValid;

	public ButtonsForLoginPanel() {
		loginBtn = new Button("Login");

		NewUserPane nup = new NewUserPane();

		loginBtn.setOnAction(event -> {
			String username = Login_Pane.getUsername();
			String pass = Login_Pane.getPass();

			LoginObject loginEvent = new LoginObject(this, username, pass);

			if (Main_Window.getLoginListener() != null) {
				Main_Window.getLoginListener().loginBtnClicked(loginEvent);
			}
			if (isLoginValid() == true) {
				AlertForLogin badLogin = new AlertForLogin(true, user.getFirstName());
				if (user.getType() == 0) {
					GuestPane.showStage();
					Main_Window.closeStage();
				} else if (user.getType() == 1) {
					ManagerPane.showStage();
					Main_Window.closeStage();
				} else if (user.getType() == 2) {
					// OwnerPane.showStage();
					Main_Window.closeStage();
				}
			} else if (isLoginValid() == false) {
				AlertForLogin badLogin = new AlertForLogin(false, user.getFirstName());
			}

		});

		newUserBtn = new Button("New User?");

		newUserBtn.setOnAction(event -> {
			nup.showStage();
		});

		forgotPassBtn = new Button("Forgot Password?");
		forgotPassBtn.setOnAction(event -> {
			System.out.println("Hello Forgot Password");
		});

		pane = new HBox(20);
		pane.getChildren().addAll(newUserBtn, forgotPassBtn, loginBtn);

	}

	public Pane getPane() {
		return pane;
	}

	public Button getLoginBtn() {
		return loginBtn;
	}

	public Button getNewUserBtn() {
		return newUserBtn;
	}

	public Button getForgotPassBtn() {
		return forgotPassBtn;
	}

	public boolean isLoginValid() {
		return isValid;
	}

	public static void setIsLoginValid(boolean valid) {
		isValid = valid;
	}

	public static void setUser(NewUser newUser) {
		user = newUser;
	}

}
