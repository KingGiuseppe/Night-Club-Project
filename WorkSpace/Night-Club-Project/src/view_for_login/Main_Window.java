package view_for_login;

import javafx.scene.Scene;
import javafx.stage.Stage;
import model_for_newuser.NewUserEventListener;

public class Main_Window {
	
	private Stage stage;
	private static NewUserEventListener eventListener;

	public Main_Window(Stage stage) {
		this.stage = stage;
		
		PaneForMainWindow p4mw = new PaneForMainWindow();
		Scene scene = new Scene(p4mw.getPane(), 450, 250);
		
		stage.setScene(scene);
		stage.setTitle("Club Management");
		stage.show();

	}
	
	public void setNewUserEventListener(NewUserEventListener eventListener) {
		this.eventListener = eventListener;
	}
	
	public static NewUserEventListener getListener() {
		return eventListener;
	}
}