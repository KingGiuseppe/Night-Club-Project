package buttons_for_login_panel;

import alerts.LogoutAlert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import view_for_login.Login_Pane;

public class MenuBarForLogout {

	private MenuBar menuBarLogout;
	private Menu fileMenu;
	private MenuItem logoutMenuItem;

	public MenuBar getMenu(int i) {
		menuBarLogout = new MenuBar();
		fileMenu = new Menu("File");
		logoutMenuItem = new MenuItem("Logout");
		fileMenu.getItems().add(logoutMenuItem);
		menuBarLogout.getMenus().add(fileMenu);

		logoutMenuItem.setOnAction(event -> {
			Login_Pane.clearFields();
			LogoutAlert alert = new LogoutAlert(i);
		});
		return menuBarLogout;
	}
}
