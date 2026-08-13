package season2.constructors;

/* Constructor chaining means calling a constructor from another constructor
 * Using this() or super()
 * */

public class ConstructorChaining {
	long accountNumber;
	double amount;
	String accountType;

	public ConstructorChaining(long accountNumber) {
		this.accountNumber = accountNumber;
		System.out.println("Account Number assigned successfully.");
	}

	public ConstructorChaining(long accountNumber, double amount) {
		this(accountNumber); // constructor chaining
		this.amount = amount;
		System.out.println("Amount set successfully.");
	}

	public ConstructorChaining(long accountNumber, double amount, String accountType) {
		this(accountNumber, amount); // constructor chaining
		this.accountType = accountType;
		System.out.println("Account Type assigned successfully.");
	}

	public static void main(String[] args) {
		System.out.println("Creating account 1: ");
		ConstructorChaining acc1 = new ConstructorChaining(1051060004785l);

		System.out.println("----------------------------");

		System.out.println("Creating account 2: ");
		ConstructorChaining acc2 = new ConstructorChaining(1051060005874l, 500000.0);

		System.out.println("----------------------------");

		System.out.println("Creating account 3: ");
		ConstructorChaining acc3 = new ConstructorChaining(1051060008754l, 61100.27, "Saving");

		System.out.println("----------------------------");

		System.out.println("\nAccount 1 data:- ");
		System.out.println("Account Number of acc1: " + acc1.accountNumber);
		System.out.println("Amount available in acc1 account: " + acc1.amount);
		System.out.println("Account Type of acc1: " + acc1.accountType);

		System.out.println("\nAccount 2 data:- ");
		System.out.println("Account Number of acc2: " + acc2.accountNumber);
		System.out.println("Amount available in acc2 account: " + acc2.amount);
		System.out.println("Account Type of acc2: " + acc2.accountType);

		System.out.println("\nAccount 3 data:- ");
		System.out.println("Account Number of acc3: " + acc3.accountNumber);
		System.out.println("Amount available in acc3 account: " + acc3.amount);
		System.out.println("Account Type of acc3: " + acc3.accountType);
	}
}
