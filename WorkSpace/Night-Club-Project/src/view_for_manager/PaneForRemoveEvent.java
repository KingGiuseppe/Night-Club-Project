package view_for_manager;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model_for_event_creation.CreateEventPaneObject;
import model_for_removeEv.RemoveEventObj;
import view_for_login.Main_Window;

public class PaneForRemoveEvent {
	private static ArrayList<CreateEventPaneObject> eventsList;
	private Button removeEventBtn;
	private VBox listView;
	private Button backBtn;
	private HBox btnPane;
	private static Scene scene;
	private static ListView<String> eventsListView;
	private static ObservableList<String> el;

	public PaneForRemoveEvent() {
		listView = new VBox(10);
		listView.setPadding(new Insets(25, 25, 25, 25));
		btnPane = new HBox(10);
		btnPane.setAlignment(Pos.CENTER_RIGHT);
		removeEventBtn = new Button("Remove Event");
		removeEventBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		setEventsListView(new ListView<String>());
		backBtn = new Button("Back");
		backBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		backBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(ManagerPane.getScene());
		});

		removeEventBtn.setOnAction(event -> {
			getList();
		});
		btnPane.getChildren().addAll(removeEventBtn, backBtn);
		listView.getChildren().addAll(getEventsListView(), btnPane);

		scene = new Scene(listView, 450, 400);
		
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
	
	public static void getList() {
		RemoveEventObj obj = new RemoveEventObj(getEventsListView().getSelectionModel().getSelectedItem());
		if (Main_Window.getRemoveEvEventListener() != null) {
			Main_Window.getRemoveEvEventListener().removeEvBtnClicked(obj);
		}
	}

	public static ListView<String> getEventsListView() {
		return eventsListView;
	}

	public static void setEventsListView(ListView<String> eventsListView) {
		PaneForRemoveEvent.eventsListView = eventsListView;
	}
}
