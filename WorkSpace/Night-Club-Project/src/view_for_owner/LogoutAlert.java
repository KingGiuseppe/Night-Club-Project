package view_for_owner;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import view_for_guest.GuestPane;
import view_for_login.Main_Window;
import view_for_manager.ManagerPane;
import javafx.scene.control.ButtonType;

public class LogoutAlert {

	public LogoutAlert(int i) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Are you sure you want to logout?");
		alert.setContentText("Click ok to continue or cancel to go back");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK){
			if(i == 2) {
				OwnerPane.getStage().close();
				Main_Window.getStage().show();
			} else if(i == 1) {
				ManagerPane.getStage().close();
				Main_Window.getStage().show();
			} else if(i == 0) {
				GuestPane.getStage().close();
				Main_Window.getStage().show();
			}
		} else {
			alert.close();
		}
		
	}
}
