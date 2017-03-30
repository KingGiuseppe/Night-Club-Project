package view.login_panel.panes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LoginPanelLabelPane {

	private static VBox labelPane;
	private Label welcomeLbl;
	private Label loginLbl;

	public LoginPanelLabelPane() {
		labelPane = new VBox(30);
		labelPane.setPadding(new Insets(25, 25, 25, 25));
		labelPane.setAlignment(Pos.TOP_CENTER);
		
		welcomeLbl = new Label("Welcome");
		welcomeLbl.setFont(new Font("Arial Rounded MT Bold", 50));
		welcomeLbl.setTextFill(Color.web("#ffffff"));

		loginLbl = new Label("Login");
		loginLbl.setFont(new Font("Arial Rounded MT Bold", 30));
		loginLbl.setTextFill(Color.web("#ffffff"));

		labelPane.getChildren().addAll(welcomeLbl, loginLbl);
	}
	
	public static VBox getPane() {
		return labelPane;
	}
}
