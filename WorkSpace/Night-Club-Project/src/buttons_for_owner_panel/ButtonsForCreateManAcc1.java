package buttons_for_owner_panel;

import alerts.AlertForNewUser;
import alerts.AlertForZip;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import model_for_newuser.UserInformation;
import view.login_panel.new_user.scenes.NewUserPanel1;
import view.owner_account.scenes.OwnerAccountPanel;
import view.owner_account.stage.OwnerStage;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.CreateManagerAccount2;

public class ButtonsForCreateManAcc1 {

	private Button continueBtn;
	private Button cancelBtn;
	private static UserInformation person;
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
				person = new UserInformation(firstname, lastname, gender, zip);

				OwnerStage.getStage().setScene(CreateManagerAccount2.getScene());
			}
		});

		cancelBtn.setOnAction(event -> {
			OwnerStage.getStage().setScene(OwnerAccountPanel.getScene());
		});

		btnPane = new HBox(20);
		btnPane.setAlignment(Pos.BOTTOM_RIGHT);
		btnPane.getChildren().addAll(continueBtn, cancelBtn);

	}

	public Pane getPane() {
		return btnPane;
	}

	public static UserInformation getPerson() {
		return person;
	}
}
