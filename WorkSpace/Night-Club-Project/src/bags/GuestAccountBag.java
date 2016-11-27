package bags;

import java.util.ArrayList;
import java.util.ListIterator;

import model_for_newuser.NewUser;

public class GuestAccountBag {

	private static ArrayList<NewUser> guestAccounts;
	
	public GuestAccountBag() {
		super();
		this.guestAccounts = new ArrayList<NewUser>();
		this.guestAccounts.add(new NewUser("a","a","a","a","a","a","a", 0));
		this.guestAccounts.add(new NewUser("b","b","b","b","b","b","b", 0));
		this.guestAccounts.add(new NewUser("c","c","c","c","c","c","c", 0));
	}
	
	public void addGuestAcc(NewUser acc) {
		guestAccounts.add(acc);
		
	}
	
	public ArrayList<NewUser> getGuestAccList() {
		return guestAccounts;
	}
	
	public NewUser getUser(String username, String pass) {
		ListIterator<NewUser> lIter;
		lIter = guestAccounts.listIterator();
		int index = 0;
		while(lIter.hasNext()) {
			if(lIter.next().getUsername().equalsIgnoreCase(username)) {
				if(lIter.previous().getPassword().equals(pass)){
				return lIter.next();
				}
			}
		}
		return null;
		
	}
}
