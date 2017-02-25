package controller;

import Listeners.ButtonListener2;
import bags.AccountBag;
import view_for_login.Main_Window;
import view_for_owner.ScheduleFinalizePane;
import view_for_owner.SchedulingPane;

public class SchedulingController {

	public SchedulingController(AccountBag model, Main_Window view) {
		view.setEventListener2(new ButtonListener2() {

			@Override
			public void btnClicked() {
				SchedulingPane.setManagerList(model.getManager());
			}
			
		});
	}
}
