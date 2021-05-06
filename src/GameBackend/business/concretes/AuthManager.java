package GameBackend.business.concretes;

import GameBackend.business.abstracts.AuthService;
import GameBackend.entities.User;

public class AuthManager implements AuthService{

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " Login OK!");
		
	}

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + " Register OK!");
		
	}

	@Override
	public void logout(User user) {
		System.out.println(user.getFirstName() + " Exit!");
		
	}

}
