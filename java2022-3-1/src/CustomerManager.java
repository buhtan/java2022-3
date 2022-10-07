public class CustomerManager {
	CreditManager creditManager = new CreditManager();

	public CustomerManager(Customer customer, ICreditManager creditManager) {

	}

	public void save(Customer customer) {
		System.out.println("Customer saved: ");
	}

	public void delete(Customer customer) {
		System.out.println("Customer deleted: ");
	}

	public void giveCredit() {
		creditManager.calculate();
	}
}