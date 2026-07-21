package season1.operator;

public class AssignmentOperator {
	public static void main(String[] args) {
		// Assignment operator
		int a=10; // assign value
		System.out.println("a value: "+a);
		
		a+=5; // a=a+5; --> 10+5
		System.out.println("a value += : "+a);
		
		a-=10; // a=a-10; --> 15-10
		System.out.println("a value -= : "+a);
		
		a*=10; // a=a*10; --> 5*10
		System.out.println("a value *= : "+a);
		
		a/=5; // a=a/5; --> 50/5
		System.out.println("a value /= : "+a);
		
		a%=3; // a=a%3; --> 10%3
		System.out.println("a value %= : "+a);
	}
}
