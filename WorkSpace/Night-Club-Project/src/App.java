import bags.AccountBag;
import bags.ScheduleList;
import controller.AddToSchedController;
import controller.LoginController;
import controller.NewUserController;
import controller.SchedulingController;
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
		
		AccountBag accountModel = new AccountBag();
		ScheduleList schedList = new ScheduleList();
		AddToSchedController addSched = new AddToSchedController(schedList, view);
		NewUserController newUserCont = new NewUserController(accountModel, view);
		SchedulingController schedCont = new SchedulingController(accountModel, view);
		LoginController loginCont = new LoginController(accountModel, view);

	}
	
}
