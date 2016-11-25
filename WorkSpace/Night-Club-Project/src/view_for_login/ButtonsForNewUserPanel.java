package view_for_login;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.Person;

public class ButtonsForNewUserPanel {

	private Button continueBtn;
	private Button cancelBtn;
	private HBox btnPane;
	private static Person person;

	public ButtonsForNewUserPanel() {
		NewUserPane2 nup2 = new NewUserPane2();
		continueBtn = new Button("Continue");
		cancelBtn = new Button("Cancel");
		
		continueBtn.setOnAction(event -> {
			String firstname = NewUserPane.firstNameTxt.getText();
			String lastname = NewUserPane.lastNameTxt.getText();
			RadioButton chk = (RadioButton)NewUserPane.genderGroup.getSelectedToggle();
			String gender = chk.getText();
			String zip = NewUserPane.zipTxt.getText();
			person = new Person(firstname, lastname, gender, zip);
			
			NewUserPane.getStage().setScene(NewUserPane2.getScene());
		});
		
		cancelBtn.setOnAction(event -> {
			NewUserPane.closeStage();
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
