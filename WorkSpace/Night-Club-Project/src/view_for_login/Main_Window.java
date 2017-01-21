package view_for_login;

import bags.CreateEventBag;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model_for_event_creation.CreateEventEventListener;
import model_for_login.ForgotPassEventListener;
import model_for_login.ForgotPassEventListener2;
import model_for_login.LoginEventListener;
import model_for_newuser.NewUserEventListener;
import model_for_removeEv.RemoveEvEventListener;
import model_for_removeEv.RemoveEventBtnClickedEventListener;
import model_for_scheduling.AddToScheduleEventListener;
import model_for_scheduling.SchedulingEventListener;
import view_for_guest.GuestPane;
import view_for_manager.ManagerPane;
import view_for_manager.PaneForCreateEvent1;
import view_for_manager.PaneForCreateEvent2;
import view_for_manager.PaneForRemoveEvent;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.OwnerPane;

public class Main_Window {

	private static Stage stage;
	private static LoginEventListener loginListener;
	private static NewUserEventListener newUserListener;
	private static Scene scene;
	private static SchedulingEventListener schedulingListener;
	private static AddToScheduleEventListener addToSchedListener;
	private static CreateEventEventListener createEventEventListener;
	private static ForgotPassEventListener forgotPassEventListener;
	private static ForgotPassEventListener2 forgotPassEventListener2;
	private static RemoveEvEventListener removeEvEventListener;
	private static RemoveEventBtnClickedEventListener removeEventBtnEventListener;

	public Main_Window(Stage stage) {
		Main_Window.stage = stage;
		PaneForRemoveEvent removeEv = new PaneForRemoveEvent();
		PaneForMainWindow p4mw = new PaneForMainWindow();
		GuestPane gp = new GuestPane();
		ManagerPane mp = new ManagerPane();
		OwnerPane op = new OwnerPane();
		CreateManagerAccount1 cma = new CreateManagerAccount1();
		CreateEventBag bag = new CreateEventBag();
		PaneForCreateEvent1 pce1 = new PaneForCreateEvent1();
		PaneForCreateEvent2 pce2 = new PaneForCreateEvent2();
		Scene scene = new Scene(p4mw.getPane(), 450, 250);
		
		stage.setScene(scene);
		stage.setTitle("Club Management");
		stage.show();

	}

	public void setNewUserEventListener(NewUserEventListener newUserListener) {
		this.newUserListener = newUserListener;
	}

	public static NewUserEventListener getNewUserListener() {
		return newUserListener;
	}

	public void setLoginListener(LoginEventListener loginListener) {
		this.loginListener = loginListener;
	}

	public static LoginEventListener getLoginListener() {
		return loginListener;
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

	public static SchedulingEventListener getSchedulingListener() {
		return schedulingListener;
	}
	public void setSchedulingListener(SchedulingEventListener schedulingEventListener2) {
		this.schedulingListener = schedulingEventListener2;
	}

	public void setAddToSchedListener(AddToScheduleEventListener addToScheduleEventListener) {
		this.addToSchedListener = addToScheduleEventListener;
	}
	public static AddToScheduleEventListener getAddToSchedListener() {
		return addToSchedListener;
	}
	
	public void setCreateEventListener(CreateEventEventListener createEventEventListener) {
		this.createEventEventListener = createEventEventListener;
	}
	public static CreateEventEventListener getCreateEventEventListener() {
		return createEventEventListener;
	}

	public static ForgotPassEventListener getForgotPassListener() {
		return forgotPassEventListener;
	}
	public void setForgotPassEventListener(ForgotPassEventListener ev){
		this.forgotPassEventListener = ev;
	}

	public static ForgotPassEventListener2 getForgotPassListener2() {
		return forgotPassEventListener2;
	}
	public void setForgotPassEventListener2(ForgotPassEventListener2 forgotPassEventListener22){
		this.forgotPassEventListener2 = forgotPassEventListener22;
	}

	public void setRemoveEventListener(RemoveEvEventListener removeEvEventListener) {
		this.removeEvEventListener = removeEvEventListener;
	}
	public static RemoveEvEventListener getRemoveEvEventListener() {
		return removeEvEventListener;
	}

	public static RemoveEventBtnClickedEventListener getRemoveEventBtnListener() {
		return removeEventBtnEventListener;
	}
	public void setRemoveEventBtnClickedEventListener(RemoveEventBtnClickedEventListener removeEventBtnClickedEventListener) {
		this.removeEventBtnEventListener = removeEventBtnClickedEventListener;
	}
	
}