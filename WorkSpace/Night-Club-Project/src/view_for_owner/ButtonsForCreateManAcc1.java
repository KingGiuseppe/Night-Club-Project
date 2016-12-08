package view_for_owner;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model_for_newuser.Person;

public class ButtonsForCreateManAcc1 {

	private Button continueBtn;
	private Button cancelBtn;
	private static Person person;
	private HBox btnPane;

	public ButtonsForCreateManAcc1() {
		CreateManagerAccount2 cma2 = new CreateManagerAccount2();
		
		continueBtn = new Button("Continue");
		cancelBtn = new Button("Cancel");
		
		continueBtn.setOnAction(event -> {
			String firstname = CreateManagerAccount1.firstNameTxt.getText();
			String lastname = CreateManagerAccount1.lastNameTxt.getText();
			RadioButton chk = (RadioButton)CreateManagerAccount1.genderGroup.getSelectedToggle();
			String gender = chk.getText();
			String zip = CreateManagerAccount1.zipTxt.getText();
			person = new Person(firstname, lastname, gender, zip);
			
			OwnerPane.getStage().setScene(CreateManagerAccount2.getScene());
		});
		
		cancelBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(OwnerPane.getScene());;
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
