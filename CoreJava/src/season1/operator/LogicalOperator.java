package season1.operator;

public class LogicalOperator {
	public static void main(String[] args) {
		int i = 1;

		// AND operator: &&
		System.out.println("true && i!=1: " + (true && i != 1));
		System.out.println("true && true: " + (true && true));

		System.out.println("------------------");

		// OR operator: ||
		System.out.println("i==1 || true: " + (i == 1 || true));
		System.out.println("false || false: " + (false || false));

		System.out.println("------------------");

		// NOT operator
		System.out.println("!true: " + !true);
		System.out.println("!false: " + !false);
	}
}
