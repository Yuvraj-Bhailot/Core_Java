package season1.decisionmakingstatement;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter an operator: ");
		char op = sc.next().charAt(0);

		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		// switch cases
		switch (op) {
		case '+': {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
			break;
		case '-': {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
			break;
		case '*': {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
			break;
		case '/': {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
			break;
		case '%': {
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		}
			break;
		default:
			System.out.println("choose this operator: +, -, *, /, %");
		}
	}
}
