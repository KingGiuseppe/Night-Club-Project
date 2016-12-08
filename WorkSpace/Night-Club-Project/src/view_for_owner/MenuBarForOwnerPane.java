package view_for_owner;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model_for_newuser.Person;
import view_for_login.Main_Window;
import view_for_login.NewUserPane;
import view_for_login.NewUserPane2;

public class MenuBarForOwnerPane {
	
	private VBox buttonPane;
	private Button createManAccBtn;
	private Button employmentBtn;
	private Button schedulingBtn;
	private Button revenueBtn;
	private Person person;

	public MenuBarForOwnerPane() {
		CreateManagerAccount1 cma = new CreateManagerAccount1();
		SchedulingPane sp = new SchedulingPane();
		buttonPane = new VBox(5);
		
		createManAccBtn = new Button("Create New Manager Account");
		createManAccBtn.setPrefWidth(200);
		createManAccBtn.setPrefHeight(50);
		createManAccBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(CreateManagerAccount1.getScene());
		});
		employmentBtn = new Button("Employment Applications");
		employmentBtn.setPrefWidth(200);
		employmentBtn.setPrefHeight(50);
		employmentBtn.setOnAction(event -> { 
			//OwnerPane.getStage().setScene(EmploymentPane.getScene());
			
		});
		revenueBtn = new Button("Revenue");
		revenueBtn.setPrefWidth(200);
		revenueBtn.setPrefHeight(50);
		schedulingBtn = new Button("Scheduling");
		schedulingBtn.setPrefWidth(200);
		schedulingBtn.setPrefHeight(50);
		schedulingBtn.setOnAction(event -> {
			if (Main_Window.getSchedulingListener() != null) {
				Main_Window.getSchedulingListener().scheduleBtnClicked();
			}
			OwnerPane.getStage().setScene(SchedulingPane.getScene());
		});
		buttonPane.getChildren().addAll(createManAccBtn, employmentBtn, revenueBtn, schedulingBtn);
		buttonPane.setAlignment(Pos.TOP_CENTER);
		
	}

	public Pane getPane() {
		return buttonPane;
	}
}
