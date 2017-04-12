package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import view.manager_account.scenes.ManagerAccountPanel;
import view.manager_account.stage.ManagerStage;

public class EventRemovedAlert {

	public EventRemovedAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Event Deleted!");
		alert.setHeaderText("The event has been deleted!");
		alert.setContentText("Click ok to continue.");
		alert.showAndWait();
		ManagerStage.getStage().setScene(ManagerAccountPanel.getScene());
	
	}
}
