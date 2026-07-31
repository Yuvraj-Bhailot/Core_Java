package season3.objectclass;

public class OverridingObjMethod {
	int num;
	String name;

	public OverridingObjMethod(String name, int num) {
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Number: " + num;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + num;
	}

	@Override
	public boolean equals(Object obj) {
		OverridingObjMethod obj1 = (OverridingObjMethod) obj;
		return this.name == obj1.name && this.num == obj1.num;
	}

	public static void main(String[] args) {
		OverridingObjMethod obj1 = new OverridingObjMethod("Hello", 10);
		OverridingObjMethod obj2 = new OverridingObjMethod("Bye", 20);
		OverridingObjMethod obj3 = new OverridingObjMethod("Hello", 10);

		// toString() method
		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println("----------------------");

		// hashCode() method
		System.out.println("Hashcode of obj1: " + obj1.hashCode());
		System.out.println("Hashcode of obj2: " + obj2.hashCode());
		System.out.println("Hashcode of obj3: " + obj3.hashCode());

		System.out.println("----------------------");

		// equals() method
		System.out.println("obj1 == obj2: " + (obj1 == obj2)); // compares address
		System.out.println("obj1 == obj3: " + (obj1 == obj3));

		System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); // compares states
		System.out.println("obj2 equals obj3: " + obj2.equals(obj3));
	}
}
