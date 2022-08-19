package abstracts;

import entities.Campaign;
import entities.Game;

public interface ICampaignService {
	
	public void addCampaign(Campaign campaign,Game game);
	public void deleteCampaign(Campaign campaign);
	public void updateCampaign(Campaign campaign);
	
	

}
