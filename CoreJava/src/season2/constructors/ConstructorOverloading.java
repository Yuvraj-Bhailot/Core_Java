package season2.constructors;

/* Constructor overloading means having multiple constructor with same name.
 * Or we can say that creating constructor with same name but different formal argument.
 * Constructor overloading is a type of polymorphism.
 * */

public class ConstructorOverloading {
	long accountNumber;
	double amount;
	String accountType;

	public ConstructorOverloading(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public ConstructorOverloading(double amount) {
		this.amount = amount;
	}

	public ConstructorOverloading(long accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public ConstructorOverloading(long accountNumber, String accountType) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	// you can overload a constructor by changing the sequence of formal argument
	// but sometimes it can lead to diamond problem or ambiguity problem

//	public ConstructorOverloading(double amount, long accountNumber) {
//		this.accountNumber=accountNumber;
//		this.amount=amount;
//	}

	public static void main(String[] args) {
		ConstructorOverloading co1 = new ConstructorOverloading(1051060004785l); // l is suffix for assigning datatype
		ConstructorOverloading co2 = new ConstructorOverloading(10000.0);
		ConstructorOverloading co3 = new ConstructorOverloading(1051060004785l, 25000.50);
		ConstructorOverloading co4 = new ConstructorOverloading(1051060004785l, "Saving");

		System.out.println("Account Number of co1: " + co1.accountNumber);
		System.out.println("Amount available in co1 account: " + co1.amount);
		System.out.println("Account Type of co1: " + co1.accountType);

		System.out.println("-----------------------\n");

		System.out.println("Account Number of co2: " + co2.accountNumber);
		System.out.println("Amount available in co2 account: " + co2.amount);
		System.out.println("Account Type of co2: " + co2.accountType);

		System.out.println("-----------------------\n");

		System.out.println("Account Number of co3: " + co3.accountNumber);
		System.out.println("Amount available in co3 account: " + co3.amount);
		System.out.println("Account Type of co3: " + co3.accountType);

		System.out.println("-----------------------\n");

		System.out.println("Account Number of co4: " + co4.accountNumber);
		System.out.println("Amount available in co4 account: " + co4.amount);
		System.out.println("Account Type of co4: " + co4.accountType);

		System.out.println("-----------------------\n");
	}
}
