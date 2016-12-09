package view_for_owner;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import view_for_login.NewUserPane;
import view_for_login.NewUserPane2;

public class SchedulingPaneAlert {

	
	public SchedulingPaneAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Information missing!");
		alert.setHeaderText("One of the fields below are empty!!");
		alert.setContentText("Click ok to try again");
		alert.showAndWait();
	}
}
