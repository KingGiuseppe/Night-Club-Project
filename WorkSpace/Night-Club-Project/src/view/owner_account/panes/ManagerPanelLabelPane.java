package view.owner_account.panes;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ManagerPanelLabelPane {

	private static VBox labelPane;
	private Label welcomeLbl;

	public ManagerPanelLabelPane() {
		labelPane = new VBox(20);
		labelPane.setAlignment(Pos.TOP_CENTER);

		welcomeLbl = new Label("Welcome!");
		welcomeLbl.setFont(new Font("Arial Rounded MT Bold", 35));
		welcomeLbl.setTextFill(Color.web("#ffffff"));
		welcomeLbl.setAlignment(Pos.CENTER);

		labelPane.getChildren().add(welcomeLbl);

	}

	public static VBox getPane() {
		return labelPane;
	}
}
