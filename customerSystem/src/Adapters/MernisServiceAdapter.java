package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy ();	
		return  client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName, customer.lastName, customer.dateOfBirth);
		
	}

	
		
		
	

}
