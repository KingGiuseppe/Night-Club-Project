package view_for_login;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import listener.ButtonListener;
import listener.ButtonListener2;
import listener.ListenerMethods;
import model_for_event_creation.CreateEventListener;
import model_for_login.ForgotPassEventListener;
import model_for_login.ForgotPassEventListener2;
import model_for_newuser.NewUserEventListener;
import model_for_removeEv.RemoveEvEventListener;
import model_for_removeEv.RemoveEventBtnClickedEventListener;
import model_for_scheduling.AddToScheduleEventListener;
import model_load_events.GetEventsListener;
import view_for_guest.GuestPane;
import view_for_manager.ManagerPane;
import view_for_manager.PaneForCreateEvent1;
import view_for_manager.PaneForCreateEvent2;
import view_for_manager.PaneForRemoveEvent;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.OwnerPane;

public class Main_Window {

	private static Stage stage;
	private static NewUserEventListener newUserListener;
	private static Scene scene;
	private static AddToScheduleEventListener addToSchedListener;
	private static CreateEventListener createEventEventListener;
	private static ForgotPassEventListener forgotPassEventListener;
	private static ForgotPassEventListener2 forgotPassEventListener2;
	private static RemoveEvEventListener removeEvEventListener;
	private static RemoveEventBtnClickedEventListener removeEventBtnEventListener;
	private static ButtonListener buttonListener;
	private static ButtonListener2 buttonListener2;
	private static GetEventsListener eventListener;

	public Main_Window(Stage stage) {
		Main_Window.stage = stage;
		Login_Pane loginPane = new Login_Pane();
		PaneForRemoveEvent removeEv = new PaneForRemoveEvent();
		GuestPane gp = new GuestPane();
		ManagerPane mp = new ManagerPane();
		OwnerPane op = new OwnerPane();
		CreateManagerAccount1 cma = new CreateManagerAccount1();
		PaneForCreateEvent1 pce1 = new PaneForCreateEvent1();
		PaneForCreateEvent2 pce2 = new PaneForCreateEvent2();

		Scene scene = new Scene(loginPane.getPane(), 360, 540);
		
		stage.initStyle(StageStyle.UNDECORATED);
		stage.setScene(scene);
		stage.setTitle("Club Management");
		stage.show();

	}

	public static Stage getStage() {
		return stage;
	}

	public static void setScene(Scene newScene) {
		scene = newScene;
	}

	public static void closeStage() {
		stage.close();
	}

}