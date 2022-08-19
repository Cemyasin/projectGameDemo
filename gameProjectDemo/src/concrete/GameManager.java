package concrete;

import abstracts.IGameService;
import entities.Game;

public class GameManager implements IGameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getNameOfGame() + " oyunu sisteme eklendi..");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getNameOfGame() + " oyunu sistemden silindi..");

		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getNameOfGame() + " oyunu güncellendi..");
		
	}

}
