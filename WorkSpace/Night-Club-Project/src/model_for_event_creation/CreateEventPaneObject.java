package model_for_event_creation;

import java.io.Serializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CreateEventPaneObject implements Serializable {

	public String eventName;
	public String date;
	public String musicType;
	public String artist;
	private GridPane gridPane;
	private Label eventNameLbl;
	private Label dateLbl;
	private Label musicTypeLbl;
	private Label artistLbl;
	private Button buyBtn;
	private Label date1Lbl;
	private Label musicLbl;
	private Label artist1Lbl;
	private Label pictureLbl;
	private ImageView imageView;
	private String pictureLink;

	public CreateEventPaneObject(String eventName, String date, String musicType, String artist, String pictureLink) {
		super();
		this.eventName = eventName;
		this.date = date;
		this.musicType = musicType;
		this.artist = artist;
		this.pictureLink = pictureLink;
	}

	public String getPictureLink() {
		return pictureLink;
	}

	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMusicType() {
		return musicType;
	}

	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setPane() {
		gridPane = new GridPane();
		eventNameLbl = new Label(this.eventName);
		eventNameLbl.setFont(new Font("Arial Rounded MT Bold", 30));
		eventNameLbl.setTextFill(Color.web("#ffffff"));
		date1Lbl = new Label("Date: ");
		date1Lbl.setFont(new Font("Arial Rounded MT Bold", 15));
		date1Lbl.setTextFill(Color.web("#ffffff"));
		dateLbl = new Label(this.date);
		dateLbl.setFont(new Font("Arial Rounded MT Bold", 15));
		dateLbl.setTextFill(Color.web("#ffffff"));
		musicLbl = new Label("Genre: ");
		musicLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		musicLbl.setTextFill(Color.web("#ffffff"));
		musicTypeLbl = new Label(this.musicType);
		musicTypeLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		musicTypeLbl.setTextFill(Color.web("#ffffff"));
		artistLbl = new Label(this.artist);
		artist1Lbl = new Label("Artist: ");
		artistLbl.setTextFill(Color.web("#ffffff"));
		artist1Lbl.setFont(new Font("Arial Rounded MT Bold", 20));
		artistLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		artist1Lbl.setTextFill(Color.web("#ffffff"));
		
		pictureLbl = new Label(" ");
		imageView = ImageViewBuilder.create().image(new Image(this.pictureLink, 100, 100, false, false)).build();
		pictureLbl.setGraphic(imageView);

		buyBtn = new Button("Buy ticket");
		buyBtn.setFont(new Font("Arial Rounded MT Bold", 15));
		buyBtn.setOnAction(event -> {
			System.out.println(this.eventName);
		});

		gridPane.add(eventNameLbl, 0, 0);
		gridPane.add(date1Lbl, 0, 1);
		gridPane.add(dateLbl, 1, 1);
		gridPane.add(musicLbl, 0, 2);
		gridPane.add(musicTypeLbl, 1, 2);
		gridPane.add(artist1Lbl, 0, 3);
		gridPane.add(artistLbl, 1, 3);
		gridPane.add(pictureLbl, 2, 1);
		gridPane.add(buyBtn, 2, 4);
		
		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"https://s-media-cache-ak0.pinimg.com/736x/c6/f7/c3/c6f7c319f0b8cba722d7d796e1f83bb4.jpg",
						360, 640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		gridPane.setBackground(new Background(myBI));
	}

	public GridPane getPane() {
		return gridPane;

	}
}
