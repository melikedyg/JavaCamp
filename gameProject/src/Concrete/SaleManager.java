package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public class SaleManager {
	public void gameSales(Gamer gamer, Game game, Campaign campaign) {
		double discountedPrice;
		discountedPrice = (game.getGamePrice() -(game.getGamePrice()	* campaign.getDiscount())/100);
		
		
		System.out.println(game.getGameName() + " discount = " +" " +  discountedPrice);


}
}