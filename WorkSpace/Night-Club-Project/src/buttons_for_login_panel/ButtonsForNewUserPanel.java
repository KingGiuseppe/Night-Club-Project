package buttons_for_login_panel;

import alerts.AlertForNewUser;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import model_for_newuser.Person;
import panes_for_login.NewUserPane;
import panes_for_login.NewUserPane2;

public class ButtonsForNewUserPanel {

	private Button continueBtn;
	private Button cancelBtn;
	private HBox btnPane;
	private static Person person;

	public ButtonsForNewUserPanel() {
		NewUserPane2 nup2 = new NewUserPane2();
		continueBtn = new Button("Continue");
		continueBtn.setFont(new Font("Arial Rounded MT Bold", 15));
		cancelBtn = new Button("Cancel");
		cancelBtn.setFont(new Font("Arial Rounded MT Bold", 15));

		continueBtn.setOnAction(event -> {
			if (NewUserPane.getFirstNameTxt().getText().equals("") || NewUserPane.getLastNameTxt().getText().equals("")
					|| NewUserPane.getZipTxt().getText().equals("")) {
				AlertForNewUser alert = new AlertForNewUser();
			} else {
				String firstname = NewUserPane.getFirstNameTxt().getText();
				String lastname = NewUserPane.getLastNameTxt().getText();
				RadioButton chk = (RadioButton) NewUserPane.getGenderGroup().getSelectedToggle();
				String gender = chk.getText();
				String zip = NewUserPane.getZipTxt().getText();
				person = new Person(firstname, lastname, gender, zip);

				NewUserPane.getStage().setScene(NewUserPane2.getScene());
			}

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
