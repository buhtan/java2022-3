public class Person extends Customer {
	private String nationalIdentity;
	private String lastName;

	public Person(int id, String name, String lastName, String nationalIdentity, String city) {
		super(id, name, lastName, nationalIdentity, city);
	}
}