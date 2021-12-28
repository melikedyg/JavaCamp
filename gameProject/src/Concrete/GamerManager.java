package Concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Adapters.EdevletServisAdapter;
import Entities.Gamer;

public class GamerManager implements GamerService{
	 GamerCheckService gamerCheckService;
	
	public GamerManager(EdevletServisAdapter eDevletServisAdapter) {
		this.gamerCheckService=eDevletServisAdapter;

    }
   

    public GamerManager(GamerCheckManager gamerCheckService) {
        this.gamerCheckService = (GamerCheckService) gamerCheckService;

    }
	public void register(Gamer gamer) throws NumberFormatException, RemoteException {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			register(gamer);
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+ " information enrolled.");
		}
		else {
			System.out.println("Not a valid person");
		}
	
		
		
	}

	@Override
	public void update(Gamer gamer)  {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+ " information deleted.");
		
	}

	@Override
	public void delete(Gamer gamer)  {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" information updated.");
		
	}

}
