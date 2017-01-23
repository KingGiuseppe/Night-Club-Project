package view_for_manager;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class PaneForGuestNotification {

	private static Scene scene;
	private VBox mainPane;
	private TextArea messageArea;
	private Button backBtn;
	private Button submitMessage;

	public PaneForGuestNotification() {
		mainPane = new VBox();
		messageArea = new TextArea();
		
		backBtn = new Button("Back");
		backBtn.setOnAction(event -> {
			ManagerPane.getStage().setScene(ManagerPane.getScene());
		});
		
		submitMessage = new Button("Submit Message");
		submitMessage.setOnAction(event -> {
			
		});
		
		mainPane.getChildren().addAll(messageArea, submitMessage, backBtn);
		
		scene = new Scene(mainPane, 500, 500);
	}
		
	public static Scene getScene() {
		return scene;
	}
}
