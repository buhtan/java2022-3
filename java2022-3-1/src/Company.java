public class Company extends Customer {
	private String taxNumber;

	public Company(int id, String name, String city, String taxNumber) {
		super(id, name, city);
	}

	public Company(Customer customer) {
		super();
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public Company setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
		return this;
	}
}