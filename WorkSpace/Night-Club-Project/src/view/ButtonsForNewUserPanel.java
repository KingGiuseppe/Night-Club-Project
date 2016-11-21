package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ButtonsForNewUserPanel {

	
	private Button createBtn;
	private Button cancelBtn;
	private HBox btnPane;

	public ButtonsForNewUserPanel() {
		createBtn = new Button("Create");
		cancelBtn = new Button("Cancel");
		
		cancelBtn.setOnAction(event -> {
			NewUserPane.exitStage();
		});
		
		btnPane = new HBox(20);
		
		btnPane.getChildren().addAll(createBtn, cancelBtn);
		
	}
	
	public Pane getPane() {
		return btnPane;
	}
	
}
