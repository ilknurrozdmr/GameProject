package Concreate;

import Abstract.BaseCampaignManager;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class CampaignManager extends BaseCampaignManager{
	
	SellerServiceAdapters sellerserviceAdapters;

	public CampaignManager(SellerServiceAdapters sellerserviceAdapters) {
		this.sellerserviceAdapters = sellerserviceAdapters;
	}
	
	@Override
	public void campaignAdd(Games games, Customer customer) {
		super.campaignAdd(games, customer);
	}
	
	@Override
	public void campaignUpdate(Games games, Customer customer) {
		games.setPrice((int)this.sellerserviceAdapters.discountedPrice(games));
		super.campaignUpdate(games, customer);
	}
	@Override
	public void campaignDelete(Games games, Customer customer) {
		super.campaignDelete(games, customer);
	}
	

}
