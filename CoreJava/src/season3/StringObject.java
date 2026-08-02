package season3;

/* We can store the String literals 
 * by creating object for the java.lang.String class
 * */

public class StringObject {
	public static void main(String[] args) {
		// declaring String object and initializing
		String str1 = "hello";
		String str2 = new String("BYE");

		System.out.println("str1 value: " + str1);
		System.out.println("str2 value: " + str2);

		System.out.println("------------------------");

		// String class consist of many method
		// toUpperCase()
		System.out.println("toUpperCase(): " + str1.toUpperCase());

		// toLowerCase()
		System.out.println("toLowerCase(): " + str2.toLowerCase());

		// concat(String s)
		System.out.println("\nconcat(String  s): " + str1.concat(" Java"));
		System.out.println("concat(String  s): " + str1.concat(str2));

		// isEmpty(), isBlank()
		str1 = " ";
		str2 = "Hi";
		System.out.println("\nstr1 isEmpty(): " + str1.isEmpty());
		System.out.println("str1 isBlank(): " + str1.isBlank());
		System.out.println("str2 isEmpty(): " + str2.isEmpty());
		System.out.println("str2 isBlank(): " + str2.isBlank());

		// trim()
		str1 = "     kuchu puchu      ";
		System.out.println("\nwithout trim(): " + str1);
		System.out.println("trim(): " + str1.trim());

		// substring(int index), substring(int start,int end)
		str1 = "Kuchu puchu coding karo!!";
		System.out.println("\nsubString(12): " + str1.substring(12));
		System.out.println("subString(0, 11): " + str1.substring(0, 11));

		// charAt(int index)
		System.out.println("\ncharAt(10): " + str1.charAt(10));

		// indexOf(Char ch)
		str1 = "meoww";
		System.out.println("\nindexOf('e'): " + str1.indexOf('e'));
		System.out.println("indexOf('w'): " + str1.indexOf('w'));

		// lastIndexOf(char ch)
		System.out.println("\nlastIndexOf('w'): " + str1.lastIndexOf('w'));

		// length()
		System.out.println("\nlength(): " + str1.length());

		// equals(Object o), equalsignoreCase(Object o)
		str1 = "Yo";
		str2 = "yo";
		System.out.println("\nequals(Object o): " + str1.equals(str2));
		System.out.println("equalsIgnoreCase(Object o): " + str1.equalsIgnoreCase(str2));

		// contains(String s)
		str1 = "Melody";
		System.out.println("\ncontains(\"o\"): " + str1.contains("o"));

		// tocharArray(String s)
		char[] ch = str1.toCharArray();
		System.out.print("\ntocharArray(), ch value: ");
		System.out.println(ch);
	}
}