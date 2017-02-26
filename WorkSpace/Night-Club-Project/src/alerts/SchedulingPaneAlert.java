package alerts;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import panes_for_login.NewUserPane;
import panes_for_login.NewUserPane2;

public class SchedulingPaneAlert {

	
	public SchedulingPaneAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Information missing!");
		alert.setHeaderText("One of the fields below are empty!!");
		alert.setContentText("Click ok to try again");
		alert.showAndWait();
	}
}