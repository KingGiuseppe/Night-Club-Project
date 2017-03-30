package view.new_user_panel_1.panes;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class NewUserPane1LabelPane {

	private static VBox labelPane;
	private Label createAccountLbl;
	private Label whoAreYouLbl;

	public NewUserPane1LabelPane() {
		labelPane = new VBox(10);

		createAccountLbl = new Label("Create Your Night Club Account!");
		createAccountLbl.setFont(new Font("Arial Rounded MT Bold", 30));
		
		whoAreYouLbl = new Label("Who are you?");
		whoAreYouLbl.setFont(new Font("Arial Rounded MT Bold", 25));

		labelPane.getChildren().addAll(createAccountLbl, whoAreYouLbl);

	}

	public static VBox getPane() {
		return labelPane;
	}
}
