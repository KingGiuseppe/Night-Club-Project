import java.io.Serializable;

import javafx.application.Application;
import javafx.stage.Stage;
import view_for_login.Main_Window;

public class App extends Application implements Serializable {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Main_Window view = new Main_Window(stage);
		
	}

}
	