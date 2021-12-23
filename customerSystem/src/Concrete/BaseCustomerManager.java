package Concrete;

import java.rmi.RemoteException;

import Abstract.CustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{


	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		System.out.println("saved to db:"+customer.firstName);
	}

}
