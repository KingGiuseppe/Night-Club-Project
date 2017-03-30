package listener;

import java.util.EventListener;
import java.util.EventObject;

public interface ButtonListener extends EventListener {
	public void btnClicked(EventObject ev);
}


