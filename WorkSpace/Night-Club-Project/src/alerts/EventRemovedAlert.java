package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import view_for_login.NewUserPane;
import view_for_login.NewUserPane2;
import view_for_manager.ManagerPane;

public class EventRemovedAlert {

	public EventRemovedAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Event Deleted!");
		alert.setHeaderText("The event has been deleted!");
		alert.setContentText("Click ok to continue.");
		alert.showAndWait();
		ManagerPane.getStage().setScene(ManagerPane.getScene());
	
	}
}
