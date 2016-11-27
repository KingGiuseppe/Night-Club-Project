import bags.GuestAccountBag;
import bags.ManagerAccountBag;
import controller.LoginController;
import controller.NewUserController;
import javafx.application.Application;
import javafx.stage.Stage;
import model_for_newuser.NewUser;
import view_for_login.Main_Window;

public class App extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Main_Window view = new Main_Window(stage);
		
		GuestAccountBag guestModel = new GuestAccountBag();
		ManagerAccountBag manBag = new ManagerAccountBag();
		
		NewUserController newUserCont = new NewUserController(guestModel, view);
		
		LoginController loginCont = new LoginController(guestModel, manBag, view);

	}
	
}
