package view_for_manager;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PaneForGuestNotification {

	private static Scene scene;
	private VBox mainPane;
	private TextArea messageArea;
	private Button backBtn;
	private Button submitMessage;
	private TextField usernameTxt;
	private TextField passtxt;
	private TextField fromEmailTxt;
	private TextField toEmailTxt;
	private TextField subjectTxt;

	public PaneForGuestNotification() {
		mainPane = new VBox();
		messageArea = new TextArea();
		usernameTxt = new TextField();
		usernameTxt.setText("username");
		passtxt = new TextField();
		passtxt.setText("password");
		fromEmailTxt = new TextField();
		fromEmailTxt.setText("From Email");
		toEmailTxt = new TextField();
		toEmailTxt.setText("To Email");
		subjectTxt = new TextField();
		subjectTxt.setText("Subject");
		
		
		backBtn = new Button("Back");
		backBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(ManagerPane.getScene());
		});
		
		submitMessage = new Button("Submit Message");
		submitMessage.setOnAction(event -> {
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", 587);
			
			final String username = usernameTxt.getText();
			final String password = passtxt.getText();
			String fromEmailAddress = fromEmailTxt.getText();
			String toEmailAddress = toEmailTxt.getText();
			String subject = subjectTxt.getText();
			String textMessage = messageArea.getText();
			
			Session session = Session.getDefaultInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});
			
			try {
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(fromEmailAddress));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress));
				message.setSubject(subject);
				message.setText(textMessage);
				Transport.send(message);
				
				EmailSentAlert esa = new EmailSentAlert();
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
			
			ManagerPane.getStage().setScene(ManagerPane.getScene());
			
		});
		
		mainPane.getChildren().addAll(usernameTxt, passtxt, fromEmailTxt, toEmailTxt, subjectTxt, messageArea, submitMessage, backBtn);
		
		scene = new Scene(mainPane, 500, 500);
	}
		
	public static Scene getScene() {
		return scene;
	}
}
