public class Customer {
	private int id;
	private String name;
	private String city;

	public Customer(int id, String name, String city) {
	}

	public Customer(int id, String name, String lastName, String nationalIdentity, String city) {

	}

	public Customer() {

	}

	public String getCity() {
		return city;
	}

	public Customer setCity(String city) {
		this.city = city;
		return this;
	}

	public int getId() {
		return id;
	}

	public Customer setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Customer setName(String name) {
		this.name = name;
		return this;
	}
}