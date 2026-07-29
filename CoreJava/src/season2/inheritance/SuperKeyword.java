package season2.inheritance;

/* super keyword is similar to this keyword
 * this keyword refers to current object
 * super keyword refers to parent object
 * */

class Base {
	String name = "Base Class";

	public Base() {
		System.out.println("This is base class. ");
	}
}

public class SuperKeyword extends Base {
	String name = "Derived Class"; // var name same as parent var

	public SuperKeyword() {
		super(); // this calls parent constructor
		System.out.println("Class level: " + name);

		// to call parent var use super
		System.out.println("Class level: " + super.name);
	}

	public static void main(String[] args) {
		SuperKeyword sk = new SuperKeyword();
	}
}
