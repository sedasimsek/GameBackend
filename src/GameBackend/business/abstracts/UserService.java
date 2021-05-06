package GameBackend.business.abstracts;

import GameBackend.entities.User;

public interface UserService {
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	
}
