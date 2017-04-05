package view.login_panel.forgot_password_2.panes;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ForgotPasswordPanel2LabelPane {

	private static VBox labelPaneVBox;
	private Label enterPasswordLbl;
	private Label passwordRuleLbl;

	public ForgotPasswordPanel2LabelPane() {
		labelPaneVBox = new VBox();
		
		enterPasswordLbl = new Label("Please enter in a new password");
		enterPasswordLbl.setFont(new Font("Arial Rounded MT Bold", 30));
		enterPasswordLbl.setTextFill(Color.web("#ffffff"));

		passwordRuleLbl = new Label("Password must contain 1 letter \nand one uppercase letter!");
		passwordRuleLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		passwordRuleLbl.setTextFill(Color.web("#ffffff"));
		
		labelPaneVBox.getChildren().addAll(enterPasswordLbl, passwordRuleLbl);
	}
	
	public static VBox getPane() {
		return labelPaneVBox;
	}

}
