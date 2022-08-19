package adapters;


import abstracts.ICustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean chechIfRealPerson(Customer customer) throws Exception {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(customer.getNationalityId(), "Cem Yasin", "Üzüm",2001);
	}

}
