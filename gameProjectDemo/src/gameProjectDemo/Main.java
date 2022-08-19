package gameProjectDemo;

import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.CustomerManager;
import concrete.GameSaleManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class Main {

	public static void main(String[] args) throws Exception {

		Campaign campaign1 = new Campaign(1," Mübarek Cuma", 1,10);
		Campaign campaign2 = new Campaign(2," 29 Ekim", 2,15);
		Campaign campaign3 = new Campaign(3," Yılbaşı", 3,8);

		Customer customer1 = new Customer(1,"Cem Yasin"," Üzüm" ,12345678910L,2000);
		Customer customer2 = new Customer(2,"Hacı murat"," 131" ,12345678911L,2001);
		Customer customer3 = new Customer(3,"Ali Osman"," duran" ,12345678912L,2002);

		Game game1 = new Game(1, "Valorant", 150);
		Game game2 = new Game(2, "Pes22", 300);
		Game game3 = new Game(3, "Fifa22", 800);

		

		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		GameSaleManager saleManager = new GameSaleManager(new CampaignManager());

		customerManager.add(customer1);
		saleManager.sell(customer1, campaign1, game1);
		
		customerManager.add(customer2);
		saleManager.sell(customer2, campaign2, game2);
		
		customerManager.add(customer3);
		saleManager.sell(customer3, campaign3, game3);
	}

}
