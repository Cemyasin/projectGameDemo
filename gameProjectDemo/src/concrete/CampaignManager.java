package concrete;

import abstracts.ICampaignService;
import entities.Campaign;
import entities.Game;

public class CampaignManager implements ICampaignService{

	double newPrice;
	@Override
	public void addCampaign(Campaign campaign,Game game) {
		newPrice = game.getPriceOfGame() -(game.getPriceOfGame()*campaign.getDiscount()/100);
		System.out.println(game.getNameOfGame()+ " oyununa " + campaign.getCampaingName() +
				" kampanyasi başarıli bir şekilde uygulanmıştır.");
		System.out.println(newPrice + " oyunun yeni fiyati...");
		

	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	

	
}
