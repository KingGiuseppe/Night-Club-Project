import java.io.Serializable;

import bags.AccountBag;
import bags.CreateEventBag;
import bags.DataBase;
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
import panes_for_login.Main_Window;

public class App extends Application implements Serializable {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Main_Window view = new Main_Window(stage);
		DataBase database = new DataBase();
		AccountBag account = new AccountBag();
		ScheduleList schedList = new ScheduleList();
		CreateEventBag createEventBag = new CreateEventBag();
		CreateEventController createEventCont = new CreateEventController(createEventBag, view);
		AddToSchedController addSched = new AddToSchedController(schedList, view);
		NewUserController newUserCont = new NewUserController(account, view);
		LoginController loginCont = new LoginController(database, view);
		ForgotPassController pasCont = new ForgotPassController(account, view);
		RemoveEventController removeEvController = new RemoveEventController(createEventBag, view);
		SchedulingController schedCont = new SchedulingController(account, createEventBag, view);

	}

}
