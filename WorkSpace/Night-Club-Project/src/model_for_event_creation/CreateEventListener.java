package model_for_event_creation;

import java.util.EventListener;

public interface CreateEventListener extends EventListener {
	public void createEventBtnClicked(CreateEventObject ev);
}
