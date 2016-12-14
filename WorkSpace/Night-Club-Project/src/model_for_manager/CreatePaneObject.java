package model_for_manager;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class CreatePaneObject {

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
	private static final int nElems = 0;
	
	public CreatePaneObject(String eventName, String date, String musicType, String artist) {
		super();
		gridPane = new GridPane();
		this.eventName = eventName;
		this.date = date;
		this.musicType = musicType;
		this.artist = artist;
		setPane();
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
		dateLbl = new Label(this.date);
		musicTypeLbl = new Label(this.musicType);
		artistLbl = new Label(this.artist);
		buyBtn = new Button("Buy ticket");
		
		gridPane.add(eventNameLbl, 0, 0);
		gridPane.add(dateLbl, 1, 1);
		gridPane.add(musicTypeLbl, 0, 2);
		gridPane.add(artistLbl, 1, 2);
		gridPane.add(buyBtn, 1, 3);
	}
	
	public GridPane getPane() {
		return gridPane;
		
	}
}
