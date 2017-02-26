package bags;

import java.util.ArrayList;
import java.util.ListIterator;

import alerts.PasswordChangedAlert;
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
		this.accounts.add(
				new NewUser("Giuseppe", "Barbieri", "male", "11766", "kinggiuseppe1@gmail.com", "Admin", "admin", 2));
	}

	public void addGuestAcc(NewUser acc) {
		accounts.add(acc);

	}

	public ArrayList<NewUser> getGuestAccList() {
		return accounts;
	}

	public NewUser getUser(String username, String pass) {

		int index = 0;
		for (NewUser e : accounts) {
			if (accounts.get(index).getUsername().equalsIgnoreCase(username)) {
				if (accounts.get(index).getPassword().equals(pass)) {
					return e;
				}
			}
			index++;
		}
		return null;
	}

	public NewUser getUser2(String username, String email) {
		int index = 0;
		for (NewUser e : accounts) {
			if (accounts.get(index).getUsername().equalsIgnoreCase(username)) {
				if (accounts.get(index).getEmail().equalsIgnoreCase(email)) {
					return e;
				}
			}
			index++;
		}
		return null;

	}

	public NewUser getUser(String username) {
		int index = 0;
		for (NewUser e : accounts) {
			if (accounts.get(index).getUsername().equalsIgnoreCase(username)) {
				return e;
			}
			index++;
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

	public void setuser(NewUser user) {
		ListIterator<NewUser> lIter;
		lIter = accounts.listIterator();
		int index = 0;
		while (lIter.hasNext()) {
			if (accounts.get(index).getUsername().equalsIgnoreCase(user.getUsername())) {
				accounts.set(index, user);
				PasswordChangedAlert alert = new PasswordChangedAlert();
			}
			index++;
		}

	}

}
