package GameBackend.business.abstracts;

import GameBackend.entities.Order;

public interface OrderService {
	public void add(Order order);
	public void delete(Order order);
	public void update(Order order);
}
