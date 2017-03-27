package listener;

import java.util.EventListener;
import java.util.EventObject;

import model_for_scheduling.SchedEventObj;

public interface ButtonListener extends EventListener {
	public void btnClicked(EventObject ev);
}


