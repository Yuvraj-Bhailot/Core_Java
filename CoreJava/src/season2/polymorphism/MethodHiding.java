package season2.polymorphism;

/* method hiding or method shadowing means static method binds with reference variable during compilation
 * this happens when both parent and child classes have same static method signature   
 * */

class MethodOne {
	public static void display() {
		System.out.println("This is Method One.");
	}
}

class MethodTwo extends MethodOne {
	public static void display() {
		System.out.println("This is Method Two.");
	}
}

public class MethodHiding {
	public static void main(String[] args) {
		MethodOne mo = new MethodOne();
		mo.display();

		MethodTwo mt = new MethodTwo();
		mt.display();

		MethodOne mo1 = new MethodTwo();
		mo1.display();

		MethodTwo mt1 = (MethodTwo) mo1;
		mt1.display();
	}
}
