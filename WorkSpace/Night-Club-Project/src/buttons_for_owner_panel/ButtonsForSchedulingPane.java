package buttons_for_owner_panel;

import alerts.SchedulingPaneAlert;
import bags.ScheduleList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model_for_scheduling.SchedEventObj;
import view_for_login.Main_Window;
import view_for_owner.ScheduleFinalizePane;
import view_for_owner.SchedulingPane;
import view_for_owner.TableViewForSchedulingPane;

public class ButtonsForSchedulingPane {

	private Button addToSchedBtn;
	private Button scheduleBtn;
	private VBox btnPane;
	private String daySelected;
	private String name;

	public ButtonsForSchedulingPane() {
		btnPane = new VBox(20);
		addToSchedBtn = new Button("Add to Schedule ");
		ScheduleFinalizePane sfp = new ScheduleFinalizePane();
		TableViewForSchedulingPane tvsp = new TableViewForSchedulingPane();
		addToSchedBtn.setOnAction(event -> {
			if (SchedulingPane.getDayList().getSelectionModel().getSelectedItem() == null
					|| SchedulingPane.getManagerList().getSelectionModel().getSelectedItem() == null
					|| SchedulingPane.getShiftGroup().getSelectedToggle() == null) {
				SchedulingPaneAlert al = new SchedulingPaneAlert();
			} else {
				daySelected = SchedulingPane.getDayList().getSelectionModel().getSelectedItem();
				name = SchedulingPane.getManagerList().getSelectionModel().getSelectedItem();
				RadioButton chk = (RadioButton) SchedulingPane.getShiftGroup().getSelectedToggle();
				String shift = chk.getText();
				SchedEventObj schedObj = new SchedEventObj(name, daySelected, shift);
				if (Main_Window.getAddToSchedListener() != null) {
					Main_Window.getAddToSchedListener().addBtnClicked(schedObj);
				}
				SchedulingPane.getDayList().getSelectionModel().clearSelection();
				SchedulingPane.getManagerList().getSelectionModel().clearSelection();
				SchedulingPane.getShiftGroup().getSelectedToggle().setSelected(false);
			}

		});
		scheduleBtn = new Button("Finalize Schedule");
		scheduleBtn.setOnAction(event -> {
			ScheduleList sl = new ScheduleList();
			sl.loadEvents();
			sfp.setShiftListView(sl.getShift());
			sfp.showStage();

		});

		btnPane.getChildren().addAll(addToSchedBtn, scheduleBtn);
		btnPane.setAlignment(Pos.CENTER);
	}

	public Pane getPane() {
		return btnPane;
	}
}
