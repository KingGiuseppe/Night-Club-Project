package bags;

import java.util.ArrayList;
import java.util.ListIterator;

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
	
	public NewUser getUser(String username, String pass) {
		System.out.println("Here 2");
		ListIterator<NewUser> lIter;
		lIter = guestAccounts.listIterator();
		while(lIter.hasNext()) {
			System.out.println("Here 3");
			if(lIter.previous().getUsername().equalsIgnoreCase(username)) {
				System.out.println("Found");
				if(lIter.next().getPassword().equals(pass)){
					System.out.println("Found");
				return lIter.next();
				}
			}
		}
		System.out.println("Here 4");
		return null;
		
	}
}
