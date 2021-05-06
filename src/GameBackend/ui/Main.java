package GameBackend.ui;

import java.util.Scanner;

import GameBackend.adapters.MernisServiceAdapter;
import GameBackend.business.concretes.AuthManager;
import GameBackend.business.concretes.CampaignManager;
import GameBackend.business.concretes.GameManager;
import GameBackend.business.concretes.OrderManager;
import GameBackend.business.concretes.SaleManager;
import GameBackend.business.concretes.UserManager;
import GameBackend.entities.Campaign;
import GameBackend.entities.Game;
import GameBackend.entities.Order;
import GameBackend.entities.User;

public class Main {

	public static void main(String[] args) {
		AuthManager authManager = new AuthManager();
		GameManager gameManager = new GameManager();
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		OrderManager orderManager = new OrderManager();
		SaleManager saleManager = new SaleManager(orderManager);

		
		System.out.println("Welcome, please login or register");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Your firstname ");
		String firstName = input.next();
		System.out.println("Your lastname ");
		String lastName = input.next();
		System.out.println("Your email ");
		String email = input.next();
		System.out.println("Your password ");
		String password = input.next();
		System.out.println("Your nationality id ");
		String nationalityId = input.next();
		
		User user = new User();
		user.setId(1);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setNationalityIdentifier(nationalityId);
		
		authManager.register(user);
		authManager.login(user);
		authManager.logout(user);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Imagination");
		game1.setUnitPrice(150);
		gameManager.add(game1);
		
		Game game2 = new Game();
		game2.setId(1);
		game2.setName("Imagination");
		game2.setUnitPrice(150);
		gameManager.add(game2);
		
		Game[] games = new Game[] {game1, game2};
		
		Order order = new Order(1,2,2);
		
		Campaign campaign = new Campaign(1,5);
		campaignManager.add(campaign);
		
		saleManager.buy(user, games, order, campaign);
		
	}

}
