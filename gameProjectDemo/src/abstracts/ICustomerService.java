package abstracts;


import entities.Customer;

public interface ICustomerService {
	
	public void add(Customer customer) throws Exception;
	public void delete(Customer customer);
	public void update(Customer customer);

}
