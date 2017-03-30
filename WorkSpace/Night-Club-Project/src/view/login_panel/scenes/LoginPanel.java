package view.login_panel.scenes;

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
import view.login_panel.panes.LoginPanelButtonPane;
import view.login_panel.panes.LoginPanelLabelPane;
import view.login_panel.panes.LoginPanelTextFieldPane;

public class LoginPanel {

	private static VBox loginMainPane;
	private static Scene scene;

	public LoginPanel() {
		new LoginPanelButtonPane();
		new LoginPanelTextFieldPane();
		new LoginPanelLabelPane();

		loginMainPane = new VBox(1);
		loginMainPane.setPadding(new Insets(25, 25, 25, 25));
		loginMainPane.setAlignment(Pos.CENTER);

		loginMainPane.getChildren().addAll(LoginPanelLabelPane.getPane(), LoginPanelTextFieldPane.getPane(),
				LoginPanelButtonPane.getPane());

		Platform.runLater(() -> loginMainPane.requestFocus());
		setBackground();
		scene = new Scene(loginMainPane, 360, 540);
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setBackground() {
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://2.bp.blogspot.com/-O7zb2a3_ECw/UNM_aS7jEFI/AAAAAAAAAKM/o4qt9uo_1HM/s1600/bg.png", 360,
						640, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		loginMainPane.setBackground(new Background(myBI));

	}

}
