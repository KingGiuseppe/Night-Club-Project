import java.io.Serializable;

import javafx.application.Application;
import javafx.stage.Stage;
import view.login_panel.stage.LoginStage;

public class App extends Application implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		new LoginStage(stage);
		
	}

}
	