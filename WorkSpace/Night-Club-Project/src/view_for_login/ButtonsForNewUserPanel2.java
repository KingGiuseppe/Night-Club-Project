package view_for_login;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import model.NewUserEventListener;
import model.NewUserObject;

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
			
			NewUserObject userEvent = new NewUserObject(this, ButtonsForNewUserPanel.getPerson().getFirstName(), ButtonsForNewUserPanel.getPerson().getLastName(), 
					ButtonsForNewUserPanel.getPerson().getGender(), ButtonsForNewUserPanel.getPerson().getZip(), emailAddress, username, password, 0);
			
			if(Main_Window.getListener() != null) {
				Main_Window.getListener().createBtnClicked(userEvent);
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
