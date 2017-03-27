package model_for_scheduling;

import java.util.EventObject;

public class SchedEventObj extends EventObject{

	private String name;
	private String day;
	private String shift;

	public SchedEventObj(Object source, String name, String day, String shift) {
		super(source);
		this.name = name;
		this.day = day;
		this.shift = shift;
	}

	public String getName() {
		return name;
	}

	public String getDay() {
		return day;
	}

	public String getShift() {
		return shift;
	}

}
