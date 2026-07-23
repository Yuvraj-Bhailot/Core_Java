package season1.decisionmakingstatement;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// if else if ladder
		System.out.print("Enter your percentage: ");
		double marks = sc.nextDouble();

		if (marks <= 100 && marks >= 81) {
			System.out.println("You pass with distinction.");
		} else if (marks <= 80 && marks >= 61) {
			System.out.println("You pass with first class.");
		} else if (marks <= 60 && marks >= 41) {
			System.out.println("You pass with second class.");
		} else if (marks <= 40 && marks >= 35) {
			System.out.println("You just pass.");
		} else {
			System.out.println("Failed.");
		}
	}
}
