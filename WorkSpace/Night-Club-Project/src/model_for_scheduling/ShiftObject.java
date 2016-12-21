package model_for_scheduling;

import model_for_newuser.NewUser;

public class ShiftObject {

	
	private String sunday, monday, tuesday;
	private String wednesday, thursday, friday, saturday;
	public ShiftObject(String sunday, String monday, String tuesday, String wednesday, String thursday,
			String friday, String saturday) {
		super();
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
	}
	
	public ShiftObject(){
		
	}
	public String getSunday() {
		return sunday;
	}
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	public String getMonday() {
		return monday;
	}
	public void setMonday(String monday) {
		this.monday = monday;
	}
	public String getTuesday() {
		return tuesday;
	}
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	public String getWednesday() {
		return wednesday;
	}
	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}
	public String getThursday() {
		return thursday;
	}
	public void setThursday(String thursday) {
		this.thursday = thursday;
	}
	public String getFriday() {
		return friday;
	}
	public void setFriday(String friday) {
		this.friday = friday;
	}
	public String getSaturday() {
		return saturday;
	}
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}

	@Override
	public String toString() {
		return "ShiftObject [sunday=" + sunday + ", monday=" + monday + ", tuesday=" + tuesday + ", wednesday="
				+ wednesday + ", thursday=" + thursday + ", friday=" + friday + ", saturday=" + saturday + "]";
	}

	
	
	
	
}