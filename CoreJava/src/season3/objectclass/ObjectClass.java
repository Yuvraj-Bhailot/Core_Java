package season3.objectclass;

/* Object class is the super most parent class of All the classes
 * it contains multiple non static methods
 * */

public class ObjectClass {
	int num;

	public ObjectClass(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		// creating objects
		ObjectClass obj1 = new ObjectClass(10);
		ObjectClass obj2 = new ObjectClass(354);
		ObjectClass obj3 = new ObjectClass(10);

		// toString() method: converts memory address into specified format
		System.out.println(obj1); // implicitly calls toString()
		System.out.println(obj1.toString()); // it displays address

		System.out.println("----------------------");

		// hashCode() method: generate unique hash code for object
		System.out.println("Hashcode of obj1: " + obj1.hashCode());
		System.out.println("Hashcode of obj2: " + obj2.hashCode());
		System.out.println("Hashcode of obj3: " + obj3.hashCode());

		System.out.println("----------------------");

		// equals() method: compares address
		System.out.println("obj1 == obj2: " + (obj1 == obj2)); // compares address
		System.out.println("obj1 == obj3: " + (obj1 == obj3));

		System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); // compares address
		System.out.println("obj2 equals obj3: " + obj2.equals(obj3));

		// we can override the methods to change its behavior
	}
}
