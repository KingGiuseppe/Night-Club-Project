package model_for_manager;

import java.util.EventListener;

public interface AddToScheduleEventListener extends EventListener {
	public void addBtnClicked(SchedEventObj ev);
}
