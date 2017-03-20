package view_for_manager;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import model_for_event_creation.CreateEventObject;
import view_for_login.Main_Window;

public class PaneForCreateEvent2 {

	private GridPane createEventPane;
	private Label inventoryLbl;
	private Label amountOfBottlesLbl;
	private TextField amountOfBottleTxt;
	private Label costPerBottleLbl;
	private TextField costPerBottleTxt;
	private Label numOfKegsLbl;
	private TextField numOfKegsTxt;
	private Label scheduleLbl;
	private Label numOfBartendersLbl;
	private Label costPerHouseLbl;
	private Label securityLbl;
	private Label numOfBouncersLbl;
	private Label costPerHourBouncersLbl;
	private Label maintenceCrewLbl;
	private Label numOfEmployeesLbl;
	private Label costperHourMaintLbl;
	private TextField numOfBartendersTxt;
	private TextField costPerHouseTxt;
	private TextField numOfBouncersTxt;
	private TextField costPerHourBouncersTxt;
	private TextField numOfEmplyeesTxt;
	private TextField costperHourMaintTxt;
	private Button backBtn;
	private Button createEventBtn;
	private TextField numOfEmployeesTxt;
	private TextField costPerKegTxt;
	private Label costPerKegLbl;
	private static Scene scene;

	public PaneForCreateEvent2() {
		createEventPane = new GridPane();
		createEventPane.setHgap(10);
		createEventPane.setVgap(10);
		createEventPane.setPadding(new Insets(20, 20, 20, 20));

		inventoryLbl = new Label("Inventory");
		inventoryLbl.setFont(Font.font(20));
		amountOfBottlesLbl = new Label("Amount of bottles");
		amountOfBottleTxt = new TextField();
		costPerBottleLbl = new Label("Cost per bottle");
		costPerBottleTxt = new TextField();
		numOfKegsLbl = new Label("Number of kegs");
		numOfKegsTxt = new TextField();
		costPerKegLbl = new Label("Cost per keg");
		costPerKegTxt = new TextField();

		scheduleLbl = new Label("Schedule");
		scheduleLbl.setFont(Font.font(20));
		numOfBartendersLbl = new Label("Number of bartenders");
		numOfBartendersTxt = new TextField();
		costPerHouseLbl = new Label("Cost per hour");
		costPerHouseTxt = new TextField();

		securityLbl = new Label("Security");
		securityLbl.setFont(Font.font(20));
		numOfBouncersLbl = new Label("Number of bouncers");
		numOfBouncersTxt = new TextField();
		costPerHourBouncersLbl = new Label("Cost per hour");
		costPerHourBouncersTxt = new TextField();

		maintenceCrewLbl = new Label("Matinence");
		maintenceCrewLbl.setFont(Font.font(20));
		numOfEmployeesLbl = new Label("Number of employees");
		numOfEmployeesTxt = new TextField();
		costperHourMaintLbl = new Label("Cost per hour");
		costperHourMaintTxt = new TextField();

		backBtn = new Button("Go back");
		backBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(PaneForCreateEvent1.getScene());
		});
		createEventBtn = new Button("Create event");

		createEventBtn.setOnAction(event -> {
			CreateEventObject eventObj = new CreateEventObject(this, PaneForCreateEvent1.getEventName(),
					PaneForCreateEvent1.getDate(), PaneForCreateEvent1.getGenre(), PaneForCreateEvent1.getArtist(),
					PaneForCreateEvent1.getImageUrl());

			if (Main_Window.getCreateEventEventListener() != null) {
				Main_Window.getCreateEventEventListener().createEventBtnClicked(eventObj);
			}
		});

		createEventPane.add(inventoryLbl, 1, 0);
		createEventPane.setHalignment(inventoryLbl, HPos.CENTER);
		createEventPane.add(amountOfBottlesLbl, 0, 2);
		createEventPane.add(amountOfBottleTxt, 1, 2);
		createEventPane.add(costPerBottleLbl, 0, 3);
		createEventPane.add(costPerBottleTxt, 1, 3);
		createEventPane.add(numOfKegsLbl, 0, 4);
		createEventPane.add(numOfKegsTxt, 1, 4);
		createEventPane.add(costPerKegLbl, 0, 5);
		createEventPane.add(costPerKegTxt, 1, 5);

		createEventPane.add(scheduleLbl, 1, 7);
		createEventPane.setHalignment(scheduleLbl, HPos.CENTER);
		createEventPane.add(numOfBartendersLbl, 0, 9);
		createEventPane.add(numOfBartendersTxt, 1, 9);
		createEventPane.add(costPerHouseLbl, 0, 10);
		createEventPane.add(costPerHouseTxt, 1, 10);
		createEventPane.add(maintenceCrewLbl, 1, 12);
		createEventPane.setHalignment(maintenceCrewLbl, HPos.CENTER);
		createEventPane.add(numOfEmployeesLbl, 0, 14);
		createEventPane.add(numOfEmployeesTxt, 1, 14);
		createEventPane.add(costperHourMaintLbl, 0, 15);
		createEventPane.add(costperHourMaintTxt, 1, 15);
		createEventPane.add(securityLbl, 1, 17);
		createEventPane.setHalignment(securityLbl, HPos.CENTER);
		createEventPane.add(numOfBouncersLbl, 0, 19);
		createEventPane.add(numOfBouncersTxt, 1, 19);
		createEventPane.add(costPerHourBouncersLbl, 0, 20);
		createEventPane.add(costPerHourBouncersTxt, 1, 20);
		createEventPane.add(backBtn, 1, 22);
		createEventPane.setHalignment(backBtn, HPos.RIGHT);
		createEventPane.add(createEventBtn, 2, 22);

		scene = new Scene(createEventPane, 450, 670);

	}

	public static Scene getScene() {
		return scene;
	}
}
