package season3.exception;

/* It is an unexpected event or problem which occurs during 
 * Execution of a program
 * */

public class ExceptionHandling {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		// we can handle exception using try catch block.
		try {
			System.out.println("Dividing by 0");
			System.out.println(num1 / num2); // it will throw a exception

		} catch (ArithmeticException e) {
			System.out.println("There is an Arithmetic Exception.");
			// this an example of unchecked exception.
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("There is an Exception.");
			e.printStackTrace();
		}
		// we can use multiple catch block
	}
}
