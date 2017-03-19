package buttons_for_owner_panel;

import Listeners.ListenerMethods;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import view_for_guest.EventsPanel;
import view_for_login.Main_Window;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.OwnerPane;
import view_for_owner.PaneForRevenue;
import view_for_owner.SchedulingPane;
import view_for_owner.SendMessagePane;

public class MenuBarForOwnerPane {

	private HBox buttonPane;
	private Button createManAccBtn;
	private Button schedulingBtn;
	private Button revenueBtn;
	private Button eventBtn;
	private Button managerMessageBtn;

	public MenuBarForOwnerPane() {
		CreateManagerAccount1 cma = new CreateManagerAccount1();
		SchedulingPane sp = new SchedulingPane();
		PaneForRevenue rp = new PaneForRevenue();
		SendMessagePane smp = new SendMessagePane();

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

			if (ListenerMethods.getButtonListener2() != null) {
				ListenerMethods.getButtonListener2().btnClicked(1);

			}
			OwnerPane.getStage().setScene(SchedulingPane.getScene());
		});
		eventBtn = new Button("Events");
		eventBtn.setPrefWidth(200);
		eventBtn.setPrefHeight(50);
		eventBtn.setOnAction(event -> {
			if(Main_Window.getEventButtonListener() != null) {
				Main_Window.getEventButtonListener().getEventsBtnClicked(2);
			}

		});
		managerMessageBtn = new Button("Message For Managers");
		managerMessageBtn.setPrefWidth(200);
		managerMessageBtn.setPrefHeight(50);
		managerMessageBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(SendMessagePane.getScene());
		});
		buttonPane.getChildren().addAll(createManAccBtn, revenueBtn, schedulingBtn, eventBtn, managerMessageBtn);
		buttonPane.setAlignment(Pos.TOP_CENTER);

	}

	public Pane getPane() {
		return buttonPane;
	}
}
