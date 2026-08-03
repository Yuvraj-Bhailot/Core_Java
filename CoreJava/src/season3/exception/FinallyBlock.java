package season3.exception;

public class FinallyBlock {
	public static void divide(int num1, int num2) {
		try {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			System.out.println("Normal execution.");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block will execute even if exception occur or not.");
		}
	}

	public static void main(String[] args) {
		divide(134, 42);

		System.out.println("------------------------");

		divide(0, 15);

		System.out.println("------------------------");

		divide(157, 0);
	}
}
