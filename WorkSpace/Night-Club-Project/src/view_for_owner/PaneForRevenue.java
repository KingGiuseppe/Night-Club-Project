package view_for_owner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class PaneForRevenue {

	private DatePicker calender;
	private ComboBox timePeriod;
	private ObservableList<String> options;
	private Label costDrinksLbl;
	private Label costOfFoodLbl;
	private Label costOfEntertainmentLbl;
	private Label costOfEmployeesLbl;
	private Label costOfClubLbl;
	private Label profitFromDrinksLbl;
	private Label profitFromTicketsLbl;
	private Label profitFromWalkinsLbl;
	private Label totalCostsLbl;
	private Label totalProfitLbl;
	private Label totalRevenueLbl;
	private TextField totalRevenueTxt;
	private TextField costDrinksTxt;
	private TextField costOfFoodTxt;
	private TextField costOfEntertainmentTxt;
	private TextField costOfEmployeesTxt;
	private TextField costOfClubTxt;
	private TextField profitFromDrinksTxt;
	private TextField profitFromTicketsTxt;
	private TextField profitFromWalkinsTxt;
	private TextField totalCostsTxt;
	private TextField totalProfitTxt;
	private GridPane mainPane;
	private Label topLbl;
	private Labeled directionsLbl;
	private Label directions2Lbl;
	private static Scene scene;

	public PaneForRevenue() {
		mainPane = new GridPane();
		mainPane.setHgap(10);
		mainPane.setVgap(10);
		
		calender = new DatePicker();
		options = FXCollections.observableArrayList("Tonight","Week",
			        "Month","Year");
		timePeriod = new ComboBox(options);
		
		
		
		topLbl = new Label("Revenue");
		topLbl.setFont(Font.font(50));
		directionsLbl = new Label("Please select a time span");
		directionsLbl.setFont(Font.font(20));
		directions2Lbl = new Label("Then select a day");
		directions2Lbl.setFont(Font.font(20));
		costDrinksLbl = new Label("Cost of drinks: ");
		costDrinksTxt = new TextField();
		costDrinksTxt.setEditable(false);
		costOfFoodLbl = new Label("Cost of food: ");
		costOfFoodTxt = new TextField();
		costOfFoodTxt.setEditable(false);
		costOfEntertainmentLbl = new Label("Cost of Entertainment: ");
		costOfEntertainmentTxt = new TextField();
		costOfEntertainmentTxt.setEditable(false);
		costOfEmployeesLbl = new Label("Cost of Employees");
		costOfEmployeesTxt = new TextField();
		costOfEmployeesTxt.setEditable(false);
		costOfClubLbl = new Label("Cost of rent: ");
		costOfClubTxt = new TextField();
		costOfClubTxt.setEditable(false);
		
		profitFromDrinksLbl = new Label("Profit from drinks: ");
		profitFromDrinksTxt = new TextField();
		profitFromDrinksTxt.setEditable(false);
		profitFromTicketsLbl = new Label("Profit from reservations: ");
		profitFromTicketsTxt = new TextField();
		profitFromTicketsTxt.setEditable(false);
		profitFromWalkinsLbl = new Label("Profit from walk-in customers: ");
		profitFromWalkinsTxt = new TextField();
		profitFromWalkinsTxt.setEditable(false);
		
		totalCostsLbl = new Label("Total Costs: ");
		totalCostsTxt = new TextField();
		totalCostsTxt.setEditable(false);
		totalProfitLbl = new Label("Total Profit: ");
		totalProfitTxt = new TextField();
		totalProfitTxt.setEditable(false);
		totalRevenueLbl = new Label("Total Revenue: ");
		totalRevenueTxt = new TextField();
		totalRevenueTxt.setEditable(false);
		
		mainPane.add(topLbl, 1, 0);
		
		mainPane.add(timePeriod, 2, 1);
		mainPane.setHalignment(timePeriod, HPos.RIGHT);
		mainPane.add(directionsLbl, 1, 1, 2, 1);
		mainPane.add(calender, 2, 2);
		mainPane.add(directions2Lbl, 1, 2, 2, 1);
		mainPane.add(costDrinksLbl, 1, 4);
		mainPane.add(costDrinksTxt, 2, 4);
		mainPane.add(costOfFoodLbl, 1, 5);
		mainPane.add(costOfFoodTxt, 2, 5);
		mainPane.add(costOfEntertainmentLbl, 1, 6);
		mainPane.add(costOfEntertainmentTxt, 2, 6);
		mainPane.add(costOfEmployeesLbl, 1, 7);
		mainPane.add(costOfEmployeesTxt, 2, 7);
		mainPane.add(costOfClubLbl, 1, 8);
		mainPane.add(costOfClubTxt, 2, 8);
		
		mainPane.add(profitFromDrinksLbl, 4, 4);
		mainPane.add(profitFromDrinksTxt, 5, 4);
		mainPane.add(profitFromTicketsLbl, 4, 5);
		mainPane.add(profitFromTicketsTxt, 5, 5);
		mainPane.add(profitFromWalkinsLbl, 4, 6);
		mainPane.add(profitFromWalkinsTxt, 5, 6);
		
		mainPane.add(totalCostsLbl, 1, 15);
		mainPane.add(totalCostsTxt, 2, 15);
		mainPane.add(totalProfitLbl, 1, 16);
		mainPane.add(totalProfitTxt, 2, 16);
		mainPane.add(totalRevenueLbl, 1, 17);
		mainPane.add(totalRevenueTxt, 2, 17);
		
		scene = new Scene(mainPane, 800, 450);
		
	}
	
	public static Scene getScene() {
		return scene;
	}
}
