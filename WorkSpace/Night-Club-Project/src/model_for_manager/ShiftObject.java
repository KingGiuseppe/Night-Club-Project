package model_for_manager;

import model_for_newuser.NewUser;

public class ShiftObject {

	private int day;
	private NewUser shift1;
	private NewUser shift2;
	public ShiftObject(int day, NewUser shift1, NewUser shift2) {
		super();
		this.day = day;
		this.shift1 = shift1;
		this.shift2 = shift2;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public NewUser getShift1() {
		return shift1;
	}
	public void setShift1(NewUser shift1) {
		this.shift1 = shift1;
	}
	public NewUser getShift2() {
		return shift2;
	}
	public void setShift2(NewUser shift2) {
		this.shift2 = shift2;
	}
	
	
}
