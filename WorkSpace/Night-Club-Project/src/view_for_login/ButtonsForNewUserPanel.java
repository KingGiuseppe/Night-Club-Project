package view_for_login;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.Person;

public class ButtonsForNewUserPanel {

	
	private Button continueBtn;
	private Button cancelBtn;
	private HBox btnPane;
	private static Person person;

	public ButtonsForNewUserPanel() {
		
		continueBtn = new Button("Continue");
		cancelBtn = new Button("Cancel");
		
		continueBtn.setOnAction(event -> {
			String firstname = NewUserPane.firstNameTxt.getText();
			String lastname = NewUserPane.lastNameTxt.getText();
			String gender = NewUserPane.genderGroup.getSelectedToggle().toString();
			String zip = NewUserPane.zipTxt.getText();
			person = new Person(firstname, lastname, gender, zip);
			
			
			NewUserPane.getStage().setScene(NewUserPane2.getScene());
		});
		
		cancelBtn.setOnAction(event -> {
			NewUserPane.exitStage();
		});
		
		
		btnPane = new HBox(20);
		btnPane.setAlignment(Pos.BOTTOM_RIGHT);
		btnPane.getChildren().addAll(continueBtn, cancelBtn);
		
	}
	
	public Pane getPane() {
		return btnPane;
	}
	
	public static Person getPerson() {
		return person;
	}
	
}
