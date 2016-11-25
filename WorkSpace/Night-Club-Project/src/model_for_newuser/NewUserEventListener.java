package model_for_newuser;

import java.util.EventListener;

public interface NewUserEventListener extends EventListener {
	public void createBtnClicked(NewUserObject ev);
}
