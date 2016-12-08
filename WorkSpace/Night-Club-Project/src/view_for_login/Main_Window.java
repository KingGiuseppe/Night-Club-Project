package view_for_login;

import javafx.scene.Scene;
import javafx.stage.Stage;
import model_for_login.LoginEventListener;
import model_for_manager.SchedulingEventListener;
import model_for_newuser.NewUserEventListener;
import view_for_guest.GuestPane;
import view_for_manager.ManagerPane;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.OwnerPane;

public class Main_Window {

	private static Stage stage;
	private static LoginEventListener loginListener;
	private static NewUserEventListener newUserListener;
	private static Scene scene;
	private static SchedulingEventListener schedulingListener;

	public Main_Window(Stage stage) {
		Main_Window.stage = stage;

		PaneForMainWindow p4mw = new PaneForMainWindow();
		GuestPane gp = new GuestPane();
		ManagerPane mp = new ManagerPane();
		OwnerPane op = new OwnerPane();
		CreateManagerAccount1 cma = new CreateManagerAccount1();
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

	public static Stage getStage() {
		return stage;
	}

	public static void setScene(Scene newScene) {
		scene = newScene;
	}
	public static void closeStage() {
		stage.close();
	}

	public static SchedulingEventListener getSchedulingListener() {
		return schedulingListener;
	}
	public void setSchedulingListener(SchedulingEventListener schedulingEventListener2) {
		this.schedulingListener = schedulingEventListener2;
	}
	
	
}