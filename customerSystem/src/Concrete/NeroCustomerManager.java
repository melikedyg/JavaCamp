package Concrete;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager  extends BaseCustomerManager {
     
	private CustomerCheckService customerCheckService;
    	

     public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	 @Override
     public void save(Customer customer) throws NumberFormatException, RemoteException  {  
		 if(customerCheckService.CheckIfRealPerson(customer)) {
				super.save(customer);
			}
			else {
				System.out.println("Not a valid person");
			}
  	
        
  }

}
