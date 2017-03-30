package view.login_panel.new_user.scenes;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import view.login_panel.new_user_panel_1.panes.NewUserPane1LabelPane;
import view.login_panel.new_user_panel_1.panes.NewUserPanel1ButtonPane;
import view.login_panel.new_user_panel_1.panes.NewUserPanel1TextFieldPane;

public class NewUserPanel1 {

	private static VBox newUserPane;
	private static Scene scene;

	public NewUserPanel1() {
		new NewUserPanel1ButtonPane();
		new NewUserPanel1TextFieldPane();
		new NewUserPane1LabelPane();

		newUserPane = new VBox(10);
		newUserPane.setAlignment(Pos.CENTER);
		newUserPane.setPadding(new Insets(25, 25, 25, 25));

		newUserPane.getChildren().addAll(NewUserPane1LabelPane.getPane(), NewUserPanel1TextFieldPane.getPane(),
				NewUserPanel1ButtonPane.getPane());

		Platform.runLater(() -> newUserPane.requestFocus());
		setBackground();
		scene = new Scene(newUserPane, 550, 370);
	}

	public static Scene getScene() {
		return scene;
	}

	private void setBackground() {
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://wallpapercave.com/wp/BhcQpIw.jpg", 360, 640, false, true), BackgroundRepeat.REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		newUserPane.setBackground(new Background(myBI));
	}

}
