package alerts;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import view_for_guest.GuestPane;
import javafx.scene.control.ButtonType;
import view.login_panel.stage.LoginStage;
import view.manager_account.scenes.ManagerAccountPanel;
import view.manager_account.stage.ManagerStage;
import view.owner_account.stage.OwnerStage;

public class LogoutAlert {

	public LogoutAlert(int i) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Are you sure you want to logout?");
		alert.setContentText("Click ok to continue or cancel to go back");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK){
			setPane(i);
		} else {
			alert.close();
		}
		
	}
	
	public static void setPane(int i) {
		if(i == 2) {
			OwnerStage.getStage().close();
			LoginStage.getStage().show();
		} else if(i == 1) {
			ManagerStage.getStage().close();
			LoginStage.getStage().show();
		} else if(i == 0) {
			GuestPane.getStage().close();
			LoginStage.getStage().show();
		}
	}
}
