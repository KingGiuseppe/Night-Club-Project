package bags;

import java.util.ArrayList;
import java.util.ListIterator;

import model_for_newuser.NewUser;

public class AccountBag {

	private ArrayList<NewUser> Accounts;
	
	public AccountBag() {
		super();
		this.Accounts = new ArrayList<NewUser>();
		this.Accounts.add(new NewUser("a","a","a","a","a","a","a", 0));
		this.Accounts.add(new NewUser("b","b","b","b","b","b","b", 0));
		this.Accounts.add(new NewUser("c","c","c","c","c","c","c", 0));
		this.Accounts.add(new NewUser("e", "e", "e", "e", "e", "e", "e", 1));
		this.Accounts.add(new NewUser("f", "f", "f", "f", "f", "f", "f", 1));
		this.Accounts.add(new NewUser("g", "g", "g", "g", "g", "g", "g", 1));
		this.Accounts.add(new NewUser("Giuseppe","Barbieri","male","11766","kinggiuseppe1@gmail.com","Admin","admin", 2));
	}
	
	public void addGuestAcc(NewUser acc) {
		Accounts.add(acc);
		
	}
	
	public ArrayList<NewUser> getGuestAccList() {
		return Accounts;
	}
	
	public NewUser getUser(String username, String pass) {
		ListIterator<NewUser> lIter;
		lIter = Accounts.listIterator();
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
