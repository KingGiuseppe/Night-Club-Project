package controller;

import bags.ScheduleList;
import model_for_scheduling.AddToScheduleEventListener;
import model_for_scheduling.SchedEventObj;
import model_for_scheduling.SchedulingEventListener;
import view_for_login.Main_Window;
import view_for_owner.ScheduleFinalizePane;
import view_for_owner.TableViewForSchedulingPane;

public class AddToSchedController {

	public AddToSchedController(ScheduleList model, Main_Window view) {
		view.setAddToSchedListener(new AddToScheduleEventListener() {

			@Override
			public void addBtnClicked(SchedEventObj ev) {
				if (ev.getShift().equals("Shift 1")) {
					if (ev.getDay().equals("Sunday")) {
						model.getIndex(0).setSunday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Monday")) {
						model.getIndex(0).setMonday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Tuesday")) {
						model.getIndex(0).setTuesday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Wednesday")) {
						model.getIndex(0).setWednesday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Thursday")) {
						model.getIndex(0).setThursday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Friday")) {
						model.getIndex(0).setFriday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Saturday")) {
						model.getIndex(0).setSaturday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} 
				} else if (ev.getShift().equals("Shift 2")) {
					if (ev.getDay().equals("Sunday")) {
						model.getIndex(1).setSunday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Monday")) {
						model.getIndex(1).setMonday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Tuesday")) {
						model.getIndex(1).setTuesday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Wednesday")) {
						model.getIndex(1).setWednesday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Thursday")) {
						model.getIndex(1).setThursday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Friday")) {
						model.getIndex(1).setFriday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (ev.getDay().equals("Saturday")) {
						model.getIndex(1).setSaturday(ev.getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} 
				}
			}

		});
	}
}
