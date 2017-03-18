package model_for_removeEv;

import java.io.Serializable;

public class RemoveEventObj implements Serializable {

	private String eventName;

	public RemoveEventObj(String eventName) {
		super();
		this.eventName = eventName;
	}

	public RemoveEventObj() {
	}

	public String getEventName() {
		return eventName;
	}
}
