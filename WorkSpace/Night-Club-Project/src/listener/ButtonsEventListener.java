package listener;

public class ButtonsEventListener {
	
	private static ButtonListener buttonListener;

	public void setEventListener(ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}

	public static ButtonListener getButtonListener() {
		return buttonListener;
	}

}
