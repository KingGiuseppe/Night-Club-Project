package view_for_owner;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model_for_scheduling.ShiftObject;

public class TableViewForSchedulingPane {

	private static ArrayList<ShiftObject> scheduleList;
	private static ObservableList<ShiftObject> obsScheduleList;
	static TableView schedTableView;
	private TableColumn sundayColTitle;
	private TableColumn mondayColTitle;
	private TableColumn tuesdayColTitle;
	private TableColumn wednesdayColTitle;
	private TableColumn thursdayColTitle;
	private TableColumn fridayColTitle;
	private TableColumn saturdayColTitle;
	private Label shift2Lbl;
	private Label shift1Lbl;
	private VBox lblPane;
	private Button backBtn;
	private HBox backBtnPane;
	static HBox tablePane;
	private static ShiftObject shift1;
	private static ShiftObject shift2;

	public TableViewForSchedulingPane() {
		obsScheduleList = FXCollections.observableArrayList();
		tablePane = new HBox();
		lblPane = new VBox(7);
		schedTableView = new TableView();
		schedTableView.setEditable(false);

		shift1Lbl = new Label("Shift 1: ");
		shift1Lbl.setTextFill(Color.web("#ffffff"));
		shift1Lbl.setFont(new Font("Arial Rounded MT Bold", 20));
		shift2Lbl = new Label("Shift 2: ");
		shift2Lbl.setTextFill(Color.web("#ffffff"));
		shift2Lbl.setFont(new Font("Arial Rounded MT Bold", 20));
		sundayColTitle = new TableColumn("Sunday");
		mondayColTitle = new TableColumn("Monday");
		tuesdayColTitle = new TableColumn("Tuesday");
		wednesdayColTitle = new TableColumn("Wednesday");
		thursdayColTitle = new TableColumn("Thursday");
		fridayColTitle = new TableColumn("Friday");
		saturdayColTitle = new TableColumn("Saturday");

		// add to this list to show on table

		sundayColTitle.setCellValueFactory(new PropertyValueFactory<ShiftObject, String>("sunday"));
		mondayColTitle.setCellValueFactory(new PropertyValueFactory<ShiftObject, String>("monday"));
		tuesdayColTitle.setCellValueFactory(new PropertyValueFactory<ShiftObject, String>("tuesday"));
		wednesdayColTitle.setCellValueFactory(new PropertyValueFactory<ShiftObject, String>("wednesday"));
		thursdayColTitle.setCellValueFactory(new PropertyValueFactory<ShiftObject, String>("thursday"));
		fridayColTitle.setCellValueFactory(new PropertyValueFactory<ShiftObject, String>("friday"));
		saturdayColTitle.setCellValueFactory(new PropertyValueFactory<ShiftObject, String>("saturday"));
		backBtn = new Button("   Back   ");
		backBtnPane = new HBox();
		backBtn.setFont(new Font("Arial Rounded MT Bold", 15));
		backBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(OwnerPane.getScene());
		});
		backBtnPane.getChildren().addAll(new Label("               "), backBtn);
		backBtnPane.setAlignment(Pos.BOTTOM_RIGHT);
		schedTableView.setItems(obsScheduleList);
		lblPane.getChildren().addAll(new Label(" "), shift1Lbl, shift2Lbl);
		schedTableView.getColumns().addAll(sundayColTitle, mondayColTitle, tuesdayColTitle, wednesdayColTitle,
				thursdayColTitle, fridayColTitle, saturdayColTitle);
		tablePane.getChildren().addAll(lblPane, schedTableView, backBtnPane);
		tablePane.setAlignment(Pos.CENTER);

	}

	public static HBox getPane() {
		return tablePane;
	}

	public static void setManagerList(ArrayList<ShiftObject> mList) {
		scheduleList = mList;
	}

	public static void setShiftListView(ArrayList<ShiftObject> list) {
		obsScheduleList.clear();
		obsScheduleList.add(0, list.get(0));
		obsScheduleList.add(1, list.get(1));
		getObsList();
	}

	public static ObservableList<ShiftObject> getObsList() {
		schedTableView.setItems(obsScheduleList);
		return obsScheduleList;
	}

	public static ShiftObject getShift1() {
		return shift1;
	}

	public static ShiftObject getShift2() {
		return shift2;
	}

	public static TableView getTableView() {
		return schedTableView;
	}

	public static ObservableList<ShiftObject> getObsList2() {
		return obsScheduleList;
	}

	public static ArrayList<ShiftObject> getList() {
		return scheduleList;
	}
}
