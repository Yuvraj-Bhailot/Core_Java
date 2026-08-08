package extra.collections;

/* # Characteristics of TreeSet :- 
 * -	The element in the TreeSet will be sorted by default.
 * -	The element which has to be added into the set should be of comparable type same type or homogenous.
 * -	In case if we try to add the heterogeneous element we get ClassCastException
 * */

import java.util.TreeSet;

public class CreatingTreeSet {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(6);
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(3);
		
		
		System.out.println("treeSet: ");
		System.out.println(treeSet);
	}
}
