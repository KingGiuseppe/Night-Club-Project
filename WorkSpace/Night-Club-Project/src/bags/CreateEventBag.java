package bags;

import java.util.ArrayList;

import model_for_manager.CreatePaneObject;

public class CreateEventBag {
	private ArrayList<CreatePaneObject> panes;
	private int nElems;
	
	public CreateEventBag() {
		super();
		this.panes = new ArrayList<CreatePaneObject>();
		this.panes.add(new CreatePaneObject("Test Event", "12/14/16", "Rap", "School Boy Q"));
		this.nElems = 0;
	}
	public int getNElems() {
		return nElems;
	}
	
	public void addPane(CreatePaneObject pane) {
		panes.add(pane);
	}
	
	public ArrayList<CreatePaneObject> getList() {
		return panes;
	}
	
	
}
