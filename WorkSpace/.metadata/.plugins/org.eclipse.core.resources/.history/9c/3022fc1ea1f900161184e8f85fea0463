package view_for_login;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import model_for_login.ForgotPassObject;
import model_for_newuser.NewUser;

public class ForgotPasswordPane2 {
	private static GridPane mainPane2;
	private Label topLbl;
	private Label passLbl;
	private Label pass2Lbl;
	private TextField pass2Txt;
	private TextField passTxt;
	private Button okBtn;
	private static Scene scene;
	private static NewUser user;
	static Label top2Lbl;
	
	public ForgotPasswordPane2() {
		mainPane2 = new GridPane();
		mainPane2.setAlignment(Pos.CENTER);
		mainPane2.setHgap(10);
		mainPane2.setVgap(10);
		mainPane2.setPadding(new Insets(25, 25, 25, 25));
		top2Lbl = new Label("");
		top2Lbl.setFont(Font.font(30));
		topLbl = new Label("Please enter in a new password");
		topLbl.setFont(Font.font(25));
		passLbl = new Label("Password");
		pass2Lbl = new Label("Retype password");
		
		passTxt = new TextField();
		pass2Txt = new TextField();
		okBtn = new Button("Ok");
		okBtn.setOnAction(event -> {
			if(passTxt.getText().equals(pass2Txt.getText())){
				ForgotPassObject object = new ForgotPassObject(this, user);
				if(Main_Window.getForgotPassListener2() != null) {
					Main_Window.getForgotPassListener2().forgotPassBtnClicked2(object);
				}
				user.setPassword(passTxt.getText());
				PasswordChangedAlert alert2 = new PasswordChangedAlert();
				ForgotPasswordPane.getStage().close();
				passTxt.clear();
				pass2Txt.clear();
				ForgotPasswordPane.userNameTxt.clear();
				ForgotPasswordPane.emailTxt.clear();
			} else {
				PasswordsDontMatchAlert alert = new PasswordsDontMatchAlert();
			}
		});
		
		mainPane2.add(top2Lbl, 0, 0, 1, 1);
		mainPane2.add(topLbl, 0, 1, 3, 1);
		mainPane2.add(passLbl, 0, 3);
		mainPane2.add(passTxt, 1, 3);
		mainPane2.add(pass2Lbl, 0, 4);
		mainPane2.add(pass2Txt, 1, 4);
		mainPane2.add(okBtn, 1, 6);
		mainPane2.setHalignment(okBtn, HPos.RIGHT);		
		
		scene = new Scene(mainPane2, 400, 300);
		
	}
	public static Pane getPane() {
		return mainPane2;
	}
	public static Scene getScene() {
		return scene;
	}
	public static void setUser(NewUser newUser) {
		user = newUser;
	}

}
