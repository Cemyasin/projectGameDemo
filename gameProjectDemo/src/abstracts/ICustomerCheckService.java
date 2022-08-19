package abstracts;


import entities.Customer;

public interface ICustomerCheckService {
	 boolean chechIfRealPerson(Customer customer) throws Exception;

}
