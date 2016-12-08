package view_for_owner;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model_for_newuser.NewUserObject;
import view_for_login.AccountCreatedAlert;
import view_for_login.Main_Window;
import view_for_login.PasswordsDontMatchAlert;

public class ButtonsForCreateManAcc2 {

	private Button createAccBtn;
	private Button goBackBtn;
	private HBox btnPane2;
	
	public ButtonsForCreateManAcc2() {
		btnPane2 = new HBox(20);
		btnPane2.setAlignment(Pos.BOTTOM_RIGHT);

		createAccBtn = new Button("Create Account");

		goBackBtn = new Button("Go back");

		createAccBtn.setOnAction(event -> {
			System.out.println("Here");
			String emailAddress2 = CreateManagerAccount2.emailTxt.getText();
			String username2 = CreateManagerAccount2.usernameTxt.getText();
			String password2 = CreateManagerAccount2.passwordTxt.getText();
			String password22 = CreateManagerAccount2.password2Txt.getText();

			if (password22.equals(password2) == false) {
				PasswordsDontMatchAlert pdma = new PasswordsDontMatchAlert();

			} else if (password2.equals(password22)) {

				NewUserObject userEvent2 = new NewUserObject(this, ButtonsForCreateManAcc1.getPerson().getFirstName(),
						ButtonsForCreateManAcc1.getPerson().getLastName(),
						ButtonsForCreateManAcc1.getPerson().getGender(), 
						ButtonsForCreateManAcc1.getPerson().getZip(),
						emailAddress2, username2, password2, 1);

				if (Main_Window.getNewUserListener() != null) {
					Main_Window.getNewUserListener().createBtnClicked(userEvent2);
				}

				AccountCreatedAlert aca = new AccountCreatedAlert();
			}
			
			OwnerPane.getStage().setScene(OwnerPane.getScene());
		});

		goBackBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(CreateManagerAccount1.getScene());
		});

		btnPane2.getChildren().addAll(createAccBtn, goBackBtn);

	}
	public Pane getPane() {
		return btnPane2;
	}

}
