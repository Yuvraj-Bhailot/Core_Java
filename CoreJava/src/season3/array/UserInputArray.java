package season3.array;

import java.util.Scanner;

public class UserInputArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size for string array: ");
		int size = sc.nextInt();

		String[] strArr = new String[size];

		// taking input
		for (int i = 0; i < size; i++) {
			System.out.print("Enter value for array: ");
			String input = sc.next();
			strArr[i] = input;
		}

		// displaying array
		System.out.println("String array value: ");
		for (String str : strArr) {
			System.out.println(str);
		}

		sc.close();
	}
}
