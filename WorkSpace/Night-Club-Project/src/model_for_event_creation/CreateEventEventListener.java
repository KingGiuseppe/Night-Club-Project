package model_for_event_creation;

import java.util.EventListener;

public interface CreateEventEventListener extends EventListener {
	public void createEventBtnClicked(CreateEventObject ev);
}
