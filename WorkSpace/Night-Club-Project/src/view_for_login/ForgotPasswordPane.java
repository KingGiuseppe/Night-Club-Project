package view_for_login;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model_for_login.ForgotPassObject;
import model_for_newuser.NewUser;

public class ForgotPasswordPane {

	private static boolean isValid;
	private static NewUser user;
	private static Stage stage;
	private GridPane mainPane;
	private Label topLbl;
	private Label topLbl2;
	private Label usernameLbl;
	private Label emailLbl;
	static TextField userNameTxt;
	static TextField emailTxt;
	private Button continueBtn;
	private Scene scene;

	public ForgotPasswordPane() {
		stage = new Stage();
		ForgotPasswordPane2 fpp2 = new ForgotPasswordPane2();
		mainPane = new GridPane();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setHgap(10);
		mainPane.setVgap(10);
		mainPane.setPadding(new Insets(25, 25, 25, 25));
		
		topLbl = new Label("Forgot password?");
		topLbl.setFont(Font.font(30));
		
		topLbl2 = new Label("Please enter your username and email");
		topLbl2.setFont(Font.font(20));
		
		usernameLbl = new Label("Username");
		emailLbl = new Label("Email");
		
		userNameTxt = new TextField();
		emailTxt = new TextField();
		
		continueBtn = new Button("Continue");
		continueBtn.setOnAction(event -> {
			String username = userNameTxt.getText();
			String email = emailTxt.getText();
					
			ForgotPassObject forgotPassEvent = new ForgotPassObject(this, username, email);
			
			if(Main_Window.getForgotPassListener() != null) {
				Main_Window.getForgotPassListener().forgotPassBtnClicked(forgotPassEvent);
			}
			if(isValid == true) {
				AccountFoundAlert alert2 = new AccountFoundAlert();
				stage.setScene(ForgotPasswordPane2.getScene());
				ForgotPasswordPane2.top2Lbl.setText("Hello" + "!");
			} else {
				InvalidInfoAlert alert = new InvalidInfoAlert();
			}
			
		});
		
		
		mainPane.add(topLbl, 0, 0, 3, 1);
		mainPane.add(topLbl2, 0, 1, 3, 1);
		mainPane.add(usernameLbl, 0, 2);
		mainPane.add(userNameTxt, 1, 2);
		mainPane.add(emailLbl, 0, 3);
		mainPane.add(emailTxt, 1, 3);
		mainPane.add(continueBtn, 1, 5);
		mainPane.setHalignment(continueBtn, HPos.RIGHT);
		
		scene = new Scene(mainPane, 400, 300);
		
	}
	public void showStage() {
		stage.show();
		stage.setScene(scene);
	}
	public static void setIsInfo(boolean valid) {
		isValid = valid;
	}
	public static void setUser(NewUser newUser) {
		user = newUser;
	}
	public static Stage getStage() {
		return stage;
	}

}
