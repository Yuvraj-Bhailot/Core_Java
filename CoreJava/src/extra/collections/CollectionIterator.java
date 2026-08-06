package extra.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// access collection

public class CollectionIterator {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		// iterator can travel only one way
		Iterator itArr = arr.iterator();

		System.out.println("Using Iterator: ");
		while (itArr.hasNext()) {
			System.out.print(itArr.next() + " ");
		}

		System.out.println("\n-------------------------");

		ListIterator listIt = arr.listIterator();

		System.out.println("Using List Iterator: ");
		while (listIt.hasNext()) {
			System.out.print(listIt.next() + " ");
		}

		System.out.println("\nReverse order using List Iterator: ");
		while (listIt.hasPrevious()) {
			System.out.print(listIt.previous() + " ");
		}

		System.out.println("\n-------------------------");

		System.out.println("Using for each loop: ");
		for (Integer element : arr) {
			System.out.print(element + " ");
		}

		System.out.println("\n-------------------------");

		System.out.println("Converting arraylist into array: ");
		Object[] arr2 = arr.toArray();

		for (Object ele : arr2) {
			System.out.print(ele + " ");
		}
	}
}
