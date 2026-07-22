package season1.operator;

//conditional operator-> op1?op2:op3
/* op1 can be expression or condition
 * op2 is value return if true
 * op3 is value return if false
 */

public class ConditionalOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 74;

		System.out.println("Greater number " + num1 + " or " + num2 + ": " + (num1 > num2 ? num1 : num2));
	}
}
