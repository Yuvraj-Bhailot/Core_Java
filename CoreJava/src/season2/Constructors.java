package season2;

public class Constructors {
	int num; // non static variable

	// No argument constructor
	public Constructors() {
		// this constructor will get executed whenever an object will be created using this constructor
		System.out.println("This is a no argument constructor.");
		System.out.println("--------------------------");
	}

	// Parameterized constructor
	public Constructors(int i) {
		// this constructor will get executed whenever an object will be created using this constructor
		this.num = i; // startup instruction for object loading
		System.out.println("This is a parameterized constructor.");
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		Constructors con = new Constructors();

		Constructors con2 = new Constructors(10); // change this value to understand how constructor is used to initialized

		System.out.println("num value in no argument constructor: " + con.num); // no initialization
		System.out.println("num value in parameterized constructor: " + con2.num); // initialized through parameterized constructor

	}
}
