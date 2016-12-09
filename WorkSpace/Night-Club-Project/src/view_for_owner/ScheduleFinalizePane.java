package view_for_owner;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model_for_manager.ShiftObject;

public class ScheduleFinalizePane {

	
	
	private static Stage stage;
	private BorderPane finalizePane;
	private Scene scene;
	private TableViewForSchedulingPane tvfsp;
	private Button printBtn;
	private Button closeBtn;
	private VBox btnPane;
	private MenuBar menuBar;
	private Menu fileMenu;
	private MenuItem printItem;
	private MenuItem closeItem;
	private static TableView table;
	private static ObservableList<ShiftObject> obsList;
	private static TableView tableView;
	private static HBox tablePane;
	
	public ScheduleFinalizePane() {
		stage = new Stage();
		table = new TableView();
		finalizePane = new BorderPane();
		tvfsp = new TableViewForSchedulingPane();
		menuBar = new MenuBar();
		fileMenu = new Menu("File");
		printItem = new MenuItem("Print");
		closeItem = new MenuItem("Close");
		closeItem.setOnAction(event -> {
			stage.close();
		});
		fileMenu.getItems().addAll(printItem, closeItem);
		menuBar.getMenus().add(fileMenu);
		
		finalizePane.setTop(menuBar);
		finalizePane.setCenter(TableViewForSchedulingPane.getPane());
		
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

}
