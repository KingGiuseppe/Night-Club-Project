package bags;

import java.util.ArrayList;

import model_for_manager.ShiftObject;

public class ScheduleList {

	private static ArrayList<ShiftObject> shift1;
	private static ArrayList<ShiftObject> shift2;

	public ScheduleList() {
		super();
		shift1 = new ArrayList<ShiftObject>();
		shift1.add(new ShiftObject(0, ))
		shift2 = new ArrayList<ShiftObject>();
	}

	public void addManager(ShiftObject so, int shift) {
		if (shift == 1) {
			if (so.getDay() == 0) {
				shift1.set(0, so);
			} else if (so.getDay() == 1) {
				shift1.set(0, so);
			} else if (so.getDay() == 2) {
				shift1.set(0, so);
			} else if (so.getDay() == 3) {
				shift1.set(0, so);
			} else if (so.getDay() == 4) {
				shift1.set(0, so);
			} else if (so.getDay() == 5) {
				shift1.set(0, so);
			} else if (so.getDay() == 6) {
				shift1.set(0, so);
			}
		} else if (shift == 2) {
			if (so.getDay() == 0) {
				shift2.set(0, so);
			} else if (so.getDay() == 1) {
				shift2.set(0, so);
			} else if (so.getDay() == 2) {
				shift2.set(0, so);
			} else if (so.getDay() == 3) {
				shift2.set(0, so);
			} else if (so.getDay() == 4) {
				shift2.set(0, so);
			} else if (so.getDay() == 5) {
				shift2.set(0, so);
			} else if (so.getDay() == 6) {
				shift2.set(0, so);
			}
		}
	}

}
