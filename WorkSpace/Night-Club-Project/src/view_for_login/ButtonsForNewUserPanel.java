package view_for_login;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ButtonsForNewUserPanel {

	
	private Button continueBtn;
	private Button cancelBtn;
	private HBox btnPane;

	public ButtonsForNewUserPanel() {
		NewUserPane2 nup2 = new NewUserPane2();
		
		continueBtn = new Button("Continue");
		cancelBtn = new Button("Cancel");
		
		continueBtn.setOnAction(event -> {
			NewUserPane.getStage().setScene(NewUserPane2.getScene());
		});
		
		cancelBtn.setOnAction(event -> {
			NewUserPane.exitStage();
		});
		
		
		btnPane = new HBox(20);
		btnPane.setAlignment(Pos.BOTTOM_RIGHT);
		btnPane.getChildren().addAll(continueBtn, cancelBtn);
		
	}
	
	public Pane getPane() {
		return btnPane;
	}
	
}
