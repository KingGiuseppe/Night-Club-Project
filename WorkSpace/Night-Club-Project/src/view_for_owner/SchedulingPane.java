package view_for_owner;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model_for_newuser.NewUser;

public class SchedulingPane {

	private VBox mainPane;
	private VBox listPane;
	private HBox topPane;
	static ListView<String> managerList;
	private static ArrayList<NewUser> managerArrList;
	static ListView<String> dayList;
	private ObservableList<String> dayListObs;
	static ToggleGroup shiftGroup;
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

		managerList = new ListView<String>();
		
		dayList = new ListView<String>();
		dayListObs = FXCollections.observableArrayList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday");
		dayList.setItems(dayListObs);
		dayList.setMaxHeight(200);

		shift1Rad = new RadioButton("Shift 1");
		shift2Rad = new RadioButton("Shift 2");
		shiftGroup = new ToggleGroup();
		shift1Rad.setToggleGroup(shiftGroup);
		shift2Rad.setToggleGroup(shiftGroup);
		shiftPane.getChildren().addAll(shift1Rad, shift2Rad);


		listPane.getChildren().addAll(new Label("Please select a day from the list..."), dayList,
				new Label("Please select a shift below.."), shiftPane);
		shiftPane.setAlignment(Pos.CENTER);
		topPane.getChildren().addAll(new Label("  "),managerList, listPane, schedBtnPane.getPane(), new Label("  "));
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
		for(NewUser e : managerArrList) {
			ml.add("   " + e.getLastName()+ ",     " + e.getFirstName());
			managerList.setItems(ml);
		}
	}
}
