import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Email {
	
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", 587);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Username");
		final String username = scanner.nextLine();
		
		System.out.println("Pass");
		final String password = scanner.nextLine();
		
		System.out.println("From email: ");
		String fromEmailAddress = scanner.nextLine();
		
		System.out.println("To email");
		String toEmailAddress = scanner.nextLine();
		
		System.out.println("Subject");
		String subject = scanner.nextLine();
		
		System.out.println("Message");
		String textMessage = scanner.nextLine();
		
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
			
			System.out.println("\nYour Message delivered successfully ....");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
