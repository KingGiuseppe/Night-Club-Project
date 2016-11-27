package bags;

import java.util.ArrayList;
import java.util.ListIterator;

import model_for_newuser.NewUser;

public class ManagerAccountBag {
private static ArrayList<NewUser> managerAccounts;
	
	public ManagerAccountBag() {
		super();
		this.managerAccounts = new ArrayList<NewUser>();
		this.managerAccounts.add(new NewUser("e","e","e","e","e","e","e", 0));
		this.managerAccounts.add(new NewUser("f","f","","f","f","f","f", 0));
	}
	
	public void addGuestAcc(NewUser acc) {
		managerAccounts.add(acc);
	}
	
	public ArrayList<NewUser> getGuestAccList() {
		return managerAccounts;
	}
	
	public static NewUser getUser(String username, String pass) {
		ListIterator<NewUser> lIter;
		lIter = managerAccounts.listIterator();
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
