package view.login_panel.new_user_panel_1.panes;

import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class NewUserPanel1RadsPane {

	private static HBox radPane;
	private RadioButton maleRad;
	private RadioButton femaleRad;
	private static ToggleGroup genderToggleGroup;

	public NewUserPanel1RadsPane() {
		radPane = new HBox(20);

		maleRad = new RadioButton("Male");
		maleRad.setSelected(true);
		maleRad.setFont(new Font("Arial Rounded MT Bold", 20));
		femaleRad = new RadioButton("Female");
		femaleRad.setFont(new Font("Arial Rounded MT Bold", 20));
		
		genderToggleGroup = new ToggleGroup();
		
		maleRad.setToggleGroup(genderToggleGroup);
		femaleRad.setToggleGroup(genderToggleGroup);
		
		radPane.getChildren().addAll(maleRad, femaleRad);
		
		radPane.setAlignment(Pos.CENTER);
	}
	
	public static HBox getPane() {
		return radPane;
	}
	
	public static RadioButton getGenderGroup() {
		return (RadioButton) genderToggleGroup.getSelectedToggle();
	}
}
