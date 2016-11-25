package view_for_login;

import javafx.scene.Scene;
import javafx.stage.Stage;
import model_for_login.LoginEventListener;
import model_for_login.LoginObject;
import model_for_newuser.NewUserEventListener;

public class Main_Window {
	
	private Stage stage;
	private static LoginEventListener loginListener;
	private static NewUserEventListener newUserListener;

	public Main_Window(Stage stage) {
		this.stage = stage;
		
		PaneForMainWindow p4mw = new PaneForMainWindow();
		Scene scene = new Scene(p4mw.getPane(), 450, 250);
		
		stage.setScene(scene);
		stage.setTitle("Club Management");
		stage.show();

	}
	
	public void setNewUserEventListener(NewUserEventListener newUserListener) {
		this.newUserListener = newUserListener;
	}
	
	public static NewUserEventListener getNewUserListener() {
		return newUserListener;
	}

	public void setLoginListener(LoginEventListener loginListener) {
		this.loginListener = loginListener;
	}
	
	public static LoginEventListener getLoginListener() {
		return loginListener;
	}
}