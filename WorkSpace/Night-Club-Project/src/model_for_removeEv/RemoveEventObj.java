package model_for_removeEv;

import java.io.Serializable;
import java.util.EventObject;

public class RemoveEventObj extends EventObject implements Serializable {

	private String eventName;

	public RemoveEventObj(Object source, String eventName) {
		super(source);
		this.eventName = eventName;
	}

	public RemoveEventObj(Object source) {
		super(source);
	}

	public String getEventName() {
		return eventName;
	}
}
