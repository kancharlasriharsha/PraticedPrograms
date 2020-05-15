
public class ThreadExm {
	public static void main(String[] args) {
		System.out.println("Thread");
		Thread t = new Thread();
		//thread: Thread[Thread-0,5,main]
		t.setPriority(1);
		t.setName("harsha");
		System.out.println("thread: "+t);
		
		Thread t1 = new Thread();
		t1.setPriority(2);
		//thread: Thread[Thread-0,5,main]
		System.out.println("thread one: "+t1);
	}

}
