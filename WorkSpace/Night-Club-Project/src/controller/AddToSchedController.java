package controller;

import java.util.EventObject;

import bags.ScheduleList;
import listener.ButtonListener;
import listener.ButtonEventListenerMethods;
import model_for_scheduling.SchedEventObj;
import view_for_owner.TableViewForSchedulingPane;

public class AddToSchedController {

	public AddToSchedController(ScheduleList model, ButtonEventListenerMethods listener) {
		listener.setEventListener(new ButtonListener() {

			@Override
			public void btnClicked(EventObject eve) {
				SchedEventObj ev = (SchedEventObj) eve.getSource();
				if (((SchedEventObj) ev).getShift().equals("Shift 1")) {
					if (((SchedEventObj) ev).getDay().equals("Sunday")) {
						model.getIndex(0).setSunday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Monday")) {
						model.getIndex(0).setMonday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Tuesday")) {
						model.getIndex(0).setTuesday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Wednesday")) {
						model.getIndex(0).setWednesday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Thursday")) {
						model.getIndex(0).setThursday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Friday")) {
						model.getIndex(0).setFriday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Saturday")) {
						model.getIndex(0).setSaturday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					}
				} else if (((SchedEventObj) ev).getShift().equals("Shift 2")) {
					if (((SchedEventObj) ev).getDay().equals("Sunday")) {
						model.getIndex(1).setSunday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Monday")) {
						model.getIndex(1).setMonday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Tuesday")) {
						model.getIndex(1).setTuesday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Wednesday")) {
						model.getIndex(1).setWednesday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Thursday")) {
						model.getIndex(1).setThursday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Friday")) {
						model.getIndex(1).setFriday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					} else if (((SchedEventObj) ev).getDay().equals("Saturday")) {
						model.getIndex(1).setSaturday(((SchedEventObj) ev).getName());
						TableViewForSchedulingPane.setShiftListView(model.getShift());
						model.saveToFile();
					}
				}
			}

		});
	}
}
