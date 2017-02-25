package view_for_manager;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EmailLoginPane {
	
	private GridPane loginMainPane;
	private Label welcomeLbl;
	private Label loginLbl;
	private Label unLbl;
	private Label passLbl;
	private TextField unTxt;
	private TextField passTxt;
	private Button loginBtn;
	private String username;
	private String password;
	private static Scene scene;
	private static Stage stage;

	public EmailLoginPane() {
		stage = new Stage();
		
		
		
		loginMainPane = new GridPane();
		loginMainPane.setAlignment(Pos.CENTER);
		loginMainPane.setHgap(10);
		loginMainPane.setVgap(10);
		loginMainPane.setPadding(new Insets(25, 25, 25, 25));
		
		welcomeLbl = new Label("Login To your email");
		welcomeLbl.setFont(Font.font(20));
		
		loginLbl = new Label("Login");
		loginLbl.setFont(Font.font(15));
		unLbl = new Label("Username: ");
		passLbl = new Label("Password: ");
		unTxt = new TextField();
		passTxt = new TextField();
		
		loginBtn = new Button("Login");
		loginBtn.setOnAction(event -> {
			username = unTxt.getText();
			password = passTxt.getText();
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", 587);
			Session session = Session.getDefaultInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});
			
		});
		loginMainPane.add(welcomeLbl, 0, 0, 2, 1);
		loginMainPane.add(loginLbl, 0, 1);
		loginMainPane.add(unLbl, 0, 3);
		loginMainPane.add(unTxt, 1, 3);
		loginMainPane.add(passLbl, 0, 4);
		loginMainPane.add(passTxt, 1, 4);
		loginMainPane.add(loginBtn, 1, 5);
		
		scene = new Scene(loginMainPane);
		stage.setScene(scene);
		stage.setTitle("Email Login");
		
	}
	
	public static Stage getStage() {
		return stage;
	}
	
	public static void showStage() {
		stage.show();
		stage.setScene(scene);
	}
	public static void closeStage() {
		stage.close();
	}
	
	
	public Pane getPane() {
		return loginMainPane;
	}
	
	public String getUserName() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
}