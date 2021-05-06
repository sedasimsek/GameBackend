package GameBackend.business.concretes;

import GameBackend.business.abstracts.OrderService;
import GameBackend.entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getGameId() + " added!");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getGameId() + " deleted!");
		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getGameId() + " deleted!");
		
	}

}
