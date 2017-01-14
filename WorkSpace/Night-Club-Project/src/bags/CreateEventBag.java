package bags;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.layout.GridPane;
import model_for_event_creation.CreateEventPaneObject;
import view_for_guest.EventsPanel;

public class CreateEventBag implements Serializable {
	private ArrayList<CreateEventPaneObject> panes;
	private int nElems;
	private GridPane grid;
	private CreateEventPaneObject eventObj;
	private EventsPanel eventPanel;

	public CreateEventBag() {
		super();
		this.panes = new ArrayList<CreateEventPaneObject>();
		this.panes.add(new CreateEventPaneObject("Rap Event", "5/12/17", "Rap", "SchoolBoy Q",
				"https://lh3.googleusercontent.com/-bzohT0mKNRw/UWTBpyoTZbI/AAAAAAAAABg/HmI63n_Pbv8/w800-h800/photo.jpg"));
		this.panes.add(new CreateEventPaneObject("Reggae Event", "2/25/17", "Ska", "Sublime",
				"https://s-media-cache-ak0.pinimg.com/originals/f6/e0/5d/f6e05d52b1740eed6c498a1f9145beb6.jpg"));
		// this.panes.add(new CreateEventPaneObject("Rap Event", "3/14/17",
		// "Rap", "J. Cole",
		// "https://s-media-cache-ak0.pinimg.com/originals/1d/d1/93/1dd193e12c5a639bedf2261f2b3946c4.jpg"));
		// this.panes.add(new CreateEventPaneObject("Summer Event", "8/3/17",
		// "Mixed Genres", "Mixed Artists",
		// "https://0.s3.envato.com/files/100198493/Summer-Music-Event-InlinePreview-590x300.jpg"));
	}

	public int getNElems() {
		return panes.size();
	}

	public void addPane(CreateEventPaneObject pane) {
		System.out.println(panes.size());
		this.panes.add(pane);
		System.out.println("Added to event bag! " + panes.size());
	}

	public ArrayList<CreateEventPaneObject> getList() {
		return this.panes;
	}

	public void saveToFile() {
		 ObjectOutputStream outputStream = null;
	        try {
	            outputStream = new ObjectOutputStream(new FileOutputStream("EventsList.dat"));
	            outputStream.writeObject(new CreateEventPaneObject("Reggae Event", "2/25/17", "Ska", "Sublime",
	    				"https://s-media-cache-ak0.pinimg.com/originals/f6/e0/5d/f6e05d52b1740eed6c498a1f9145beb6.jpg"));
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (outputStream != null) {
	                    outputStream.flush();
	                    outputStream.close();
	                }
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	}

}
