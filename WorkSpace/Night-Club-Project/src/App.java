import bags.GuestAccountBag;
import controller.LoginController;
import controller.NewUserController;
import javafx.application.Application;
import javafx.stage.Stage;
import view_for_login.Main_Window;

public class App extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Main_Window view = new Main_Window(stage);
		GuestAccountBag guestModel = new GuestAccountBag();
		NewUserController newUserCont = new NewUserController(guestModel, view);
		
		LoginController loginCont = new LoginController(guestModel, view);

	}
	
}
