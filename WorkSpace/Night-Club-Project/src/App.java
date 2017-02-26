import java.io.Serializable;

import bags.AccountBag;
import bags.CreateEventBag;
import bags.ScheduleList;
import controller.AddToSchedController;
import controller.CreateEventController;
import controller.ForgotPassController;
import controller.LoginController;
import controller.NewUserController;
import controller.RemoveEventController;
import controller.SchedulingController;
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
		AccountBag accountModel = new AccountBag();
		ScheduleList schedList = new ScheduleList();
		CreateEventBag createEventBag = new CreateEventBag();
		CreateEventController createEventCont = new CreateEventController(createEventBag, view);
		AddToSchedController addSched = new AddToSchedController(schedList, view);
		NewUserController newUserCont = new NewUserController(accountModel, view);
		LoginController loginCont = new LoginController(accountModel, view);
		ForgotPassController pasCont = new ForgotPassController(accountModel, view);
		RemoveEventController removeEvController = new RemoveEventController(createEventBag, view);
		SchedulingController schedCont = new SchedulingController(accountModel, createEventBag, view);

	}

}
