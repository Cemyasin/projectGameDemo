package concrete;


import abstracts.ICustomerCheckService;
import abstracts.ICustomerService;
import entities.Customer;

public class CustomerManager implements ICustomerService{

	private ICustomerCheckService customerCheckService;
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
	}
	@Override
	public void add(Customer customer) throws Exception{
		if(customerCheckService.chechIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+ customer.getLastName() + " isimli oyuncu kaydı başarılı...");
		}
		else {
			System.out.println("!!!Kayıt başarısız lutfen bilgilerinizi kontrol ediniz!!!");
		}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + customer.getLastName() +  " isimli kullanıcı silindi...");

	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + customer.getLastName() +  " isimli oyuncu güncellemesi başarılı");
		
	}

	
	
	
}
