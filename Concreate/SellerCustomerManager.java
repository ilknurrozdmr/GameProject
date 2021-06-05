package Concreate;

import Abstract.BaseSellerManager;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class SellerCustomerManager extends BaseSellerManager {
    SellerServiceAdapters sellerServiceAdapters;

    public SellerCustomerManager(SellerServiceAdapters sellerServiceAdapters) {
        this.sellerServiceAdapters = sellerServiceAdapters;
    }

    @Override
    public void sell(Games games, Customer customer) {
        super.sell(games, customer);
        
    }
}