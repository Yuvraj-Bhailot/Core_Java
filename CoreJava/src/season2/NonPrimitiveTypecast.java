package season2;

/* Non primitive typecasting means converting one object reference to another 
 * to typecast a non primitive datatype there must be Is-a relationship
 * */

class ClassUp {
	public void display() {
		System.out.println("This is class up display method");
	}
}

class ClassDown extends ClassUp {
	@Override
	public void display() {
		System.out.println("This is class down display method");
	}
}

public class NonPrimitiveTypecast {
	public static void main(String[] args) {
		ClassUp cu = new ClassUp();
		cu.display();
		ClassDown cd = new ClassDown();
		cd.display();

		System.out.println("---------------------");

		ClassUp cu2 = new ClassDown(); // upcasting, its done implicitly
		// storing child object in parent reference variable
		cu2.display();

		// 1. to do downcast, we have to do explicitly using typecast operator
		// 2. to do downcast, parent reference variable should have instance of child object

		// to check if reference has instance of object
		System.out.println("Does parent reference have instance of child object: " + (cu2 instanceof ClassDown)); 
		// its returns boolean value

		ClassDown cd2 = (ClassDown) cu2; // downcasting
		cd2.display();
	}
}
