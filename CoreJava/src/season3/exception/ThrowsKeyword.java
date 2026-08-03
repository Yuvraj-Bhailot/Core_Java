package season3.exception;

public class ThrowsKeyword {
	// throws keyword is used to declare the exception 
	// with method declaration statement
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Seconds: " + i);
			/* Thread.sleep(); throws Interrupted Exception, 
			 * its a checked exception, so we have to handle it 
			 * otherwise it will show compile time error
			 */
			Thread.sleep(1000);
		}
	}
}
