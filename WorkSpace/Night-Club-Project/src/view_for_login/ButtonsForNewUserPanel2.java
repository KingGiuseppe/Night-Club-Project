package view_for_login;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model_for_newuser.NewUserEventListener;
import model_for_newuser.NewUserObject;

public class ButtonsForNewUserPanel2 {

	private HBox btnPane;
	private Button goBackBtn;
	private Button createAccBtn;
	private GridPane blankPane;
	private NewUserEventListener eventListener;

	public ButtonsForNewUserPanel2() {
		btnPane = new HBox(20);
		btnPane.setAlignment(Pos.BOTTOM_RIGHT);
		blankPane = new GridPane();

		createAccBtn = new Button("Create Account");

		goBackBtn = new Button("Go back");

		createAccBtn.setOnAction(event -> {
			String emailAddress = NewUserPane2.emailTxt.getText();
			String username = NewUserPane2.usernameTxt.getText();
			String password = NewUserPane2.passwordTxt.getText();
			String password2 = NewUserPane2.password2Txt.getText();

			if (password.equals(password2) == false) {
				PasswordsDontMatchAlert pdma = new PasswordsDontMatchAlert();

			} else if (password.equals(password2)) {

				NewUserObject userEvent = new NewUserObject(this, ButtonsForNewUserPanel.getPerson().getFirstName(),
						ButtonsForNewUserPanel.getPerson().getLastName(),
						ButtonsForNewUserPanel.getPerson().getGender(), ButtonsForNewUserPanel.getPerson().getZip(),
						emailAddress, username, password, 0);

				if (Main_Window.getNewUserListener() != null) {
					Main_Window.getNewUserListener().createBtnClicked(userEvent);
				}

				AccountCreatedAlert aca = new AccountCreatedAlert();
			}
		});

		goBackBtn.setOnAction(event -> {
			NewUserPane.getStage().setScene(NewUserPane.getScene());
		});

		btnPane.getChildren().addAll(createAccBtn, goBackBtn);

	}

	public Pane getPane() {
		return btnPane;
	}

}
