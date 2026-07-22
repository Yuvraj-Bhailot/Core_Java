package season1;

public class TypeCasting {
	public static void main(String[] args) {
		// Typecasting means converting one datatype to another datatype
		// Primitive Typecasting

		int num = 38;
		double num2 = num; // Widening

		System.out.println("Integer: " + num);
		System.out.println("Integer -> Double: " + num2);
		// converting smaller datatype into larger one

		System.out.println("--------------------");

		char c = (char) num; // Narrowing

		System.out.println("Integer: " + num);
		System.out.println("Integer -> Character: " + c);
		// converting larger datatype into smaller one
	}
}
