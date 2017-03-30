package view.new_user_panel_2.panes;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class NewUserPane2Labels {

	private static Label enterInformationLbl;
	private static Label passwordRuleLbl;

	public NewUserPane2Labels() {
		enterInformationLbl = new Label("Please enter your information below");
		enterInformationLbl.setFont(new Font("Arial Rounded MT Bold", 25));
		
		passwordRuleLbl = new Label("Must contain at least one number and one uppercase letter!");
		passwordRuleLbl.setFont(new Font("Arial Rounded MT Bold", 15));
	}
	
	public static Label getEnterInformationLbl() {
		return enterInformationLbl;
	}
	
	public static Label getPasswordRuleLbl() {
		return passwordRuleLbl;
	}
}
