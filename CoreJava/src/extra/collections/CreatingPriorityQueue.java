package extra.collections;

/* # Priority Queue<C>
 * -	Priority Queue is implementing class of Queue interface.
 * -	Insertion order not maintain.
 * -	It is unordered collection
 * -	Only homogeneous elements are allowed.
 * -	If we add heterogeneous elements we will get ClassCastException.
 * -	Duplicates are allowed.
 * */

import java.util.PriorityQueue;

public class CreatingPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		
		queue.add(10);
		queue.add(30);
		queue.add(20);
		queue.add(50);
		queue.add(40);
		
		System.out.println("queue: ");
		System.out.println(queue);
	}
}
