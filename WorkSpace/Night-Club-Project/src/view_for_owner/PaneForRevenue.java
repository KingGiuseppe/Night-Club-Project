package view_for_owner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

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
	private static Scene scene;

	public PaneForRevenue() {
		mainPane = new GridPane();
		mainPane.setHgap(10);
		mainPane.setVgap(10);
		
		calender = new DatePicker();
		options = FXCollections.observableArrayList("Tonight","Week",
			        "Month","Year");
		timePeriod = new ComboBox(options);
		
		costDrinksLbl = new Label("Cost of drinks: ");
		costDrinksTxt = new TextField();
		costOfFoodLbl = new Label("Cost of food: ");
		costOfFoodTxt = new TextField();
		costOfEntertainmentLbl = new Label("Cost of Entertainment: ");
		costOfEntertainmentTxt = new TextField();
		costOfEmployeesLbl = new Label("Cost of Employees");
		costOfEmployeesTxt = new TextField();
		costOfClubLbl = new Label("Cost of rent: ");
		costOfClubTxt = new TextField();
		
		profitFromDrinksLbl = new Label("Profit from drinks: ");
		profitFromDrinksTxt = new TextField();
		profitFromTicketsLbl = new Label("Profit from reservations: ");
		profitFromTicketsTxt = new TextField();
		profitFromWalkinsLbl = new Label("Profit from walk-in customers: ");
		profitFromWalkinsTxt = new TextField();
		
		totalCostsLbl = new Label("Total Costs: ");
		totalCostsTxt = new TextField();
		totalProfitLbl = new Label("Total Profit: ");
		totalProfitTxt = new TextField();
		totalRevenueLbl = new Label("Total Revenue: ");
		totalRevenueTxt = new TextField();
		
		
		mainPane.add(timePeriod, 1, 1);
		mainPane.add(calender, 1, 2);
		mainPane.add(costDrinksLbl, 1, 3);
		mainPane.add(costDrinksTxt, 2, 3);
		mainPane.add(costOfFoodLbl, 1, 4);
		mainPane.add(costOfFoodTxt, 2, 4);
		mainPane.add(costOfEntertainmentLbl, 1, 5);
		mainPane.add(costOfEntertainmentTxt, 2, 5);
		mainPane.add(costOfEmployeesLbl, 1, 6);
		mainPane.add(costOfEmployeesTxt, 2, 6);
		mainPane.add(costOfClubLbl, 1, 7);
		mainPane.add(costOfClubTxt, 2, 7);
		
		mainPane.add(profitFromDrinksLbl, 4, 3);
		mainPane.add(profitFromDrinksTxt, 5, 3);
		mainPane.add(profitFromTicketsLbl, 4, 4);
		mainPane.add(profitFromTicketsTxt, 5, 4);
		mainPane.add(profitFromWalkinsLbl, 4, 5);
		mainPane.add(profitFromWalkinsTxt, 5, 5);
		
		mainPane.add(totalCostsLbl, 1, 14);
		mainPane.add(totalCostsTxt, 2, 14);
		mainPane.add(totalProfitLbl, 1, 15);
		mainPane.add(totalProfitTxt, 2, 15);
		mainPane.add(totalRevenueLbl, 1, 16);
		mainPane.add(totalRevenueTxt, 2, 16);
		
		
		scene = new Scene(mainPane, 800, 450);
		
	}
	
	public static Scene getScene() {
		return scene;
	}
}
