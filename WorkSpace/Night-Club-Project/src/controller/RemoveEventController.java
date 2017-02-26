package controller;

import bags.CreateEventBag;
import model_for_removeEv.RemoveEvEventListener;
import model_for_removeEv.RemoveEventObj;
import view_for_login.Main_Window;

public class RemoveEventController {

	public RemoveEventController(CreateEventBag model, Main_Window view) {
		view.setRemoveEventListener(new RemoveEvEventListener() {

			@Override
			public void removeEvBtnClicked(RemoveEventObj ev) {
				model.loadEvents();
				model.removeEvent(ev.getEventName());
				model.saveToFile();
			}

		});
	}
}
