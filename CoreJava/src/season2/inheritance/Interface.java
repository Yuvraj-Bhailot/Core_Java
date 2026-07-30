package season2.inheritance;

/* Interface are used for 100% abstraction
 * */

interface I1 {
	public void add(int a, int b); // abstract method
}

interface I2 {
	public void subtract(int a, int b);
}

//we can inherit interface with other interface using extends
interface I3 extends I2 {
	public void multi(int a, int b);
}

// we use implements if class wants to inherit interface
// if we dont provide implementation for any method we have to make class abstract
abstract class C1 implements I3 {
	@Override
	public void subtract(int a, int b) {
		System.out.println("Subtract: " + (a - b));
	}
}

// we can inherit class as well as interface
public class Interface extends C1 implements I1 {
	@Override
	public void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	@Override
	public void multi(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	public static void main(String[] args) {
		// we can create reference variable for interface but not object
		I1 inter1;

		inter1 = new Interface();
		inter1.add(10, 20);

		Interface i = new Interface();
		i.add(10, 5);
		i.subtract(35, 14);
		i.multi(25, 19);
	}
}
