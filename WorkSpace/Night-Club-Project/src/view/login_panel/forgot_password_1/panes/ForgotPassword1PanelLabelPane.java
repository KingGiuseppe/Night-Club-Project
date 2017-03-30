package view.login_panel.forgot_password_1.panes;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ForgotPassword1PanelLabelPane {

	private static VBox labelVBox;
	private Label topLbl;
	private Label topLbl2;

	public ForgotPassword1PanelLabelPane() {
		labelVBox = new VBox(10);
		labelVBox.setAlignment(Pos.CENTER);
		
		topLbl = new Label("Forgot password?");
		topLbl.setFont(new Font("Arial Rounded MT Bold", 35));
		topLbl.setTextFill(Color.web("#ffffff"));
		topLbl.setAlignment(Pos.CENTER_LEFT);
		topLbl2 = new Label("Please enter your username \nand email");
		topLbl2.setFont(new Font("Arial Rounded MT Bold", 25));
		topLbl2.setTextFill(Color.web("#ffffff"));
		
		labelVBox.getChildren().addAll(topLbl, topLbl2);
	}
	
	public static VBox getPane() {
		return labelVBox;
	}

}
