import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Program {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter() );
		customerManager.save(new Customer(1,"Zeynep","Y?ld?r?m",1985,"12345678956"));
		
		

	}

}
