
import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseSellerManager;
import Adapters.EdevletServiceAdapter;
import Concreate.CampaignManager;
import Concreate.GamerCustomerManager;
import Concreate.SellerCustomerManager;
import Adapters.SellerServiceAdapters;
import Entities.Gamer;
import Entities.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        BaseCustomerManager baseCustomerManager=new GamerCustomerManager(new EdevletServiceAdapter());
        BaseCampaignManager baseCampaignManager=new CampaignManager(new SellerServiceAdapters());
        BaseSellerManager baseSellerManager=new SellerCustomerManager(new SellerServiceAdapters());
        Gamer gamer1=new Gamer(1,"Dilek","Gürbaþ","dgurbas@gmail.com",LocalDate.of(1999,6,5),"123","queen");
        Gamer gamer2=new Gamer(2,"Ahmet","Tunç","atunc@gmail.com",LocalDate.of(1985,4,22),"456","queen");
        Seller seller=new Seller(1,"Ýlknur","Özdemir","iozdemir@gmail.com",LocalDate.of(1997,8,4),"123456","7");
        Games game1=new Games(1000,"Minecraft",40);
        Games game2=new Games(2000,"FIFA",70);
        baseCustomerManager.add(gamer2);
        baseCustomerManager.delete(gamer1);
        baseCustomerManager.update(gamer2);
        baseSellerManager.sell(game1,gamer2);
        baseSellerManager.sell(game2,gamer1);
        baseCampaignManager.campaignAdd(game1,seller);
        baseCampaignManager.campaignUpdate(game1,seller);
        baseCampaignManager.campaignDelete(game1,seller);

    }
}