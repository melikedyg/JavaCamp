import java.rmi.RemoteException;

import Adapters.EdevletServisAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Game game = new Game(1, "PUBG", 2000);
		Gamer gamer=new Gamer(0, "Ecrin", "Yýlmaz","12345678" ,1985 );
		Campaign campaign = new Campaign(0, 10, "2 hafta");
	
		
		
		
		GamerManager gamerManager = new GamerManager (new EdevletServisAdapter());
		gamerManager.register(gamer);
		
		GameManager gameManager =new GameManager() ;
		gameManager.add(game);
;
        CampaignManager campaingManager =  new  CampaignManager();
		campaingManager.add(campaign);
		
		SaleManager saleManager =new SaleManager ();
		saleManager.gameSales(gamer, game, campaign);
		

	}

}
