package listener;

public class ListenerMethods {

	private static ButtonListener2 buttonListener2 = null;

	public void setEventListener2(ButtonListener2 buttonListener2) {
		this.buttonListener2 = buttonListener2;
	}

	public static ButtonListener2 getButtonListener2() {
		return buttonListener2;
	}

}
