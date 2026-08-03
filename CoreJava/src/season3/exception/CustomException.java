package season3.exception;

import java.util.Scanner;

/* to create custom exception or user defined exception, 
 * extends Exception class and override getMessage() method.
 * */

class NoErrorException extends Exception {
	@Override
	public String getMessage() {
		return "This is a No Error Exception!!";
	}
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Do you want to execute custom Exception type Yes or No: ");
		String userIn = sc.next();

		sc.close();

		try {
			if (userIn.toLowerCase().equals("yes")) {
				// throw keyword is used to throw exception manually
				throw new NoErrorException();
			} else {
				System.out.println("No exception is thrown.");
			}

		} catch (NoErrorException e) {
			e.printStackTrace();
		}
	}
}
