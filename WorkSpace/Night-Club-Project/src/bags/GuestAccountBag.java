package bags;

import java.util.ArrayList;

import model_for_newuser.NewUser;

public class GuestAccountBag {

	private static ArrayList<NewUser> guestAccounts;
	
	public GuestAccountBag() {
		super();
		this.guestAccounts = new ArrayList<NewUser>();
	}
	
	public void addGuestAcc(NewUser acc) {
		guestAccounts.add(acc);
	}
	
	public ArrayList<NewUser> getGuestAccList() {
		return guestAccounts;
	}
}
