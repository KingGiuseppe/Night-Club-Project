package buttons_for_login_panel;

import alerts.AccountCreatedAlert;
import alerts.AlertForNewUser;
import alerts.PasswordsDontMatchAlert;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import model_for_newuser.NewUserObject;
import view_for_login.Main_Window;
import view_for_login.NewUserPane;
import view_for_login.NewUserPane2;

public class ButtonsForNewUserPanel2 {

	private HBox btnPane;
	private Button goBackBtn;
	private Button createAccBtn;

	public ButtonsForNewUserPanel2() {
		btnPane = new HBox(20);
		btnPane.setAlignment(Pos.BOTTOM_RIGHT);

		createAccBtn = new Button("Create Account");
		createAccBtn.setFont(new Font("Arial Rounded MT Bold", 20));

		goBackBtn = new Button("Go back");
		goBackBtn.setFont(new Font("Arial Rounded MT Bold", 20));

		createAccBtn.setOnAction(event -> {
			String emailAddress = NewUserPane2.getEmailTxt().getText();
			String username = NewUserPane2.getUsernameTxt().getText();
			String password = NewUserPane2.getPasswordTxt().getText();
			String password2 = NewUserPane2.getPassword2Txt().getText();
			if (emailAddress.equals("") || username.equals("") || password.equals("") || password2.equals("")) {
				AlertForNewUser alert = new AlertForNewUser();
			} else {
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

				}
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
