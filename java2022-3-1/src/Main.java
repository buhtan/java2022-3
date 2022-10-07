public class Main {
	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 20;
		System.out.println(sayi2);

		int[] sayi3 = { 1, 2, 3, };
		int[] sayi4 = { 10, 20, 30, };
		sayi3 = sayi4;
		sayi3[0] = 1000;
		System.out.println(sayi3[0]);

		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
	}
}