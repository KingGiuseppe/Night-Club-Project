package view_for_owner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import alerts.AlertForMessageSaved;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class SendMessagePane {

	private VBox mainPane;
	private Label welcomeLbl;
	private TextArea textArea;
	private Button submitBtn;
	private Button backBtn;
	private static Scene scene;

	public SendMessagePane() {
		mainPane = new VBox();
		welcomeLbl = new Label("Enter your message below to post on Manager Pane");
		textArea = new TextArea();
		submitBtn = new Button("Submit");
		submitBtn.setOnAction(event -> {
			ObjectOutputStream outputStream = null;
			try {
				outputStream = new ObjectOutputStream(new FileOutputStream("ManagerMessage.dat"));
				outputStream.writeObject(textArea.getText());
				AlertForMessageSaved afms = new AlertForMessageSaved();
				OwnerPane.getStage().setScene(OwnerPane.getScene());

			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				try {
					if (outputStream != null) {
						outputStream.flush();
						outputStream.close();
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

		});

		backBtn = new Button("Back");
		backBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(OwnerPane.getScene());
		});

		mainPane.getChildren().addAll(welcomeLbl, textArea, submitBtn, backBtn);
		scene = new Scene(mainPane, 500, 500);
	}

	public static Scene getScene() {
		return scene;
	}

}
