package controller;

import bags.CreateEventBag;
import javafx.scene.layout.GridPane;
import model_for_event_creation.CreateEventEventListener;
import model_for_event_creation.CreateEventObject;
import model_for_event_creation.CreateEventPaneObject;
import view_for_guest.EventsPanel;
import view_for_login.Main_Window;

public class CreateEventController {


	public CreateEventController(CreateEventBag model, Main_Window view) {
		view.setCreateEventListener(new CreateEventEventListener() {

			@Override
			public void createEventBtnClicked(CreateEventObject ev) {
				
				model.loadEvents();
				
				model.addPane(new CreateEventPaneObject(ev.getEventName(), ev.getDate(),
						ev.getGenre(), ev.getArtist(), ev.getPictureLink()));
				
				model.saveToFile();
				
			}
			
		});
	}
	
}
