package view_for_manager;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class PaneForCreateEvent1 {

	private GridPane entertainmentPane;
	private Label createEventLbl;
	private Label eventNameLbl;
	private Label dateLbl;
	private Label entertainmentLbl;
	private Label musicGenreLbl;
	private Label artistNameLbl;
	private Label costForNightLbl;
	private Label dancersLbl;
	private Label numOfDancersLbl;
	private Label dancersCostPerDancerLbl;
	private TextField eventNameTxt;
	private DatePicker date;
	private TextField costForNightTxt;
	private TextField artistNameTxt;
	private TextField musicGenreTxt;
	private TextField numOfDancersTxt;
	private TextField dancersCostPerDancerTxt;
	private Button backBtn;
	private Button nextBtn;
	private static Scene scene;

	public PaneForCreateEvent1() {
		PaneForCreateEvent2 p2 = new PaneForCreateEvent2();
		entertainmentPane = new GridPane();
		entertainmentPane.setHgap(10);
		entertainmentPane.setVgap(10);
		entertainmentPane.setPadding(new Insets(20, 20, 20, 20));
		
		createEventLbl = new Label("Create Event");
		createEventLbl.setFont(Font.font(20));
		eventNameLbl = new Label("Event Name");
		eventNameTxt = new TextField();
		dateLbl = new Label("Date");
		date = new DatePicker();
		
		entertainmentLbl = new Label("Entertainment");
		entertainmentLbl.setFont(Font.font(20));
		musicGenreLbl = new Label("Music genre");
		musicGenreTxt = new TextField();
		artistNameLbl = new Label("Artist");
		artistNameTxt = new TextField();
		costForNightLbl = new Label("Cost for the night");
		costForNightTxt = new TextField();
		
		dancersLbl = new Label("Dancers");
		dancersLbl.setFont(Font.font(20));
		numOfDancersLbl = new Label("Number of dancers");
		numOfDancersTxt = new TextField();
		dancersCostPerDancerLbl = new Label("Cost per dancer");
		dancersCostPerDancerTxt = new TextField();
		
		backBtn = new Button("Go back");
		backBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(ManagerPane.getScene());
		});
		nextBtn = new Button("Next");
		nextBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(PaneForCreateEvent2.getScene());
		});
		
		entertainmentPane.add(createEventLbl, 1, 0);
		entertainmentPane.setHalignment(createEventLbl, HPos.CENTER);
		entertainmentPane.add(eventNameLbl, 0,	2);
		entertainmentPane.add(eventNameTxt, 1, 2);
		entertainmentPane.add(dateLbl, 0, 3);
		entertainmentPane.add(date, 1, 3);
		entertainmentPane.add(entertainmentLbl, 1, 5);
		entertainmentPane.setHalignment(entertainmentLbl, HPos.CENTER);
		entertainmentPane.add(musicGenreLbl, 0, 6);
		entertainmentPane.add(musicGenreTxt, 1, 6);
		entertainmentPane.add(artistNameLbl, 0, 7);
		entertainmentPane.add(artistNameTxt, 1, 7);
		entertainmentPane.add(costForNightLbl, 0, 8);
		entertainmentPane.add(costForNightTxt, 1, 8);
		entertainmentPane.add(dancersLbl, 1, 10);
		entertainmentPane.setHalignment(dancersLbl, HPos.CENTER);
		entertainmentPane.add(numOfDancersLbl, 0, 11);
		entertainmentPane.add(numOfDancersTxt, 1, 11);
		entertainmentPane.add(dancersCostPerDancerLbl, 0, 12);
		entertainmentPane.add(dancersCostPerDancerTxt, 1, 12);
		entertainmentPane.add(backBtn, 3, 13);
		entertainmentPane.add(nextBtn, 4, 13);
		
		scene = new Scene(entertainmentPane, 500, 500);
		
	}
	public static Scene getScene() {
		return scene;
	}
	
}
