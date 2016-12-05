package view_for_owner;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MenuBarForOwnerPane {
	
	private VBox buttonPane;
	private Button createManAccBtn;
	private Button employmentBtn;
	private Button schedulingBtn;
	private Button revenueBtn;

	public MenuBarForOwnerPane() {
		
		buttonPane = new VBox(5);
		
		createManAccBtn = new Button("Create New Manager Account");
		createManAccBtn.setPrefWidth(200);
		createManAccBtn.setPrefHeight(50);
		employmentBtn = new Button("Employment Applications");
		employmentBtn.setPrefWidth(200);
		employmentBtn.setPrefHeight(50);
		revenueBtn = new Button("Revenue");
		revenueBtn.setPrefWidth(200);
		revenueBtn.setPrefHeight(50);
		schedulingBtn = new Button("Scheduling");
		schedulingBtn.setPrefWidth(200);
		schedulingBtn.setPrefHeight(50);
		buttonPane.getChildren().addAll(createManAccBtn, employmentBtn, revenueBtn, schedulingBtn);
		buttonPane.setAlignment(Pos.TOP_CENTER);
		
	}

	public Pane getPane() {
		return buttonPane;
	}
}
