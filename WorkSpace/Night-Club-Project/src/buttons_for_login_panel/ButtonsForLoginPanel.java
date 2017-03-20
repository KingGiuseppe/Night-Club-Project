package buttons_for_login_panel;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import model_for_login.LoginObject;
import model_for_newuser.NewUser;
import view_for_login.ForgotPasswordPane;
import view_for_login.Login_Pane;
import view_for_login.Main_Window;
import view_for_login.NewUserPane;

public class ButtonsForLoginPanel {
	private Button loginBtn;
	private Button newUserBtn;
	private Button forgotPassBtn;
	private HBox pane;
	private Button cancelBtn;
	private static boolean isValid;
	private static NewUser user;

	public ButtonsForLoginPanel() {
		loginBtn = new Button("Login");
		loginBtn.setMinSize(100, 30);
		loginBtn.setFont(new Font("Arial Rounded MT Bold", 20));

		NewUserPane nup = new NewUserPane();
		ForgotPasswordPane fpp = new ForgotPasswordPane();

		loginBtn.setOnAction(event -> {
			String username = Login_Pane.getUsername();
			String pass = Login_Pane.getPass();

			LoginObject loginEvent = new LoginObject(this, username, pass);

			if (Main_Window.getButtonListener() != null) {
				Main_Window.getButtonListener().btnClicked(loginEvent);
			}

		});

		newUserBtn = new Button("New User?");
		newUserBtn.setStyle("-fx-background-color: transparent;");
		newUserBtn.setFont(new Font("Arial Rounded MT Bold", 12));
		newUserBtn.setOnAction(event -> {
			nup.showStage();
		});

		forgotPassBtn = new Button("Forgot Password?");
		forgotPassBtn.setStyle("-fx-background-color: transparent;");
		forgotPassBtn.setFont(new Font("Arial Rounded MT Bold", 12));
		forgotPassBtn.setAlignment(Pos.TOP_RIGHT);
		forgotPassBtn.setOnAction(event -> {
			fpp.showStage();
		});

		cancelBtn = new Button("Cancel");
		cancelBtn.setMinSize(100, 30);
		cancelBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		cancelBtn.setOnAction(event -> {
			Main_Window.closeStage();
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

	public Button getCancleBtn() {
		return cancelBtn;
	}

	public boolean isLoginValid() {
		return isValid;
	}

	public static void setIsLoginValid(boolean valid) {
		isValid = valid;
	}

	public static void setUser(NewUser account) {
		user = account;
	}

}
