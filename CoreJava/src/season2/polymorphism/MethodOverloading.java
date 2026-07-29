package season2.polymorphism;

/* Method overloading means having multiple method with same name.
 * Or we can say that creating method with same name but different formal argument.
 * */

public class MethodOverloading {
	public static void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	public static void add(double a, double b) {
		System.out.println("Addition: " + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println("Addition: " + (a + b + c));
	}

	public static void add(int a, int b, double c, double d) {
		System.out.println("Addition: " + (a + b + c + d));
	}

	public static void add(char a, char b) {
		System.out.println("Character Addition: " + (char) (a + b));
	}

	public static void main(String[] args) {
		add(10, 25);
		add('a', 'u');
		add(45, 14, 35.14, 178.25);
	}
}
