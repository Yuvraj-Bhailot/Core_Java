package season1;

public class VariableAndDatatype {
	public static void main(String[] args) {
		// primitive data types
		// data type varName = value/literal;
		byte b=10; // size 1 byte
		short s=14325; // size 2 byte
		int i=23423543; // size 4 byte
		long l=234782634784l; // size 8 byte
		float f=2445.45f; // size 4 byte
		double d=324.5464557; // size 8 byte
		char c='A'; // size 2 byte
		boolean bo=true; // size 1 bit
		
		System.out.println("b is byte type of data with value: " + b);
		System.out.println("s is short type of data with value: " + s);
		System.out.println("i is int type of data with value: " + i);
		System.out.println("l is long type of data with value: " + l);
		System.out.println("f is float type of data with value: " + f);
		System.out.println("d is double type of data with value: " + d);
		System.out.println("c is char type of data with value: " + c);
		System.out.println("bo is boolean type of data with value: " + bo);
		
		// non primitive data type
		String str="Hello World!!"; 
		
		System.out.println("str is string type of data with value: " + str);
	}
}
