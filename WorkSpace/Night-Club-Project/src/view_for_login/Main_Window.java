package view_for_login;

import Listeners.ButtonListener;
import Listeners.ButtonListener2;
import Listeners.ListenerMethods;
import bags.CreateEventBag;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
		CreateEventBag bag = new CreateEventBag();
		PaneForCreateEvent1 pce1 = new PaneForCreateEvent1();
		PaneForCreateEvent2 pce2 = new PaneForCreateEvent2();

		Scene scene = new Scene(loginPane.getPane(), 360, 540);
		
		stage.initStyle(StageStyle.UNDECORATED);
		setEventListener(null);
		stage.setScene(scene);
		stage.setTitle("Club Management");
		stage.show();

	}
	
	public void setGetEventListener(GetEventsListener eventListener) {
		this.eventListener = eventListener;
	}
	public static GetEventsListener getEventButtonListener() {
		return eventListener;
	}

	// Generic Listener
	public void setEventListener(ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}

	public static ButtonListener getButtonListener() {
		return buttonListener;
	}

	public void setEventListener2(ButtonListener2 buttonListener2) {
		this.buttonListener2 = buttonListener2;
	}

	public static ButtonListener2 getButtonListener2() {
		return buttonListener2;
	}

	public static ListenerMethods getListener() {
		return new ListenerMethods();
	}

	public void setNewUserEventListener(NewUserEventListener newUserListener) {
		this.newUserListener = newUserListener;
	}

	public static NewUserEventListener getNewUserListener() {
		return newUserListener;
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

	public void setAddToSchedListener(AddToScheduleEventListener addToScheduleEventListener) {
		this.addToSchedListener = addToScheduleEventListener;
	}

	public static AddToScheduleEventListener getAddToSchedListener() {
		return addToSchedListener;
	}

	public void setCreateEventListener(CreateEventListener createEventEventListener) {
		this.createEventEventListener = createEventEventListener;
	}

	public static CreateEventListener getCreateEventEventListener() {
		return createEventEventListener;
	}

	public static ForgotPassEventListener getForgotPassListener() {
		return forgotPassEventListener;
	}

	public void setForgotPassEventListener(ForgotPassEventListener ev) {
		this.forgotPassEventListener = ev;
	}

	public static ForgotPassEventListener2 getForgotPassListener2() {
		return forgotPassEventListener2;
	}

	public void setForgotPassEventListener2(ForgotPassEventListener2 forgotPassEventListener22) {
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

	public void setRemoveEventBtnClickedEventListener(
			RemoveEventBtnClickedEventListener removeEventBtnClickedEventListener) {
		this.removeEventBtnEventListener = removeEventBtnClickedEventListener;
	}

}