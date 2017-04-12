package buttons_for_owner_panel;

import alerts.AlertForNewUser;
import alerts.PasswordsDontMatchAlert;
import controller.NewUserController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import listener.ButtonEventListenerMethods;
import model_for_newuser.NewUserObject;
import view.owner_account.scenes.OwnerAccountPanel;
import view.owner_account.stage.OwnerStage;
import view_for_owner.CreateManagerAccount1;
import view_for_owner.CreateManagerAccount2;

public class ButtonsForCreateManAcc2 {

	private Button createAccBtn;
	private Button goBackBtn;
	private HBox btnPane2;

	public ButtonsForCreateManAcc2() {
		btnPane2 = new HBox(20);
		btnPane2.setAlignment(Pos.BOTTOM_RIGHT);

		createAccBtn = new Button("Create Account");
		createAccBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		goBackBtn = new Button("Go back");
		goBackBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		createAccBtn.setOnAction(event -> {
			String emailAddress2 = CreateManagerAccount2.getEmailTxt().getText();
			String username2 = CreateManagerAccount2.getUsernameTxt().getText();
			String password2 = CreateManagerAccount2.getPasswordTxt().getText();
			String password22 = CreateManagerAccount2.getPassword2Txt().getText();
			if (emailAddress2.equals("") || username2.equals("") || password2.equals("") || password2.equals("")) {
				AlertForNewUser alert = new AlertForNewUser();
			} else {
				if (password22.equals(password2) == false) {
					PasswordsDontMatchAlert pdma = new PasswordsDontMatchAlert();

				} else if (password2.equals(password22)) {
					NewUserController newUserCont = new NewUserController(new ButtonEventListenerMethods());
					NewUserObject userEvent2 = new NewUserObject(this,
							ButtonsForCreateManAcc1.getPerson().getFirstName(),
							ButtonsForCreateManAcc1.getPerson().getLastName(),
							ButtonsForCreateManAcc1.getPerson().getGender(),
							ButtonsForCreateManAcc1.getPerson().getZip(), emailAddress2, username2, password2, 1);

					if (ButtonEventListenerMethods.getButtonListener() != null) {
						ButtonEventListenerMethods.getButtonListener().btnClicked(userEvent2);
					}
					OwnerStage.getStage().setScene(OwnerAccountPanel.getScene());
				}
			}
		});

		goBackBtn.setOnAction(event -> {
			OwnerStage.getStage().setScene(CreateManagerAccount1.getScene());
		});

		btnPane2.getChildren().addAll(createAccBtn, goBackBtn);

	}

	public Pane getPane() {
		return btnPane2;
	}

}
