package buttons_for_owner_panel;

import java.util.EventObject;

import controller.GetEventsController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import view_for_manager.PaneForGuestNotification;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.OwnerPane;
import view_for_owner.PaneForRevenue;
import view_for_owner.SchedulingPane;

public class MenuBarForOwnerPane {

	private HBox buttonPane;
	private Button createManAccBtn;
	private Button schedulingBtn;
	private Button revenueBtn;
	private Button eventBtn;
	private Button sendEmailBtn;

	public MenuBarForOwnerPane() {
		CreateManagerAccount1 cma = new CreateManagerAccount1();
		SchedulingPane sp = new SchedulingPane();
		PaneForRevenue rp = new PaneForRevenue();

		buttonPane = new HBox(5);

		createManAccBtn = new Button("New Manager Account");
		createManAccBtn.setFont(new Font("Arial Rounded MT Bold", 13));
		createManAccBtn.setPrefWidth(200);
		createManAccBtn.setPrefHeight(50);
		createManAccBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(CreateManagerAccount1.getScene());
		});
		revenueBtn = new Button("Revenue");
		revenueBtn.setFont(new Font("Arial Rounded MT Bold", 13));
		revenueBtn.setPrefWidth(200);
		revenueBtn.setPrefHeight(50);
		revenueBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(PaneForRevenue.getScene());
		});
		schedulingBtn = new Button("Scheduling");
		schedulingBtn.setFont(new Font("Arial Rounded MT Bold", 13));
		schedulingBtn.setPrefWidth(200);
		schedulingBtn.setPrefHeight(50);
		schedulingBtn.setOnAction(event -> {

			//if (ListenerMethods.getButtonListener2() != null) {
			//	ListenerMethods.getButtonListener2().btnClicked(1);

		//	}
			OwnerPane.getStage().setScene(SchedulingPane.getScene());
		});
		eventBtn = new Button("Events");
		eventBtn.setFont(new Font("Arial Rounded MT Bold", 13));
		eventBtn.setPrefWidth(200);
		eventBtn.setPrefHeight(50);
		eventBtn.setOnAction(event -> {
			GetEventsController eventsCont = new GetEventsController(new ButtonEventListenerMethods());
			if(ButtonEventListenerMethods.getButtonListener() != null) {
				ButtonEventListenerMethods.getButtonListener().btnClicked(new EventObject(3));
			}
		});
		sendEmailBtn = new Button("Send Email");
		sendEmailBtn.setFont(new Font("Arial Rounded MT Bold", 13));
		sendEmailBtn.setPrefWidth(200);
		sendEmailBtn.setPrefHeight(50);
		sendEmailBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(new PaneForGuestNotification(1).getScene());
		});
		buttonPane.getChildren().addAll(createManAccBtn, revenueBtn, schedulingBtn, eventBtn, sendEmailBtn);
		buttonPane.setAlignment(Pos.TOP_CENTER);

	}

	public Pane getPane() {
		return buttonPane;
	}
}
