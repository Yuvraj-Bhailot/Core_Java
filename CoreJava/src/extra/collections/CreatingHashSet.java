package extra.collections;

/* # characteristics of HashSet :- 
 * -	No duplicate.
 * -	No multiple null value.
 * -	Unordered collection.
 * -	No index value.
 * -	No insertion order.
 * */

import java.util.HashSet;

public class CreatingHashSet {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		hashSet.add("One");
		hashSet.add(934);
		hashSet.add(true);
		hashSet.add('F');
		hashSet.add("Piece");
		
		System.out.println("hashSet: ");
		System.out.println(hashSet);
	}
}
