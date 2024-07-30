package cs3220;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cs3220.model.UserEntry;

@Component
public class UserComponent {
	private List<UserEntry> users;
	
	public UserComponent() {
		this.users = new ArrayList<UserEntry>();
	}
	
	public Boolean checkUserExist(String email) {
		System.out.println("checkUserExist " + email);
		for (UserEntry user : this.users) {
			if (user.getEmail().equals(email)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
	
	public UserEntry getUserByEmail(String email) {
		for (UserEntry user: this.users) {
			if (user.getEmail().equals(email)) {
				return user;
			} else {
				continue;
			}
		}
		return null;
	}
	public UserEntry getUserById(int id) {
		for (UserEntry user: this.users) {
			if (user.getId() == id) {
				return user;
			} else {
				continue;
			}
		}
		return null;
	}

	public List<UserEntry> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntry> users) {
		this.users = users;
	}
}
