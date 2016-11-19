package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_Window extends Application {
	
	public void start(Stage stage) throws Exception {
		PaneForMainWindow p4mw = new PaneForMainWindow();
		Scene scene = new Scene(p4mw.getPane(), 450, 250);
		
		stage.setScene(scene);
		stage.setTitle("Club Management");
		stage.show();

	}
	
	
}
