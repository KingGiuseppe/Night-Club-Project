package listener;

public class ButtonEventListenerMethods {

	private static ButtonListener buttonListener;

	public void setEventListener(ButtonListener buttonListener) {
		ButtonEventListenerMethods.buttonListener = buttonListener;
	}

	public static ButtonListener getButtonListener() {
		return buttonListener;
	}

}
