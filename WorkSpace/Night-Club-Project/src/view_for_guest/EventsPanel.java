package view_for_guest;

import bags.CreateEventBag;
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
	private int num;
	private CreateEventBag bag;
	private Button rListBtn;
	private HBox btnPane;
	private ScrollPane sp;
	private static Scene scene;

	public EventsPanel() {
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
		rListBtn = new Button("Refresh");
		rListBtn.setFont(new Font("Arial Rounded MT Bold", 20));
		rListBtn.setOnAction(event -> {
			
			

		});
		backBtn.setFont(new Font("Arial Rounded MT Bold", 20));
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
		btnPane.getChildren().addAll(backBtn, rListBtn);

		borderPane.setBottom(btnPane);
		backBtn.setAlignment(Pos.BOTTOM_RIGHT);
		
		scene = new Scene(borderPane, 500, 500);
		/*
		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"http://www.wallcoo.net/cartoon/abstract_rainbow_Colours_13_1920x1200/wallpapers/1680x1050/Light%20Spectrum%20Abstract%20Background_95.jpg",
						360, 640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		eventPane.setBackground(new Background(myBI));
*/
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

	public void setAccount(int num) {
		this.num = num;
	}

	public static Scene getScene() {
		return scene;
	}
	
}
