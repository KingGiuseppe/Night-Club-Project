import java.io.Serializable;

import bags.AccountBag;
import bags.CreateEventBag;
import bags.DataBase;
import bags.ScheduleList;
import controller.AddToSchedController;
import controller.CreateEventController;
import controller.ForgotPassController;
import controller.GetEventsController;
import controller.LoginController;
import controller.NewUserController;
import controller.RemoveEvBtnClickedController;
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
		DataBase database = new DataBase();
		AccountBag account = new AccountBag();
		ScheduleList schedList = new ScheduleList();
		GetEventsController eventsCont = new GetEventsController(database, view);
		CreateEventBag createEventBag = new CreateEventBag();
		CreateEventController createEventCont = new CreateEventController(database, view);
		AddToSchedController addSched = new AddToSchedController(schedList, view);
		NewUserController newUserCont = new NewUserController(account, view);
		LoginController loginCont = new LoginController(database, view);
		ForgotPassController pasCont = new ForgotPassController(account, view);
		RemoveEventController removeEvController = new RemoveEventController(database, view);
		SchedulingController schedCont = new SchedulingController(account, createEventBag, view);
		RemoveEvBtnClickedController removeEvBtn = new RemoveEvBtnClickedController(database, view);
	}

}
