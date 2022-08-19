package abstracts;

import entities.Game;

public interface IGameService {
	
	public void addGame(Game game);
	public void deleteGame(Game game);
	public void updateGame(Game game);
	
	
}
