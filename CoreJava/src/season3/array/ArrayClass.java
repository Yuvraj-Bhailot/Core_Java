package season3.array;

/* Array is use to store multiple data, it's a continuous block of memory.
 * array stores homogeneous data
 * */

public class ArrayClass {
	public static void main(String[] args) {
		// creating array
		int[] intArr = new int[5]; // 5 is array size

		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;

		System.out.println("intArr[]: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

		System.out.println("\n---------------------------");

		// other way
		char[] arr = { 'a', 'q', 'e', 'y', 'u' };

		System.out.println("arr[]: ");
		// for each loop
		for (char c : arr) {
			System.out.print(c + " ");
		}
	}
}
