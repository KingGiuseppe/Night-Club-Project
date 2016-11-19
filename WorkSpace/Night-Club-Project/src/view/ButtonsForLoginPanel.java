package view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonsForLoginPanel {
	private Button loginBtn;
	private Button newUserBtn;
	private Button forgotPassBtn;
	private HBox pane;

	public ButtonsForLoginPanel() {
		loginBtn = new Button("Login");
		NewUserPane nup = new NewUserPane();
		loginBtn.setOnAction(event -> {
			
		});
		
		newUserBtn = new Button("New User?");
		
		newUserBtn.setOnAction(event -> {
			nup.getStage();
		});
		
		forgotPassBtn = new Button("Forgot Password?");
		forgotPassBtn.setOnAction(event -> {
			System.out.println("Hello Forgot Password");
		});
		
		pane = new HBox(20);
		pane.getChildren().addAll(newUserBtn, forgotPassBtn, loginBtn);
		
	}
	
	public Pane getPane() {
		return pane;
	}
	
	public Button getLoginBtn() {
		return loginBtn;
	}
	
	public Button getNewUserBtn() {
		return newUserBtn;
	}
	
	public Button getForgotPassBtn() {
		return forgotPassBtn;
	}
}
