package view_for_owner;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model_for_manager.SchedEventObj;
import view_for_login.Main_Window;

public class ButtonsForSchedulingPane {

	private Button addToSchedBtn;
	private Button scheduleBtn;
	private Button printBtn;
	private VBox btnPane;
	private String daySelected;
	private String name;

	public ButtonsForSchedulingPane() {
		btnPane = new VBox(20);
		addToSchedBtn = new Button("Add to Schedule ");
		ScheduleFinalizePane sfp = new ScheduleFinalizePane();
		
		addToSchedBtn.setOnAction(event -> {
			if (SchedulingPane.dayList.getSelectionModel().getSelectedItem() == null || SchedulingPane.managerList.getSelectionModel().getSelectedItem() == null 
					|| SchedulingPane.shiftGroup.getSelectedToggle() == null) {
				SchedulingPaneAlert al = new SchedulingPaneAlert();
			} else {
				daySelected = SchedulingPane.dayList.getSelectionModel().getSelectedItem();
				name = SchedulingPane.managerList.getSelectionModel().getSelectedItem();
				RadioButton chk = (RadioButton) SchedulingPane.shiftGroup.getSelectedToggle();
				String shift = chk.getText();

				SchedEventObj schedObj = new SchedEventObj(name, daySelected, shift);

				if (Main_Window.getAddToSchedListener() != null) {
					Main_Window.getAddToSchedListener().addBtnClicked(schedObj);
				}
			}
			SchedulingPane.dayList.getSelectionModel().clearSelection();
			SchedulingPane.managerList.getSelectionModel().clearSelection();
			SchedulingPane.shiftGroup.getSelectedToggle().setSelected(false);
		});
		scheduleBtn = new Button("Finalize Schedule");
		scheduleBtn.setOnAction(event -> {
			sfp.showStage();
		});

		btnPane.getChildren().addAll(addToSchedBtn, scheduleBtn);
		btnPane.setAlignment(Pos.CENTER);
	}

	public Pane getPane() {
		return btnPane;
	}
}
