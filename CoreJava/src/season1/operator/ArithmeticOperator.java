package season1.operator;

public class ArithmeticOperator {
	public static void main(String[] args) {
		//Arithmetic or mathematical operators
		
		int num1=20; // Change values and datatypes for better understanding 
		int num2=5;
		
		int result; // also change the datatype for result if above datatype is changed
		
		//Addition
		result=num1+num2;
		System.out.println("Addition of num1("+num1+") and num2("+num2+") is: "+result);
		
		//Concatenation
		System.out.println("Concating two strings. " + "+ symbol also works as concatenation operator.");
		
		//Subtraction
		result=num1-num2;
		System.out.println("Subtraction of num1("+num1+") and num2("+num2+") is: "+result);
		
		//Multiplication
		result=num1*num2;
		System.out.println("Multiplication of num1("+num1+") and num2("+num2+") is: "+result);
		
		//Devision
		result=num1/num2;
		System.out.println("Devision of num1("+num1+") and num2("+num2+") is: "+result);
		
		//Modulus, it returns remainder
		result=num1%num2;
		System.out.println("Modulus of num1("+num1+") and num2("+num2+") is: "+result);
	}
}
