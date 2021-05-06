package GameBackend.business.concretes;

import GameBackend.business.abstracts.UserCheckService;
import GameBackend.entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		return true;
	}

}
