package controller;

import bags.CreateEventBag;
import javafx.scene.layout.GridPane;
import model_for_event_creation.CreateEventEventListener;
import model_for_event_creation.CreateEventObject;
import model_for_event_creation.CreateEventPaneObject;
import view_for_guest.EventsPanel;
import view_for_login.Main_Window;

public class CreateEventController {

	private GridPane grid;

	public CreateEventController(CreateEventBag model, Main_Window view) {
		view.setCreateEventListener(new CreateEventEventListener() {

			private GridPane grid;
			private EventsPanel eventPanel;	
			@Override
			public void createEventBtnClicked(CreateEventObject ev) {
				CreateEventPaneObject eventObj = new CreateEventPaneObject(ev.getEventName(), ev.getDate(),
						ev.getGenre(), ev.getArtist());
				
				model.addPane(eventObj);
				
			}
			
		});
	}
	
}
