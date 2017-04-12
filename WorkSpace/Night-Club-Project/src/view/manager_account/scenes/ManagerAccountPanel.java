package view.manager_account.scenes;

import buttons_for_login_panel.MenuBarForLogout;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import view.manager_account.panes.ButtonsForManagerPane;
import view.manager_account.panes.ManagerPanelLabelPane;

public class ManagerAccountPanel {

	private static BorderPane managerAccountPane;
	private static Scene scene;

	public ManagerAccountPanel() {
		new ButtonsForManagerPane();
		new MenuBarForLogout();
		new ManagerPanelLabelPane();

		managerAccountPane = new BorderPane();
		managerAccountPane.setLeft(ButtonsForManagerPane.getPane());
		managerAccountPane.setTop(MenuBarForLogout.getMenu(1));
		managerAccountPane.setCenter(ManagerPanelLabelPane.getPane());
		setBackground();
		scene = new Scene(managerAccountPane, 530, 380);
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setBackground() {
		BackgroundImage myBI = new BackgroundImage(
				new Image(
						"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqfa9vQe4zD00N-ajy-RADGBTA15bthYnwKl3U9M7H5E7OWlVo",
						550, 450, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		managerAccountPane.setBackground(new Background(myBI));
	}

}
