package view_for_owner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import alerts.AlertForMessageSaved;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class SendMessagePane {

	private VBox mainPane;
	private Label welcomeLbl;
	private TextArea textArea;
	private Button submitBtn;
	private Button backBtn;
	private HBox btnPane;
	private static Scene scene;

	public SendMessagePane() {
		mainPane = new VBox(20);
		mainPane.setPadding(new Insets(25, 25, 25, 25));
		btnPane = new HBox(10);
		btnPane.setAlignment(Pos.CENTER_RIGHT);
		welcomeLbl = new Label("Enter your message below to post on bulletin");
		welcomeLbl.setFont(new Font("Arial Rounded MT Bold", 20));
		textArea = new TextArea();
		textArea.setFont(new Font("Arial Rounded MT Bold", 15));
		submitBtn = new Button("Submit");
		submitBtn.setFont(new Font("Arial Rounded MT Bold", 15));
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
		backBtn.setFont(new Font("Arial Rounded MT Bold", 15));
		backBtn.setOnAction(event -> {
			OwnerPane.getStage().setScene(OwnerPane.getScene());
		});
		btnPane.getChildren().addAll(submitBtn, backBtn);
		mainPane.getChildren().addAll(welcomeLbl, textArea, btnPane);
		scene = new Scene(mainPane, 500, 300);
	}

	public static Scene getScene() {
		return scene;
	}

}
