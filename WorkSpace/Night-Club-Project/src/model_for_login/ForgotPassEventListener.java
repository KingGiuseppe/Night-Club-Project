package model_for_login;

import java.util.EventListener;

public interface ForgotPassEventListener extends EventListener {
	public void forgotPassBtnClicked(ForgotPassObject ev);
}
