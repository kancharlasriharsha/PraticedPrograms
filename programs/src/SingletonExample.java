
public class SingletonExample {

	static class SingleObject {
		private static SingleObject in = new SingleObject();
		public static SingleObject getInstance() {
			return in;
		}
		public void showMessage() {
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject obj = SingleObject.getInstance();
		obj.showMessage();
	}
}
