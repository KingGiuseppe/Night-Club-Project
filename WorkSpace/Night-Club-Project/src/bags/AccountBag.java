package bags;

import java.util.ArrayList;
import java.util.ListIterator;
import model_for_newuser.NewUser;

public class AccountBag {

	private ArrayList<NewUser> accounts;
	private ArrayList<NewUser> managerList;

	public AccountBag() {
		super();
		this.accounts = new ArrayList<NewUser>();
		this.managerList = new ArrayList<NewUser>();
		this.accounts.add(new NewUser("a", "a", "a", "a", "a", "a", "a", 0));
		this.accounts.add(new NewUser("b", "b", "b", "b", "b", "b", "b", 0));
		this.accounts.add(new NewUser("c", "c", "c", "c", "c", "c", "c", 0));
		this.accounts.add(new NewUser("e", "e", "e", "e", "e", "e", "e", 1));
		this.accounts.add(new NewUser("f", "f", "f", "f", "f", "f", "f", 1));
		this.accounts.add(new NewUser("g", "g", "g", "g", "g", "g", "g", 1));
		this.accounts.add(new NewUser("Giuseppe", "Barbieri", "male", "11766", "kinggiuseppe1@gmail.com", "Admin", "admin", 2));
	}

	public void addGuestAcc(NewUser acc) {
		accounts.add(acc);

	}

	public ArrayList<NewUser> getGuestAccList() {
		return accounts;
	}

	public NewUser getUser(String username, String pass) {
		ListIterator<NewUser> lIter;
		lIter = accounts.listIterator();
		int index = 0;
		while (lIter.hasNext()) {
			if (lIter.next().getUsername().equalsIgnoreCase(username)) {
				if (lIter.previous().getPassword().equals(pass)) {
					return lIter.next();
				}
			}
		}
		return null;

	}

	public ArrayList<NewUser> getManager() {
		for (NewUser e : accounts) {
			if (e.getType() == 1) {
				managerList.add(e);
			}
		}
		return managerList;

	}

	@Override
	public String toString() {
		return "AccountBag [accounts=" + accounts + ", managerList=" + managerList + "]";
	}
	
	
}
