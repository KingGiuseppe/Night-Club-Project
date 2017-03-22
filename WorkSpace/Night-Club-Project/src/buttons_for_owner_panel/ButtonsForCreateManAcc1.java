package buttons_for_owner_panel;

import alerts.AlertForNewUser;
import alerts.AlertForZip;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import model_for_newuser.Person;
import view_for_login.NewUserPane;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.CreateManagerAccount2;
import view_for_owner.OwnerPane;

public class ButtonsForCreateManAcc1 {

	private Button continueBtn;
	private Button cancelBtn;
	private static Person person;
	private HBox btnPane;

	public ButtonsForCreateManAcc1() {
		CreateManagerAccount2 cma2 = new CreateManagerAccount2();

		continueBtn = new Button("Continue");
		continueBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		cancelBtn = new Button("Cancel");
		cancelBtn.setFont(new Font("Arial Rounded MT Bold", 20));

		continueBtn.setOnAction(event -> {
			if (CreateManagerAccount1.getFirstNameTxt().getText().equals("")
					|| CreateManagerAccount1.getLastNameTxt().getText().equals("")
					|| CreateManagerAccount1.getZipTxt().getText().equals("")) {
				AlertForNewUser alert = new AlertForNewUser();
			} else if(CreateManagerAccount1.getZipTxt().getText().matches("[0-9]+")) {
				AlertForZip zip = new AlertForZip();
			} else {
				String firstname = CreateManagerAccount1.getFirstNameTxt().getText();
				String lastname = CreateManagerAccount1.getLastNameTxt().getText();
				RadioButton chk = (RadioButton) CreateManagerAccount1.getGenderGroup().getSelectedToggle();
				String gender = chk.getText();
				String zip = CreateManagerAccount1.getZipTxt().getText();
				person = new Person(firstname, lastname, gender, zip);

				OwnerPane.getStage().setScene(CreateManagerAccount2.getScene());
			}
		});

		cancelBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(OwnerPane.getScene());
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
