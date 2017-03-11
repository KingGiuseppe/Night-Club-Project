package controller;

import bags.CreateEventBag;
import model_for_event_creation.CreateEventListener;
import model_for_event_creation.CreateEventObject;
import model_for_event_creation.CreateEventPaneObject;
import view_for_login.Main_Window;

public class CreateEventController {

	public CreateEventController(CreateEventBag model, Main_Window view) {
		view.setCreateEventListener(new CreateEventListener() {

			@Override
			public void createEventBtnClicked(CreateEventObject ev) {

				model.loadEvents();

				model.addPane(new CreateEventPaneObject(ev.getEventName(), ev.getDate(), ev.getGenre(), ev.getArtist(),
						ev.getPictureLink()));

				model.saveToFile();

			}

		});
	}

}
