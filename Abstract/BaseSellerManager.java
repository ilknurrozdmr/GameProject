package Abstract;

import Entities.Customer;
import Entities.Games;

public class BaseSellerManager implements SellerService {

	@Override
	public void sell(Games games, Customer customer) {
		System.out.println(games.getGameName()+ " oyunu "+customer.getFirstName()+" ki�isine "+games.getPrice()+" TL'ye sat�ld�.");
		
	}

}
