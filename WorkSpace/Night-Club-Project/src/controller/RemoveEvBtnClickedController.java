package controller;

import bags.CreateEventBag;
import model_for_removeEv.RemoveEventBtnClickedEventListener;
import view_for_login.Main_Window;
import view_for_manager.PaneForRemoveEvent;

public class RemoveEvBtnClickedController {
	
	public RemoveEvBtnClickedController(CreateEventBag model, Main_Window view) {
		view.setRemoveEventBtnClickedEventListener(new RemoveEventBtnClickedEventListener() {
			
			@Override
			public void removeEventBtnClicked() {
				model.loadEvents();
				PaneForRemoveEvent.setEventsList(model.getList());
			}
		});
	}
}
