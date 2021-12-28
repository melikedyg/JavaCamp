package Adapters;

import java.rmi.RemoteException;
import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EdevletServisAdapter implements GamerCheckService{
	KPSPublicSoapProxy user=new KPSPublicSoapProxy ();	

	public boolean CheckIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
	
		return user.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(),
                gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
		

}
}
