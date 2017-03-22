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
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
	private Label label2;
	private Label label3;
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
		shift1Rad.setFont(new Font("Arial Rounded MT Bold", 20));
		shift1Rad.setTextFill(Color.web("#ffffff"));
		shift2Rad = new RadioButton("Shift 2");
		shift2Rad.setFont(new Font("Arial Rounded MT Bold", 20));
		shift2Rad.setTextFill(Color.web("#ffffff"));
		setShiftGroup(new ToggleGroup());
		shift1Rad.setToggleGroup(getShiftGroup());
		shift2Rad.setToggleGroup(getShiftGroup());
		shiftPane.getChildren().addAll(shift1Rad, shift2Rad);
		label2 = new Label("Please select a day from the list...");
		label2.setTextFill(Color.web("#ffffff"));
		label2.setFont(new Font("Arial Rounded MT Bold", 25));
		label3 = new Label("Please select a shift below..");
		label3.setTextFill(Color.web("#ffffff"));
		label3.setFont(new Font("Arial Rounded MT Bold", 25));
		listPane.getChildren().addAll(label2, getDayList(),
				label3, shiftPane);
		shiftPane.setAlignment(Pos.CENTER);
		topPane.getChildren().addAll(new Label("  "), getManagerList(), listPane, schedBtnPane.getPane(),
				new Label("  "));
		mainPane.getChildren().addAll(new Label("   \n   "), topPane, tableView.getPane(), new Label("   \n   "));
		scene = new Scene(mainPane, 1050, 570);
		
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://www.chinavisavancouver.com/bg1.jpg", 1100,
						570, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		mainPane.setBackground(new Background(myBI));
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
