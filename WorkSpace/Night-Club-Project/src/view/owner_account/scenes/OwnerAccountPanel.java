package view.owner_account.scenes;

import buttons_for_login_panel.MenuBarForLogout;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import view.owner_account.panes.OwnerAccountPaneButtonPanel;
import view.owner_account.panes.OwnerAccountPaneLabelPanel;

public class OwnerAccountPanel {

	private static Scene scene;
	private static BorderPane ownerAccountPane;

	public OwnerAccountPanel() {
		new OwnerAccountPaneButtonPanel();
		new MenuBarForLogout();
		new OwnerAccountPaneLabelPanel();

		ownerAccountPane = new BorderPane();
		ownerAccountPane.setTop(MenuBarForLogout.getMenu(2));
		ownerAccountPane.setCenter(OwnerAccountPaneLabelPanel.getLabelPane());
		ownerAccountPane.setBottom(OwnerAccountPaneButtonPanel.getButtonPane());

		setBackground();
		scene = new Scene(ownerAccountPane, 750, 400);
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setBackground() {
		BackgroundImage myBI = new BackgroundImage(
				new Image("http://jdnowweb-s.cdn.ubi.com/prod/20170215_1121/web/img/home/backgrounds/bg-stars.jpg", 750,
						400, false, true),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		ownerAccountPane.setBackground(new Background(myBI));
	}

}
