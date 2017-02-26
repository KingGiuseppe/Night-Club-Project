package view_for_manager;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import model_for_event_creation.CreateEventPaneObject;
import model_for_removeEv.RemoveEventObj;
import panes_for_login.Main_Window;

public class PaneForRemoveEvent {
	private static ArrayList<CreateEventPaneObject> eventsList;
	private Button removeEventBtn;
	private HBox listView;
	private Button backBtn;
	private static Scene scene;
	private static ListView<String> eventsListView;
	private static ObservableList<String> el;

	public PaneForRemoveEvent() {
		listView = new HBox();
		removeEventBtn = new Button("Remove Event");
		eventsListView = new ListView<String>();
		backBtn = new Button("Back");
		backBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(ManagerPane.getScene());
		});

		removeEventBtn.setOnAction(event -> {

			RemoveEventObj obj = new RemoveEventObj(eventsListView.getSelectionModel().getSelectedItem());
			if (Main_Window.getRemoveEvEventListener() != null) {
				Main_Window.getRemoveEvEventListener().removeEvBtnClicked(obj);
			}

		});
		listView.getChildren().addAll(eventsListView, removeEventBtn, backBtn);

		scene = new Scene(listView, 850, 570);

	}

	public static void setEventsList(ArrayList<CreateEventPaneObject> list) {
		eventsList = list;
		setEventsListView();
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setEventsListView() {
		el = FXCollections.observableArrayList();
		el.add("Event Name");

		for (CreateEventPaneObject e : eventsList) {
			el.add(e.getEventName());
			eventsListView.setItems(el);
		}

	}
}
