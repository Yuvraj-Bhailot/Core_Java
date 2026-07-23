package season1.loopingstatement;

public class DoWhileLoop {
	public static void main(String[] args) {
		// do while loop: exit controlled loop
		int i = 10; // initialization

		do {
			System.out.println("Countdown: " + i);
			i--; // iterator
		} while (i >= 1); // condition
	}
}
