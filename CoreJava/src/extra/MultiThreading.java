package extra;

/* Thread is nothing but the small light weight surface 
 * of entire big process
 * */

class UserThread extends Thread {
	@Override
	public void run() {
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println("Counter: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		Thread t1 = new Thread();

		System.out.println("Thread ID: " + t1.threadId());

		// Thread Name
		System.out.println("Thread Name: " + t1.getName());
		t1.setName("Multi Threading");
		System.out.println("New Thread Name: " + t1.getName());

		// Thread Priority
		System.out.println("Thread Priority: " + t1.getPriority());
		t1.setPriority(7);
		System.out.println("New Thread Priority: " + t1.getPriority());

		System.out.println("------------------------");

		UserThread ut = new UserThread();
		ut.start();
	}
}
