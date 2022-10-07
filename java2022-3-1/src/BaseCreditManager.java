public abstract class BaseCreditManager implements ICreditManager {
	public abstract void Calculate();

	public static void Save() {
		System.out.println("Saved");
	}
}