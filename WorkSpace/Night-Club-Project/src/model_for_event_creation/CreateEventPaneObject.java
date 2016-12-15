package model_for_event_creation;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class CreateEventPaneObject {

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
	private Image image;
	private ImageView imageView;
	private String pictureLink;
	private static final int nElems = 0;
	
	public CreateEventPaneObject(String eventName, String date, String musicType, String artist, String pictureLink) {
		super();
		gridPane = new GridPane();
		this.eventName = eventName;
		this.date = date;
		this.musicType = musicType;
		this.artist = artist;
		this.pictureLink = pictureLink;
		setPane();
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
	
	public void setPane(){
		eventNameLbl = new Label(this.eventName);
		eventNameLbl.setFont(Font.font(30));
		date1Lbl = new Label("Date: ");
		date1Lbl.setFont(Font.font(15));
		dateLbl = new Label(this.date);
		dateLbl.setFont(Font.font(15));
		musicLbl = new Label("Genre: ");
		musicLbl.setFont(Font.font(20));
		musicTypeLbl = new Label(this.musicType);
		musicTypeLbl.setFont(Font.font(20));
		artistLbl = new Label(this.artist);
		artist1Lbl = new Label("Artist: ");
		artist1Lbl.setFont(Font.font(20));
		artistLbl.setFont(Font.font(20));
		
		pictureLbl = new Label(" ");
		imageView = ImageViewBuilder.create().image(new Image(this.pictureLink, 100, 100, false, false)).build();       
		pictureLbl.setGraphic(imageView);
		
		buyBtn = new Button("Buy ticket");
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
	}
	
	public GridPane getPane() {
		return gridPane;
		
	}
}
