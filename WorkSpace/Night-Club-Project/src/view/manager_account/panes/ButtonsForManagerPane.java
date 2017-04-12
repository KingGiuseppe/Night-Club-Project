package view.manager_account.panes;

import javafx.geometry.Insets;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import view.manager_account.buttons.ManagerAccountPanelCreateEventButton;
import view.manager_account.buttons.ManagerAccountPanelRemoveEventButton;
import view.manager_account.buttons.ManagerAccountPanelSendEmailButton;
import view.manager_account.buttons.ManagerAccountPanelViewEventsButton;

public class ButtonsForManagerPane {
	private ManagerAccountPanelViewEventsButton viewEventsButton;
	private ManagerAccountPanelSendEmailButton sendEmailB2utton;
	private ManagerAccountPanelRemoveEventButton removeEventButton;
	private ManagerAccountPanelCreateEventButton createEventButton;
	private static VBox buttonPane;

	public ButtonsForManagerPane() {
		viewEventsButton = new ManagerAccountPanelViewEventsButton();
		sendEmailB2utton = new ManagerAccountPanelSendEmailButton();
		removeEventButton = new ManagerAccountPanelRemoveEventButton();
		createEventButton = new ManagerAccountPanelCreateEventButton();

		buttonPane = new VBox(20);
		buttonPane.setPadding(new Insets(5, 5, 5, 5));
		buttonPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

		buttonPane.getChildren().addAll(createEventButton.getCreateEventButton(),
				removeEventButton.getRemoveEventButton(), viewEventsButton.getViewEventsButton(),
				sendEmailB2utton.getSendEmailButton());

	}

	public static Pane getPane() {
		return buttonPane;
	}
}
