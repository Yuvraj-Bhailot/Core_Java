package extra.collections;

import java.util.ArrayList;

/* Collection framework is a group of classes and interface 
 * which provide the mechanism to store the 
 * group of objects and elements together.
 * using collection we can perform all kind of curd operations.
 * */

public class CollectionMethods {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		// add(): use to add element
		arr.add(10);
		arr.add('F');
		arr.add(true);
		arr.add("Hello");
		arr.add(3654.15);

		// we can directly print the array
		System.out.println(arr);

		// get(): to get element at specific index
		System.out.println("Element at 2: " + arr.get(2));

		// size(): return size of array list
		System.out.println("Size of arraylist: " + arr.size());

		// isEmpty(): to check if array list is empty
		System.out.println("Is arr Empty: " + arr.isEmpty());

		// contains(): to check if element is present in array list
		System.out.println("Is 25 present in arr: " + arr.contains(25));
		System.out.println("Is Hello present in arr: " + arr.contains("Hello"));

		// indexOf(): to find index of element
		System.out.println("Index of 3654.15: " + arr.indexOf(3654.15));

		System.out.println("----------------------------------");

		ArrayList arr2 = new ArrayList();

		arr2.add(20);
		arr2.add(false);
		arr2.add("Hello");

		arr.add(arr2);
		System.out.println("Adding collection using add():\n" + arr);

		// remove()
		arr.remove(arr2);
		System.out.println("Removing collection using remove():\n" + arr);

		arr.remove(4);
		System.out.println("Removing 4th element from arr: " + arr);

		arr.remove((Character) 'F');
		System.out.println("Removing F from arr: " + arr);

		System.out.println("----------------------------------");

		// retainAll(): return common element
		arr.retainAll(arr2);
		System.out.println("Common element in arr and arr2: " + arr);

		// addAll()
		arr.addAll(arr2);
		System.out.println("Adding collection using addAll():\n" + arr);

		// removeAll()
		arr.removeAll(arr2);
		System.out.println("Removing collection using removeAll():\n" + arr);

		System.out.println("----------------------------------");

		System.out.println("arr2: " + arr2);
		arr2.clear();
		System.out.println("arr2 after clear(): " + arr2);
	}
}
