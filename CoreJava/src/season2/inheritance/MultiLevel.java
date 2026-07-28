package season2.inheritance;

class GrandParent {
	public void display1() {
		System.out.println("Can access grandparent display1().");
	}
}

class Parent extends GrandParent {
	public void display2() {
		System.out.println("Can access parent display2().");
	}
}

class Child extends Parent {
	public void display3() {
		System.out.println("Can access child display3().");
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		System.out.println("Using grandparent object: ");
		GrandParent gp = new GrandParent();
		gp.display1();

		System.out.println("------------------------");

		System.out.println("Using parent object: ");
		Parent p = new Parent();
		p.display1();
		p.display2();

		System.out.println("------------------------");

		System.out.println("Using parent object: ");
		Child child = new Child();
		child.display1();
		child.display2();
		child.display3();
	}
}
