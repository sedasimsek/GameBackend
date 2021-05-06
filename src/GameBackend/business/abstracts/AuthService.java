package GameBackend.business.abstracts;

import GameBackend.entities.User;

public interface AuthService {
	void login(User user);
	void register(User user);
	void logout(User user);
}
