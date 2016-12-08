package view_for_owner;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ButtonsForSchedulingPane {

	private Button addToSchedBtn;
	private Button scheduleBtn;
	private Button printBtn;
	private VBox btnPane;

	public ButtonsForSchedulingPane() {
		btnPane = new VBox();
		addToSchedBtn = new Button("Add to Schedule");
		addToSchedBtn.setOnAction(event -> {
			
		});
		scheduleBtn = new Button("Finalize Schedule");
		scheduleBtn.setVisible(false);
		printBtn = new Button("Print Schedule");
		printBtn.setVisible(false);
		
		btnPane.getChildren().addAll(addToSchedBtn, scheduleBtn, printBtn);
		btnPane.setAlignment(Pos.CENTER);
	}
	
	public Pane getPane() {
		return btnPane;
	}
}