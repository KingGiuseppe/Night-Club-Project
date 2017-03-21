package view_for_guest;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import view_for_manager.ManagerPane;
import view_for_owner.OwnerPane;

public class EventsPanel {

	private Label topLabel;
	private static VBox eventPane;
	private BorderPane borderPane;
	private HBox labelPane;
	private Button backBtn;
	private HBox btnPane;
	private ScrollPane sp;
	private static Scene scene;

	public EventsPanel(int num) {
		borderPane = new BorderPane();
		eventPane = new VBox();
		eventPane.setBorder(new Border(
				new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		eventPane.setAlignment(Pos.CENTER);
		sp = new ScrollPane();
		sp.setContent(eventPane);
		borderPane.setCenter(sp);
		
		topLabel = new Label("Events and Dates");
		topLabel.setFont(new Font("Arial Rounded MT Bold", 50));
		backBtn = new Button("Back");
		backBtn.setFont(new Font("Arial Rounded MT Bold", 30));
		backBtn.setOnAction(event -> {
			if (num == 2) {
				OwnerPane.getStage().setScene(OwnerPane.getScene());
			} else if (num == 1) {
				ManagerPane.getStage().setScene(ManagerPane.getScene());
			} else {
				GuestPane.getStage().setScene(GuestPane.getScene());
			}
		});
		labelPane = new HBox();
		labelPane.getChildren().add(topLabel);
		labelPane.setAlignment(Pos.CENTER);
		btnPane = new HBox();
		borderPane.setTop(labelPane);
		
		btnPane.setAlignment(Pos.CENTER_RIGHT);
		btnPane.getChildren().addAll(backBtn);

		borderPane.setBottom(btnPane);
		backBtn.setAlignment(Pos.BOTTOM_RIGHT);
		
		scene = new Scene(borderPane, 600, 700);
		
		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"http://urdu-mag.com/blog/wp-content/uploads/2012/11/large/abstract+backgrounds+15.jpg",
						360, 640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		borderPane.setBackground(new Background(myBI));

	}

	public Pane getPane() {
		return borderPane;
	}

	public static VBox getEventPane() {
		return eventPane;
	}
	public void setEventPane(GridPane grid) {
		eventPane.getChildren().add(grid);
	}

	public static Scene getScene() {
		return scene;
	}
	
}
