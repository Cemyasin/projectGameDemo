package concrete;

import abstracts.ICampaignService;
import abstracts.IGameSellService;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class GameSaleManager implements IGameSellService{

	private ICampaignService campaignService;
	
	public GameSaleManager(ICampaignService campaignService) {
	    super();
		this.campaignService=campaignService;
	}
	
	@Override
	public void sell(Customer customer, Campaign campaign, Game game)  {

		campaignService.addCampaign(campaign, game);
		System.out.println(game.getNameOfGame() + " oyunu "+ customer.getFirstName() +
				customer.getLastName() + " tarafından satın alındı.. \n");
	}
	

}
