package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public interface IGameSellService {

	public void sell(Customer customer,Campaign campaign,Game game);
}
