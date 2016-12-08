package bags;

import java.util.ArrayList;

import model_for_manager.ShiftObject;

public class ScheduleList {

	private static ArrayList<ShiftObject> shift;

	public ScheduleList() {
		super();
		shift = new ArrayList<ShiftObject>();
	}

	public void addManager(ShiftObject so) {
		shift.add(so);
	}

}
