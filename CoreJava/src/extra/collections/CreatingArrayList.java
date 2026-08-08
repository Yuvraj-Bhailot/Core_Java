package extra.collections;

/* ArrayList is an implementing class of list interface.
 * It is defined in java.util package.
 * The characteristics of ArrayList is exactly same as List interface.
 * */

import java.util.ArrayList;

public class CreatingArrayList {
	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		
		arrList.add(15);
		arrList.add("Hello");
		arrList.add('B');
		arrList.add(637454.154);
		arrList.add(true);
		arrList.add(324);
		arrList.add("Java");
		
		System.out.println("arrList: ");
		System.out.println(arrList);		
	}
}
