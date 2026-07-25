package season2;

public class NonStaticMembers {
	double num; // non static variable

	// non static method
	public void getMsg() {
		System.out.println("This is a non static method.");
	}

	// static initializer
	short shortNum = 5; // Single Line Non Static Initializer (SLNSI)

	// MultiLine Non Static Initializer (MLNSI)
	{
		System.out.println("----------------------------------");

		System.out.println("This is multi line non static initializer.");
		System.out.println("Non Static Initializer will execute everytime an object is created.");

		// this keyword calls member of executing object
		// or we can say it returns executing object address or reference
		System.out.println("Non static variable: " + this.num);

		// non static member can be directly access by its name in non static context
		num = 10.25; // initialing non static variable at local scope
		System.out.println("Local Non static variable: " + num); // direct name = local scope

		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {
		System.out.println("Starting of main()");

		// non static member are access by object reference

		NonStaticMembers nsm = new NonStaticMembers();
		nsm.getMsg();

		System.out.println("MLNSI: " + nsm.shortNum);
	}
}
