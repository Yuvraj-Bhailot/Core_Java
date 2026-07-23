package season1.decisionmakingstatement;

public class IfElseStatement {
	public static void main(String[] args) {
		// if statement
		if (10 > 5) {
			System.out.println("10 is greater than 5.");
		}

		System.out.println("------------------");
		
		// if else statement
		int num = 98;

		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
	}
}
