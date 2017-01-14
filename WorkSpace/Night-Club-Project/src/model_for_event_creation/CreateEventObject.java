package model_for_event_creation;

import java.io.Serializable;
import java.util.EventObject;

public class CreateEventObject extends EventObject implements Serializable{

	private String eventName;
	private String date;
	private String genre;
	private String artist;
	private String pictureLink;

	public CreateEventObject(Object arg0) {
		super(arg0);
	}

	public CreateEventObject(Object source, String eventName, String date, String genre, String artist,
			String pictureLink) {
		super(source);
		this.eventName = eventName;
		this.date = date;
		this.genre = genre;
		this.artist = artist;
		this.pictureLink = pictureLink;
	}

	public String getEventName() {
		return eventName;
	}

	public String getDate() {
		return date;
	}

	public String getGenre() {
		return genre;
	}

	public String getArtist() {
		return artist;
	}

	public String getPictureLink() {
		return pictureLink;
	}

}
