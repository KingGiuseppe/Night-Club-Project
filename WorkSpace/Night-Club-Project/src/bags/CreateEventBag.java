package bags;

import java.util.ArrayList;

import javafx.scene.layout.GridPane;
import model_for_event_creation.CreateEventPaneObject;
import view_for_guest.EventsPanel;

public class CreateEventBag {
	private ArrayList<CreateEventPaneObject> panes;
	private int nElems;
	private GridPane grid;
	private CreateEventPaneObject eventObj;
	private EventsPanel eventPanel;
	
	public CreateEventBag() {
		super();
		this.panes = new ArrayList<CreateEventPaneObject>();
		this.panes.add(new CreateEventPaneObject("Test Event", "12/14/16", "Rap", "School Boy Q", "https://lh3.googleusercontent.com/-iiVNrAecRhA/AAAAAAAAAAI/AAAAAAAAABg/qF-AihkhsAc/s640/photo.jpg"));
		this.nElems = 1;
	}
	public int getNElems() {
		return nElems;
	}
	
	public void addPane(CreateEventPaneObject pane) {
		panes.add(pane);
		nElems++;
	}
	
	public ArrayList<CreateEventPaneObject> getList() {
		return this.panes;
	}
	
	
}
