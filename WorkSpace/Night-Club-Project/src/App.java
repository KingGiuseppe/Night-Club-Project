import java.io.Serializable;

import bags.DataBase;
import bags.ScheduleList;
import controller.AddToSchedController;
import controller.CreateEventController;
import controller.ForgotPassController;
import controller.ForgotPassController2;
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
		ScheduleList schedList = new ScheduleList();
		
		GetEventsController eventsCont = new GetEventsController(view);
		CreateEventController createEventCont = new CreateEventController(view);
		AddToSchedController addSched = new AddToSchedController(schedList, view);
		NewUserController newUserCont = new NewUserController(view);
		LoginController loginCont = new LoginController(view);
		ForgotPassController pasCont = new ForgotPassController(view);
		ForgotPassController2 pasCont2 = new ForgotPassController2(view);
		RemoveEventController removeEvController = new RemoveEventController(view);
		SchedulingController schedCont = new SchedulingController(view);
		RemoveEvBtnClickedController removeEvBtn = new RemoveEvBtnClickedController(view);
	}

}
	