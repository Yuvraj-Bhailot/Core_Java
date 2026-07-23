package season1;

public class Method {
	// method reusable block of code or set of instruction

	// access-modifier modifier returntype methodName (formal argument){}
	public static void display() {
		System.out.println("This is no argument static method.");
	}

	public String argsMethod(int num) {
		System.out.println("You passed " + num + " as argument.");
		return "This is parameterized non static method.";
	}

	public static void main(String[] args) {
		display(); // can be call by direct name
		Method.display(); // calling by class name
		Method m = new Method();
		m.display(); // calling by object reference

		System.out.println("-------------------------");

		/*
		 * non static methods can be only called by 
		 * object reference in static context
		 */

		String msg = m.argsMethod(10); // we have to store data return by method
		System.out.println(msg);
	}
}
