package GameBackend.business.abstracts;

import GameBackend.entities.Campaign;
import GameBackend.entities.Game;
import GameBackend.entities.Order;
import GameBackend.entities.User;

public interface SaleService {
	public void buy(
			User user,
			Game[] games,
			Order order,
			Campaign campaign
			);
}
