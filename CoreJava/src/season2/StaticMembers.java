package season2;

public class StaticMembers {
	static boolean bo; // static variable
	
	// static method
	public static void getMsg() {
		System.out.println("This is a static method.");
	}
	
	// static initializer
	static char c='A'; // Single Line Static Initializer (SLSI) 
	
	// MultiLine Static Initializer (MLSI)
	static {
		System.out.println("This is multi line static initializer.");
		System.out.println("Initializer will execute before main()");
	}
	
	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("Starting of main().");
		
		// accessing static members
		System.out.println("Static member: "+bo); // by direct name
		
		StaticMembers.getMsg(); // by class name
		
		StaticMembers sm = new StaticMembers();
		System.out.println("SLSI: "+sm.c); // by object reference
		
		System.out.println("Ending of main().");
	}
}
