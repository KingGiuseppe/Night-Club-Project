package view_for_login;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ButtonsForNewUserPanel2 {

	private HBox btnPane;
	private Button goBackBtn;
	private Button createAccBtn;
	private GridPane blankPane;

	public ButtonsForNewUserPanel2() {
		btnPane = new HBox(20);
		btnPane.setAlignment(Pos.BOTTOM_RIGHT);
		blankPane = new GridPane();
		
		createAccBtn = new Button("Create Account");
		
		goBackBtn = new Button("Go back");
		
		createAccBtn.setOnAction(event -> {
			
		});
		
		goBackBtn.setOnAction(event -> {
			NewUserPane.getStage().setScene(NewUserPane.getScene());
		});
		
		btnPane.getChildren().addAll(createAccBtn, goBackBtn);
		
	}
	
	public Pane getPane() {
		return btnPane;
	}
	
}
