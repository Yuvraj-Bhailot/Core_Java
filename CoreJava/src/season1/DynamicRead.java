package season1;

import java.util.Scanner;

public class DynamicRead {
	// Taking user input
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("You entered: " + num);
		
		
		/*
		sc.nextByte(); -> for byte value
		sc.nextShort(); -> for short value
		sc.nextInt(); -> for int value
		sc.nextLong(); -> for long value
		sc.nextFloat(); -> for float value
		sc.nextDouble(); -> for double value
		sc.next().charAt(0); -> for char value
		sc.nextBoolean(); -> for boolean value
		sc.nextLine(); -> for string value
		sc.next(); -> for single word
		*/
	}
}
