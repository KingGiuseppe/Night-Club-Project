package view_for_manager;

import java.time.format.DateTimeFormatter;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
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
	private static TextField eventNameTxt;
	private static DatePicker date;
	private static TextField costForNightTxt;
	private static TextField artistNameTxt;
	private static TextField musicGenreTxt;
	private static TextField numOfDancersTxt;
	private static TextField dancersCostPerDancerTxt;
	private Button backBtn;
	private Button nextBtn;
	private Label pictureLbl;
	private static TextField pictureTxt;
	private static Scene scene;

	public PaneForCreateEvent1() {
		entertainmentPane = new GridPane();
		entertainmentPane.setHgap(10);
		entertainmentPane.setVgap(10);
		entertainmentPane.setPadding(new Insets(20, 20, 20, 20));

		createEventLbl = new Label("Create Event");
		createEventLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		eventNameLbl = new Label("Event Name");
		eventNameLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		eventNameTxt = new TextField();
		dateLbl = new Label("Date");
		dateLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		date = new DatePicker();

		entertainmentLbl = new Label("Entertainment");
		entertainmentLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		musicGenreLbl = new Label("Music genre");
		musicGenreLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		musicGenreTxt = new TextField();
		artistNameLbl = new Label("Artist");
		artistNameLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		artistNameTxt = new TextField();
		costForNightLbl = new Label("Cost for the night");
		costForNightLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		costForNightTxt = new TextField();

		dancersLbl = new Label("Dancers");
		dancersLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		numOfDancersLbl = new Label("Number of dancers");
		numOfDancersLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		numOfDancersTxt = new TextField();
		dancersCostPerDancerLbl = new Label("Cost per dancer");
		dancersCostPerDancerLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		dancersCostPerDancerTxt = new TextField();

		backBtn = new Button("Go back");
		backBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		backBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(ManagerPane.getScene());
		});
		
		nextBtn = new Button("Next");
		nextBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		nextBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(PaneForCreateEvent2.getScene());
		});
		
		pictureLbl = new Label("Picture link");
		pictureLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		pictureTxt = new TextField();

		entertainmentPane.add(createEventLbl, 1, 0);
		entertainmentPane.setHalignment(createEventLbl, HPos.CENTER);
		entertainmentPane.add(eventNameLbl, 0, 2);
		entertainmentPane.add(eventNameTxt, 1, 2);
		entertainmentPane.add(dateLbl, 0, 3);
		entertainmentPane.add(date, 1, 3);
		entertainmentPane.add(entertainmentLbl, 1, 5);
		entertainmentPane.setHalignment(entertainmentLbl, HPos.CENTER);
		entertainmentPane.add(musicGenreLbl, 0, 6);
		entertainmentPane.add(musicGenreTxt, 1, 6);
		entertainmentPane.add(artistNameLbl, 0, 7);
		entertainmentPane.add(artistNameTxt, 1, 7);
		entertainmentPane.add(pictureLbl, 0, 8);
		entertainmentPane.add(pictureTxt, 1, 8);
		entertainmentPane.add(costForNightLbl, 0, 9);
		entertainmentPane.add(costForNightTxt, 1, 9);
		entertainmentPane.add(dancersLbl, 1, 11);
		entertainmentPane.setHalignment(dancersLbl, HPos.CENTER);
		entertainmentPane.add(numOfDancersLbl, 0, 12);
		entertainmentPane.add(numOfDancersTxt, 1, 12);
		entertainmentPane.add(dancersCostPerDancerLbl, 0, 13);
		entertainmentPane.add(dancersCostPerDancerTxt, 1, 13);
		entertainmentPane.add(backBtn, 1, 14);
		entertainmentPane.setHalignment(backBtn, HPos.RIGHT);
		entertainmentPane.add(nextBtn, 2, 14);
		BackgroundImage myBI = new BackgroundImage(
				new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqfa9vQe4zD00N-ajy-RADGBTA15bthYnwKl3U9M7H5E7OWlVo", 550,
						450, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		entertainmentPane.setBackground(new Background(myBI));
		scene = new Scene(entertainmentPane, 410, 550);

	}

	public static Scene getScene() {
		return scene;
	}

	public static String getEventName() {
		return eventNameTxt.getText();
	}

	public static String getDate() {
		return date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	public static String getGenre() {
		return musicGenreTxt.getText();
	}

	public static String getArtist() {
		return artistNameTxt.getText();
	}

	public static String getImageUrl() {
		return pictureTxt.getText();
	}

	public static String getcostForNight() {
		return costForNightTxt.getText();
	}

	public static String getNumOfDancers() {
		return numOfDancersTxt.getText();
	}

	public static String getCostPerDancer() {
		return dancersCostPerDancerTxt.getText();
	}

}
