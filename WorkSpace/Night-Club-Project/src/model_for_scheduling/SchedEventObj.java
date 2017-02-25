package model_for_scheduling;

import java.util.EventObject;

public class SchedEventObj {

	private String name;
	private String day;
	private String shift;
	
	public SchedEventObj(String name, String day, String shift) {
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
