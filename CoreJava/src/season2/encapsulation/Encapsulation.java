package season2.encapsulation;

/* Encapsulation means binding state and behavior.
 * It's advantage is data hiding.
 * */

class BankDetail {
	String bankName;
	// data hiding
	private int bankCode;
	private String bankAccessPin = "IDB1146";

	// setter method
	public void setBankCode(int code) {
		bankCode = code;
	}

	// getter method
	public int getBankCode() {
		return bankCode;
	}

	public String getBankAP() {
		return bankAccessPin;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		BankDetail idb = new BankDetail();

		idb.bankName = "IDB"; // non static member can directly be used
		idb.setBankCode(1243); // private member can't directly be used

		System.out.println("Bank name: " + idb.bankName);
		System.out.println("Bank code: " + idb.getBankCode());
		System.out.println("Bank access pin: " + idb.getBankAP());
	}
}
