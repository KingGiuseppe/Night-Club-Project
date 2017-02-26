package view_for_owner;

import java.util.ArrayList;

import buttons_for_owner_panel.ButtonsForSchedulingPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model_for_newuser.NewUser;

public class SchedulingPane {

	private VBox mainPane;
	private VBox listPane;
	private HBox topPane;
	private static ListView<String> managerList;
	private static ArrayList<NewUser> managerArrList;
	private static ListView<String> dayList;
	private ObservableList<String> dayListObs;
	private static ToggleGroup shiftGroup;
	private RadioButton shift1Rad;
	private RadioButton shift2Rad;
	private HBox shiftPane;
	private ButtonsForSchedulingPane schedBtnPane;
	private TableViewForSchedulingPane tableView;
	private static Scene scene;
	private static ObservableList<String> ml;

	public SchedulingPane() {
		schedBtnPane = new ButtonsForSchedulingPane();
		tableView = new TableViewForSchedulingPane();
		mainPane = new VBox(20);
		topPane = new HBox(50);
		listPane = new VBox(20);
		shiftPane = new HBox(20);

		setManagerList(new ListView<String>());

		setDayList(new ListView<String>());
		dayListObs = FXCollections.observableArrayList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday");
		getDayList().setItems(dayListObs);
		getDayList().setMaxHeight(200);

		shift1Rad = new RadioButton("Shift 1");
		shift2Rad = new RadioButton("Shift 2");
		setShiftGroup(new ToggleGroup());
		shift1Rad.setToggleGroup(getShiftGroup());
		shift2Rad.setToggleGroup(getShiftGroup());
		shiftPane.getChildren().addAll(shift1Rad, shift2Rad);

		listPane.getChildren().addAll(new Label("Please select a day from the list..."), getDayList(),
				new Label("Please select a shift below.."), shiftPane);
		shiftPane.setAlignment(Pos.CENTER);
		topPane.getChildren().addAll(new Label("  "), getManagerList(), listPane, schedBtnPane.getPane(),
				new Label("  "));
		mainPane.getChildren().addAll(new Label("   \n   "), topPane, tableView.getPane(), new Label("   \n   "));
		scene = new Scene(mainPane, 850, 570);
	}

	public static void setManagerList(ArrayList<NewUser> mList) {
		managerArrList = mList;
		setmanagerListView();
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setmanagerListView() {
		ml = FXCollections.observableArrayList();
		ml.add("Firstname, Lastname");
		for (NewUser e : managerArrList) {
			ml.add("   " + e.getLastName() + ",     " + e.getFirstName());
			getManagerList().setItems(ml);
		}
	}

	public static ListView<String> getListView() {
		return getManagerList();
	}

	public static ListView<String> getDayList() {
		return dayList;
	}

	public static void setDayList(ListView<String> dayList) {
		SchedulingPane.dayList = dayList;
	}

	public static ListView<String> getManagerList() {
		return managerList;
	}

	public static void setManagerList(ListView<String> managerList) {
		SchedulingPane.managerList = managerList;
	}

	public static ToggleGroup getShiftGroup() {
		return shiftGroup;
	}

	public static void setShiftGroup(ToggleGroup shiftGroup) {
		SchedulingPane.shiftGroup = shiftGroup;
	}

}
