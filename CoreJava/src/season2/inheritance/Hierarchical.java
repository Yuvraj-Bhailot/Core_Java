package season2.inheritance;

/* child classes can access parent members
 * but child classes cannot access siblings members 
 * */

class Parent1 {
	public static void get() {
		System.out.println("This is parent class.");
	}
}

class Child1 extends Parent1 {
	public static void display() {
		System.out.println("This is child 1 class.");
	}
}

class Child2 extends Parent1 {
	public static void display() {
		System.out.println("This is child 2 class.");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		System.out.println("Child 1: ");
		Child1.get();
		Child1.display();

		System.out.println("----------------------");

		System.out.println("Child 2: ");
		Child2.get();
		Child2.display();
	}
}
