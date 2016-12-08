package controller;

import bags.AccountBag;
import model_for_manager.SchedulingEventListener;
import view_for_login.Main_Window;
import view_for_owner.SchedulingPane;

public class SchedulingController {

	public SchedulingController(AccountBag model, Main_Window view) {
		view.setSchedulingListener(new SchedulingEventListener() {

			@Override
			public void scheduleBtnClicked() {
				SchedulingPane.setManagerList(model.getManager());
			}
			
		});
	}
}
