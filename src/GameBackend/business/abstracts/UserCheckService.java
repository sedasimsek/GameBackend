package GameBackend.business.abstracts;

import GameBackend.entities.User;

public interface UserCheckService {
	public boolean checkIfRealPerson(User user);
}
