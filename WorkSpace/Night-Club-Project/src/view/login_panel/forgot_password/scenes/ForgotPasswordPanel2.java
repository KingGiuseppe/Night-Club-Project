package view.login_panel.forgot_password.scenes;

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
import view.login_panel.forgot_password_2.buttons.ForgotPasswordPanel2OkButton;
import view.login_panel.forgot_password_2.panes.ForgotPasswordPanel2LabelPane;
import view.login_panel.forgot_password_2.panes.ForgotPasswordPanel2TextFieldPane;

public class ForgotPasswordPanel2 {

	private VBox forgotPasswordPane;
	private static Scene scene;

	public ForgotPasswordPanel2() {
		new ForgotPasswordPanel2TextFieldPane();
		new ForgotPasswordPanel2LabelPane();
		new ForgotPasswordPanel2OkButton();

		forgotPasswordPane = new VBox(10);
		forgotPasswordPane.setAlignment(Pos.CENTER);
		forgotPasswordPane.setPadding(new Insets(25, 25, 25, 25));

		forgotPasswordPane.getChildren().addAll(ForgotPasswordPanel2LabelPane.getPane(),
				ForgotPasswordPanel2TextFieldPane.getPane(), ForgotPasswordPanel2OkButton.getOkButton());

		Platform.runLater(() -> forgotPasswordPane.requestFocus());
		setBackground();
		scene = new Scene(forgotPasswordPane, 450, 350);

	}

	public static Scene getScene() {
		return scene;
	}

	private void setBackground() {
		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"https://s-media-cache-ak0.pinimg.com/originals/0f/fc/80/0ffc8072381c1cd334a9d51872cd9b9c.png",
						360, 640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		forgotPasswordPane.setBackground(new Background(myBI));
	}

}
