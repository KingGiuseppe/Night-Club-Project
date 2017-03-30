package view.new_user.scenes;

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
import view.new_user_panel_2.panes.NewUserPane2ButtonPane;
import view.new_user_panel_2.panes.NewUserPane2TextFieldPane;

public class NewUserPanel2 {

	private static VBox newUserPane2;
	private static Scene scene;

	public NewUserPanel2() {
		new NewUserPane2TextFieldPane();
		new NewUserPane2ButtonPane();

		newUserPane2 = new VBox(10);
		newUserPane2.setAlignment(Pos.CENTER);
		newUserPane2.setPadding(new Insets(25, 25, 25, 25));

		newUserPane2.getChildren().addAll(NewUserPane2TextFieldPane.getPane(), NewUserPane2ButtonPane.getPane());

		Platform.runLater(() -> newUserPane2.requestFocus());
		setBackground();

		scene = new Scene(newUserPane2, 500, 400);
	}

	public static Scene getScene() {
		return scene;
	}

	private void setBackground() {
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://wallpapercave.com/wp/BhcQpIw.jpg", 360, 640, false, true), BackgroundRepeat.REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		newUserPane2.setBackground(new Background(myBI));
	}

}
