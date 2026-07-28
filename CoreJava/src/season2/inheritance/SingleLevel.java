package season2.inheritance;

/* Child class can access parent member 
 * but parent cannot access child member
 * */

class BaseClass {
	String base = "Parent class";
	static int baseNum = 1;
}

public class SingleLevel extends BaseClass {
	String derived = "Child class";
	static int derivedNum = 2;

	public static void main(String[] args) {
		SingleLevel sl = new SingleLevel();

		System.out.println("Class: " + sl.base);
		System.out.println("Class rank: " + baseNum);

		System.out.println("-----------------------");

		System.out.println("Class: " + sl.derived);
		System.out.println("Class rank: " + derivedNum);
	}
}
