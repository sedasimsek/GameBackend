package GameBackend.business.abstracts;

import GameBackend.entities.Game;

public interface GameService {
	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);
}
