package Abstract;

import Entities.Customer;
import Entities.Games;

public class BaseCampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Games games, Customer customer) {
		System.out.println(games.getGameName()+" oyununa %"+games.getDiscount()+" indirim uygulandý.");
		
	}

	@Override
	public void campaignUpdate(Games games, Customer customer) {
		System.out.println(games.getGameName()+" oyununun indirimli fiyatý: "+games.getPrice()+" TL");
		
	}

	@Override
	public void campaignDelete(Games games, Customer customer) {
		System.out.println(games.getGameName()+" oyunundaki indirim "+customer.getFirstName()+" tarafýndan kaldýrýldý.");
		
	}

}
