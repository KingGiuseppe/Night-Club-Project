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

import alerts.AlertForNewUser;
import alerts.EmailSentAlert;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import view_for_owner.OwnerPane;

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
	private HBox buttonPane;

	public PaneForGuestNotification(int i) {
		mainPane = new VBox(10);
		mainPane.setPadding(new Insets(0, 25, 25, 25));
		buttonPane = new HBox(15);
		messageArea = new TextArea();
		messageArea.setFont(new Font("Arial Rounded MT Bold", 15));
		usernameTxt = new TextField();
		usernameTxt.setPromptText("Username");
		usernameTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		passtxt = new TextField();
		passtxt.setFont(new Font("Arial Rounded MT Bold", 20));
		passtxt.setPromptText("password");
		fromEmailTxt = new TextField();
		fromEmailTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		fromEmailTxt.setPromptText("From Email");
		toEmailTxt = new TextField();
		toEmailTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		toEmailTxt.setPromptText("To Email");
		subjectTxt = new TextField();
		subjectTxt.setFont(new Font("Arial Rounded MT Bold", 20));
		subjectTxt.setPromptText("Subject");

		backBtn = new Button("Back");
		backBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		backBtn.setOnAction(event -> {
			if (i == 1) {
				OwnerPane.getStage().setScene(OwnerPane.getScene());
			} else if (i == 2) {
				ManagerPane.getStage().setScene(ManagerPane.getScene());
			}
		});

		submitMessage = new Button("Submit Message");
		submitMessage.setFont(new Font("Arial Rounded MT Bold", 20));
		submitMessage.setOnAction(event -> {
			
			if(usernameTxt.getText().equals("") || passtxt.getText().equals("") || fromEmailTxt.getText().equals("") || 
					toEmailTxt.getText().equals("") || subjectTxt.getText().equals("") || messageArea.getText().equals("")) {
				AlertForNewUser alert = new AlertForNewUser();
				
			} else {
				
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
			}
		});
		BackgroundImage myBI = new BackgroundImage(
				new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqfa9vQe4zD00N-ajy-RADGBTA15bthYnwKl3U9M7H5E7OWlVo", 550,
						450, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		buttonPane.getChildren().addAll(submitMessage, backBtn);
		buttonPane.setAlignment(Pos.CENTER_RIGHT);
		mainPane.setBackground(new Background(myBI));
		mainPane.getChildren().addAll(usernameTxt, passtxt, fromEmailTxt, toEmailTxt, subjectTxt, messageArea,
				buttonPane);
		Platform.runLater(() -> mainPane.requestFocus());
		scene = new Scene(mainPane, 450, 350);
	}

	public static Scene getScene() {
		return scene;
	}
}
