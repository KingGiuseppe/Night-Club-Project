package view_for_owner;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model_for_newuser.Person;
import view_for_guest.EventsPanel;
import view_for_login.Main_Window;

public class MenuBarForOwnerPane {
	
	private HBox buttonPane;
	private Button createManAccBtn;
	private Button employmentBtn;
	private Button schedulingBtn;
	private Button revenueBtn;
	private Person person;
	private Button eventBtn;

	public MenuBarForOwnerPane() {
		CreateManagerAccount1 cma = new CreateManagerAccount1();
		SchedulingPane sp = new SchedulingPane();
		PaneForRevenue rp = new PaneForRevenue();
		
		buttonPane = new HBox(5);
		
		createManAccBtn = new Button("Create New Manager Account");
		createManAccBtn.setPrefWidth(200);
		createManAccBtn.setPrefHeight(50);
		createManAccBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(CreateManagerAccount1.getScene());
		});
		revenueBtn = new Button("Revenue");
		revenueBtn.setPrefWidth(200);
		revenueBtn.setPrefHeight(50);
		revenueBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(PaneForRevenue.getScene());
		});
		schedulingBtn = new Button("Scheduling");
		schedulingBtn.setPrefWidth(200);
		schedulingBtn.setPrefHeight(50);
		schedulingBtn.setOnAction(event -> {
			if (Main_Window.getSchedulingListener() != null) {
				Main_Window.getSchedulingListener().scheduleBtnClicked();
			}
			OwnerPane.getStage().setScene(SchedulingPane.getScene());
		});
		eventBtn = new Button("Events");
		eventBtn.setPrefWidth(200);
		eventBtn.setPrefHeight(50);
		eventBtn.setOnAction(event -> {
			EventsPanel ep = new EventsPanel();
			ep.setAccount(2);
			OwnerPane.getStage().setScene(new Scene(ep.getPane(), 600, 600));
			
		});
		buttonPane.getChildren().addAll(createManAccBtn, revenueBtn, schedulingBtn, eventBtn);
		buttonPane.setAlignment(Pos.TOP_CENTER);
		
	}

	public Pane getPane() {
		return buttonPane;
	}
}
