package view_for_owner;

import java.util.ArrayList;
import java.util.stream.IntStream;

import javafx.scene.control.ListView;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_newuser.NewUser;
import model_for_scheduling.ShiftObject;

public class ScheduleFinalizePane {

	
	
	private static Stage stage;
	private BorderPane finalizePane;
	private Scene scene;
	private Button printBtn;
	private Button closeBtn;
	private VBox btnPane;
	private MenuBar menuBar;
	private Menu fileMenu;
	private MenuItem printItem;
	private MenuItem closeItem;
	private static TableView schedTableView;
	private Label shift1Lbl;
	private Label shift2Lbl;
	private TableColumn sundayColTitle;
	private TableColumn mondayColTitle;
	private TableColumn tuesdayColTitle;
	private TableColumn wednesdayColTitle;
	private TableColumn thursdayColTitle;
	private TableColumn fridayColTitle;
	private TableColumn saturdayColTitle;
	private HBox schedPane;
	private VBox lblPane;
	private static ObservableList<ShiftObject> obsScheduleList;
	private static ObservableList<ShiftObject> obsList;
	private static TableView tableView;
	private static HBox tablePane;
	private static ArrayList<NewUser> managerArrList;
	private static ObservableList<Object> ml;
	private static TableView managerList;
	private static ListView<String> schedListView;
	
	public ScheduleFinalizePane() {
		stage = new Stage();
		finalizePane = new BorderPane();
		menuBar = new MenuBar();
		schedListView = new ListView<String>();
		obsScheduleList = FXCollections.observableArrayList();
		lblPane = new VBox(40);
		schedTableView = new TableView();
		schedTableView.setEditable(false);
		schedTableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		IntStream.range(0, 20).mapToObj(Integer::toString).forEach(schedTableView.getItems()::add);
		schedTableView.setFixedCellSize(110);
		schedTableView.prefHeightProperty().bind(Bindings.size(schedTableView.getItems()).multiply(schedTableView.getFixedCellSize()).add(2));
		shift1Lbl = new Label("Shift 1: ");
		shift1Lbl.setFont(Font.font(15));
		shift2Lbl = new Label("Shift 2: ");
		shift2Lbl.setFont(Font.font(15));
		
		sundayColTitle = new TableColumn("Sunday");
		mondayColTitle = new TableColumn("Monday");
		tuesdayColTitle = new TableColumn("Tuesday");
		wednesdayColTitle = new TableColumn("Wednesday");
		thursdayColTitle = new TableColumn("Thursday");
		fridayColTitle = new TableColumn("Friday");
		saturdayColTitle = new TableColumn("Saturday");
		
		sundayColTitle.setCellValueFactory(
                new PropertyValueFactory<ShiftObject, String>("sunday"));
		mondayColTitle.setCellValueFactory(
                new PropertyValueFactory<ShiftObject, String>("monday"));
		tuesdayColTitle.setCellValueFactory(
                new PropertyValueFactory<ShiftObject, String>("tuesday"));
		wednesdayColTitle.setCellValueFactory(
                new PropertyValueFactory<ShiftObject, String>("wednesday"));
		thursdayColTitle.setCellValueFactory(
                new PropertyValueFactory<ShiftObject, String>("thursday"));
		fridayColTitle.setCellValueFactory(
                new PropertyValueFactory<ShiftObject, String>("friday"));
		saturdayColTitle.setCellValueFactory(
                new PropertyValueFactory<ShiftObject, String>("saturday"));
		
		schedTableView.getColumns().addAll(sundayColTitle, mondayColTitle, tuesdayColTitle, wednesdayColTitle, thursdayColTitle, fridayColTitle, saturdayColTitle);
		
		fileMenu = new Menu("File");
		printItem = new MenuItem("Print");
		closeItem = new MenuItem("Close");
		closeItem.setOnAction(event -> {
			stage.close();
		});
		lblPane.getChildren().addAll(new Label(" "), shift1Lbl, new Label(""), shift2Lbl);
		
		
		fileMenu.getItems().addAll(printItem, closeItem);
		menuBar.getMenus().add(fileMenu);
		schedPane = new HBox();
		schedPane.setAlignment(Pos.CENTER);
		schedPane.getChildren().add(schedTableView);
		finalizePane.setTop(menuBar);
		finalizePane.setCenter(schedPane);
		finalizePane.setBottom(new Label("       "));
		finalizePane.setLeft(lblPane);
		
		scene = new Scene(finalizePane, 700, 300);
		stage.setScene(scene);
		stage.setTitle("Finalize Schedule");
		
	}
	public void showStage() {
		stage.show();
		stage.setScene(scene);
	}

	public static Stage getStage() {
		return stage;
	}

	public static void closeStage() {
		stage.close();
	}
	public static void setTableView(HBox pane) {
		tablePane = pane;
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

}
