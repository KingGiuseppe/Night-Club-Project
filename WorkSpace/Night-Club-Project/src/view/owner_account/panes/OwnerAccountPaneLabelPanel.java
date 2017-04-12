package view.owner_account.panes;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class OwnerAccountPaneLabelPanel {

	private Label welcomeLabel;
	private Labeled questionLabel;
	private static GridPane textPane;
	private Labeled clickButtonLabel;

	public OwnerAccountPaneLabelPanel() {
		textPane = new GridPane();
		textPane.setAlignment(Pos.CENTER);
		
		welcomeLabel = new Label("Welcome!");
		welcomeLabel.setFont(new Font("Arial Rounded MT Bold", 40));
		welcomeLabel.setTextFill(Color.web("#ffffff"));
		welcomeLabel.setAlignment(Pos.CENTER);
		questionLabel = new Label("What would you like to do today?");
		questionLabel.setTextFill(Color.web("#ffffff"));
		questionLabel.setFont(new Font("Arial Rounded MT Bold", 25));
		clickButtonLabel = new Label("Please click a button below");
		clickButtonLabel.setTextFill(Color.web("#ffffff"));
		clickButtonLabel.setFont(new Font("Arial Rounded MT Bold", 25));
		
		
		textPane.add(welcomeLabel, 0, 0);
		textPane.add(questionLabel, 0, 1);
		textPane.add(clickButtonLabel, 0, 6);
	}
	
	public static GridPane getLabelPane() {
		return textPane;
	}

}
