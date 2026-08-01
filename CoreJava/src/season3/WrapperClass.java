package season3;

/* A wrapper class in Java is a final, immutable class 
 * that converts a primitive data type into its corresponding object representation
 * */

public class WrapperClass {
	public static void main(String[] args) {
		// Wrapper class
		Byte b = 10;
		Short s = 1486;
		Integer i = 453164;
		Long l = 786345264238l;
		Float f = 6354.64f;
		Double d = 213423.546;
		Character c = 'A';
		Boolean bo = true;

		System.out.println("Byte value: " + b);
		System.out.println("Short value: " + s);
		System.out.println("Integer value: " + i);
		System.out.println("Long value: " + l);
		System.out.println("Float value: " + f);
		System.out.println("Double value: " + d);
		System.out.println("Character value: " + c);
		System.out.println("Boolean value: " + bo);

		System.out.println("-----------------------------------");

		// boxing
		int num = 2543;
		Integer num1 = Integer.valueOf(num);
		Integer num2 = Integer.valueOf("2543");

		System.out.println("int value: " + num);
		System.out.println("Integer(int) value: " + num1);
		System.out.println("Integer(String) value: " + num2);

		char ch = 'S';
		Character ch1 = Character.valueOf(ch);

		System.out.println("char value: " + ch);
		System.out.println("Character value: " + ch1);

		System.out.println("-----------------------------------");

		// Unboxing
		Boolean bo1 = true;
		boolean bo2 = bo1.booleanValue();

		System.out.println("Boolean value: " + bo1);
		System.out.println("boolean value: " + bo2);

		System.out.println("-----------------------------------");

		// parse(): This method is used to convert the String to primitive datatype
		// we have parse() for every wrapper class except Character

		double numDou = Double.parseDouble("5454.16587");
		boolean boolVal = Boolean.parseBoolean("false");

		System.out.println("numDou value: " + numDou);
		System.out.println("boolVal value: " + boolVal);
	}
}
