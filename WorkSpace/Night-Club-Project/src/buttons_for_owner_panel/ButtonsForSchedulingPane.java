package buttons_for_owner_panel;

import java.util.EventObject;

import alerts.SchedulingPaneAlert;
import bags.ScheduleList;
import controller.AddToSchedController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import model_for_scheduling.SchedEventObj;
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
		addToSchedBtn.setFont(new Font("Arial Rounded MT Bold", 15));
		ScheduleFinalizePane sfp = new ScheduleFinalizePane();
		TableViewForSchedulingPane tvsp = new TableViewForSchedulingPane();
		addToSchedBtn.setOnAction(event -> {
			if (SchedulingPane.getDayList().getSelectionModel().getSelectedItem() == null
					|| SchedulingPane.getManagerList().getSelectionModel().getSelectedItem() == null
					|| SchedulingPane.getShiftGroup().getSelectedToggle() == null) {
				SchedulingPaneAlert al = new SchedulingPaneAlert();
			} else {
				AddToSchedController addSched = new AddToSchedController(new ScheduleList(), new ButtonEventListenerMethods());
				daySelected = SchedulingPane.getDayList().getSelectionModel().getSelectedItem();
				name = SchedulingPane.getManagerList().getSelectionModel().getSelectedItem();
				RadioButton chk = (RadioButton) SchedulingPane.getShiftGroup().getSelectedToggle();
				String shift = chk.getText();
				SchedEventObj schedObj = new SchedEventObj(this, name, daySelected, shift);
				if(ButtonEventListenerMethods.getButtonListener() != null) {
					ButtonEventListenerMethods.getButtonListener().btnClicked(schedObj);
				}
				
				SchedulingPane.getDayList().getSelectionModel().clearSelection();
				SchedulingPane.getManagerList().getSelectionModel().clearSelection();
				SchedulingPane.getShiftGroup().getSelectedToggle().setSelected(false);
			}

		});
		scheduleBtn = new Button("Finalize Schedule");
		scheduleBtn.setFont(new Font("Arial Rounded MT Bold", 15));
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
