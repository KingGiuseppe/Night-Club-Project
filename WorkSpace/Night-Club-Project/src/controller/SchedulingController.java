package controller;

import Listeners.ButtonListener2;
import Listeners.ListenerMethods;
import bags.AccountBag;
import bags.CreateEventBag;
import view_for_login.Main_Window;
import view_for_manager.PaneForRemoveEvent;
import view_for_owner.SchedulingPane;

public class SchedulingController {

	public SchedulingController(AccountBag model, CreateEventBag model2, Main_Window view) {
		System.out.println("HERE 1s");
		Main_Window.getListener().setEventListener2(new ButtonListener2() {

			@Override
			public void btnClicked(int i) {
				//Scheduling
				if(i == 1) {
					SchedulingPane.setManagerList(model.getManager());
				//Remove Event
				} else if(i == 2) {
					model2.loadEvents();
					PaneForRemoveEvent.setEventsList(model2.getList());
				}
			}
			
		});
	}
}
