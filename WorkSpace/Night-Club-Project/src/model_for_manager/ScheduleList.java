package model_for_manager;


public class ScheduleList {

	private ShiftObject[] list;

	public ScheduleList(ShiftObject[] list) {
		super();
		list = new ShiftObject[7];
	}
	
	public void addManager(ShiftObject so) {
		if(so.getDay() == 0) {
			list[0] = so;
		} else if(so.getDay() == 1) {
			list[1] = so;
		} else if(so.getDay() == 2) {
			list[2] = so;
		} else if(so.getDay() == 3) {
			list[3] = so;
		} else if(so.getDay() == 4) {
			list[4] = so;
		} else if(so.getDay() == 5) {
			list[5] = so;
		} else if(so.getDay() == 6) {
			list[6] = so;
		} 
	}
	
	
}
