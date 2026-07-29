package season2.abstraction;

/* we cannot create abstract class object
 * we cannot create non static variable or concrete non static method
 * */

abstract class AbstractClass {
	String name = "Abstract class"; // non static automatically converted to static

	public abstract void display();

	public static void getMsg() {
		System.out.println("This is static method in abstract class");
	}
}

public class ConcreteClass extends AbstractClass {
	@Override
	public void display() {
		System.out.println("Concrete class implemented display method");
		System.out.println("Class name: " + name);
	}

	public static void main(String[] args) {
		ConcreteClass cc = new ConcreteClass();
		cc.display();
		getMsg();
	}
}
