package season1.operator;

public class IncrementAndDecrementOperator {
	public static void main(String[] args) {
		// post and pre-increment operator
		System.out.println("post-increment:");
		int i = 1;
		System.out.println("Before increment i: " + i);

		int b = i++; // post-increment
		System.out.println("After increment b: " + b);
		System.out.println("After increment i: " + i);

		System.out.println("-------------------------\n");

		System.out.println("pre-increment:");
		i = 1; // re-initiallizing for better understanding
		System.out.println("Before increment i: " + i);

		b = ++i; // pre-increment
		System.out.println("After increment b: " + b);
		System.out.println("After increment i: " + i);

		System.out.println("-------------------------\n");

		// post and pre-decrement operator
		System.out.println("post-decrement:");
		i = 10;
		System.out.println("Before decrement i: " + i);

		b = i--; // post-decrement
		System.out.println("After decrement b: " + b);
		System.out.println("After decrement i: " + i);

		System.out.println("-------------------------\n");

		System.out.println("pre-decrement:");
		i = 10; // re-initiallizing for better understanding
		System.out.println("Before decrement i: " + i);

		b = --i; // pre-decrement
		System.out.println("After decrement b: " + b);
		System.out.println("After decrement i: " + i);

		System.out.println("-------------------------\n");
	}
}
